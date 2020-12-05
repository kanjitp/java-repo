import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //while loop

        // while(false) {
        //     System.out.println("This block is unreachable" +
        //          "which makes the compiler returns error");
        // }

        int number = 1;
        while (true) {
            System.out.println(number);
            if(number >= 5) {
                break;                      // exiting the loop
            }
            number ++;
        }

        // Interaction with user input
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Exit? (y exits)");
            String input = sc.nextLine();
            if (input.equals("y")) {
                break;
            }

            System.out.println("Ok! Let's carry on!");
        }
        System.out.println("Ready");

        // Returning to the start of the loop
        while(true) {
            System.out.println("Insert a positive integers");
            int number2 = Integer.valueOf(sc.nextLine());

            if(number2 <= 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }
            System.out.println("Your input was " + number2);
            break;
        }
        sc.close();

    }
}
