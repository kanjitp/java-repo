import java.util.Scanner; 

public class abstractClass {

    public static void main(String[] args) {
        // abstract class combines interfaces and inheritance
        UserInterface userInterface = new UserInterface(new Scanner(System.in));
        userInterface.addOperation(new PlusOperation());

        userInterface.start();

    }

}
