import java.util.*;

public class sumOfUserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        System.out.println("Enter numbers: ");
        int input;
        while (true) {
            input = sc.nextInt();
            if (input == -1 ) break;
            statistics.addNumber(input);
            if (input % 2 == 0) {
                evenNumbers.addNumber(input);
            } else {
                oddNumbers.addNumber(input);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
    
}
