import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // REGEX Type
        // Regular Expression
        String Studentnumber = "011889020";
        if (Studentnumber.matches("01[0-9]{7}")) { // number 0 - 9 . 7 digits
             System.out.println("Correct format");
        }

        String string = "00";
        // Alternation || vertical line
        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        }

        // Affecting parts
        String zeroOrOne = "00001";
        if (zeroOrOne.matches("0000(0|1)")) {
            System.out.println("could be either 00000 or 00001");
        }
        String car = "cars";
        if (car.matches("car(|s|)")) {
            System.out.println("car matches in singular or plural");
        }

        String vibrato = "Time tooooooooo say goodbyeyeyeyeyeyeyeyeye";
        if (vibrato.matches("Time to(o)* say goodbye(ye)+")) {
            // ()+ means repeat with that one or more times
            // ()* means repeat with 0 or more times
            System.out.println("Correct vibrato form");
        }
        // etc.
       
    }
    
}
