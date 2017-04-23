package carVariants;

import Common.Car;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class SmartForTwo extends Car {
    public SmartForTwo(){
        setName("Smart ForTwo");
        setPrice(18000);
        setFuelCons(5.2);
        setSeatNum(1);
    }

    public int returnAmount(int amount) {
        System.out.println(amount + " " + getName() + " are added to the park.");
        return getPrice() * amount;
    }

}
