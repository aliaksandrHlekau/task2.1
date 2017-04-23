package Calculation;

import Common.Car;

import java.util.Map;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class Taxopark {
    addTaxopark addTaxopark;

    public Taxopark() {
        addTaxopark = new addTaxopark();
    }

    public int createTaxopark(Map<String, Integer> park) {
        int allCars = 0;


        for (Map.Entry<String, Integer> entry : park.entrySet()) {
            String carName = entry.getKey();
            Integer amount = entry.getValue();


            Car car = findCar(carName);
            allCars = allCars + car.returnAmount(amount);



        }

        System.out.println("Total cost of the added cars is " + allCars);
        return allCars;

    }


    private Car findCar(String name) {
        for (Car car : addTaxopark.getCars()) {
            if (car.getName().equals(name)) {
                return car;
            }
        }
        return null;
    }
}
