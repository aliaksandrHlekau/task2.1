package carVariants;

import Common.Car;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class HyundaiStarex extends Car {
    public HyundaiStarex(){
        setName("Hyundai Starex");
        setPrice(22500);
        setFuelCons(15.3);
        setSeatNum(8);
    }

    public int returnAmount(int amount) {
        System.out.println(amount + " " + getName() + " are added to the park.");
        return getPrice() * amount;
    }

}
