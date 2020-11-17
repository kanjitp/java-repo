import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        greet();
        greet(askUsername());

    }

    // void means there's no return value;
    public static void greet() {
        System.out.println("Greeting from the method world~!");
    }

    // don't forget to specify the type of parameter input
    public static void greet(String username) { // different Method Signature
        System.out.println("Greeting " + username + " from the method world~!");
    }

    public static String askUsername() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name here: ");
        String username = sc.nextLine();
        sc.close();
        return username;

    }

}
