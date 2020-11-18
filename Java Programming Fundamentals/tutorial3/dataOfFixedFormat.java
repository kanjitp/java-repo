import java.util.*;

public class dataOfFixedFormat {
    public static void main(String[] args) {
        /*
         * This unit is particularly useful in handling data that adheres to some
         * predefined format. An example of this is the comma-separated values(csv)
         * format
         */

        Scanner reader = new Scanner(System.in);
        int sumAge = 0;
        int count = 0;
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            count++;
            String[] pieces = input.split(",");
            sumAge += Integer.valueOf(pieces[1]);
            System.out.println("Name: " + pieces[0] + ", age: " + pieces[1]);
        }
    
        if (count > 0) {
            System.out.println("Sum of the ages is " + sumAge);
            System.out.println("Age average: " + (1.0 * sumAge / count));
        } else {
            System.out.println("-- no Input detected");
        }
        reader.close();
    }

}
