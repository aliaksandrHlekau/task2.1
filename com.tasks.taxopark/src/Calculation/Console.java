package Calculation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Aliaksandr_Hlekau on 4/23/2017.
 */
public class Console {
    public static Map<String, Integer> readFromConsole()
    {
        System.out.printf("Select cars: \n" + "1. Geely SC4\n" + "2. Smart ForTwo\n" + "3. Hyundai Starex\n" + "4. Mercedes S-klasse\n" + "5. Toyota Prius\n");


        Map<String, Integer> park = new HashMap<String, Integer>();

        String answer;

        do {
            Scanner in = new Scanner(System.in);
            System.out.printf("Enter the type of the car needed:\n");
            String name = in.nextLine();
            System.out.printf("Enter the number of the cars \n");
            int number = in.nextInt();
            park.put(name, number);

            System.out.print("Would you like to add one more (y/n)?");
            answer = in.next();
            if (answer.equals("y") || answer.equals("Y")) {
                continue;
            } else {
                in.close();
                break;
            }

        } while (true);

        return park;
    }
}
