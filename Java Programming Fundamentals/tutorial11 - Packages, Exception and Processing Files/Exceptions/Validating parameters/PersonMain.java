import java.util.Scanner;

public class PersonMain {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println(new Person(name, age));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        

    }
    
}
