import java.util.Scanner;

public class waitForInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first string: ");
        String first = sc.nextLine();
        System.out.println("Write the second stirng: ");
        String second = sc.nextLine();
        System.out.println("Write the third string: ");
        String third = sc.nextLine();

        System.out.println("You wrote ");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }    
}
