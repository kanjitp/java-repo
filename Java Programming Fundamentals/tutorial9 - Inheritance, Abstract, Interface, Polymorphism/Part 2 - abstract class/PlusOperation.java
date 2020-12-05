import java.util.Scanner; 

public class PlusOperation extends Operation {

    public PlusOperation() {
        super("PlusOperation");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("First number: ");
        long first = Long.valueOf(scanner.nextLine());
        System.out.println("Second number: ");
        long second = Long.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }

}