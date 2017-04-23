package carVariants;

import Common.Car;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class MercedesS extends Car {
    public MercedesS(){
        setName("Mercedes S-klasse");
        setPrice(60000);
        setFuelCons(13.7);
        setSeatNum(4);
    }

    public int returnAmount(int amount) {
        System.out.println(amount + " " + getName() + " are added to the park.");
        return getPrice() * amount;
    }

}
