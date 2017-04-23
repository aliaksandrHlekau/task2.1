package carVariants;

import Common.Car;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class ToyotaPrius extends Car {
    public ToyotaPrius(){
        setName("Toyota Prius");
        setPrice(37500);
        setFuelCons(4.8);
        setSeatNum(4);
    }

    public int returnAmount(int amount) {
        System.out.println(amount + " " + getName() + " are added to the park.");
        return getPrice() * amount;
    }

}
