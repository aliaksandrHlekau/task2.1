import Calculation.Console;
import Calculation.Taxopark;

import java.util.Map;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class Main {

    public static void main (String[] args){
        Map<String, Integer> park;
        Taxopark taxopark = new Taxopark();
        park = Console.readFromConsole();
        taxopark.createTaxopark(park);
    }
}
