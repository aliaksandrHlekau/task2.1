package Calculation;

import Common.Car;
import carVariants.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class addTaxopark {
    private List<Car> cars = new ArrayList<Car>();
    public addTaxopark() {

        cars.add(new GeelySC4());
        cars.add(new HyundaiStarex());
        cars.add(new MercedesS());
        cars.add(new SmartForTwo());
        cars.add(new ToyotaPrius());
    }
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
