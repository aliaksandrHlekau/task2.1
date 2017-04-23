package carVariants;

import Common.Car;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class GeelySC4 extends Car {
    public GeelySC4(){
        setName("Geely SC4");
        setPrice(12500);
        setFuelCons(11.2);
        setSeatNum(4);
    }


    public int returnAmount(int amount) {
        System.out.println(amount + " " + getName() + " are added to the park.");
        return getPrice() * amount;
    }


}
