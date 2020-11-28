import java.util.*;

public class InputSpecificFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // Read person information from the user
        System.out.println("-- Enter the person details separated by a comma, i.e.: Randall,2");
        System.out.println("Enter the details, empty will stop: ");
         while (true) {
             System.out.printf("> ");
             String details = sc.nextLine();
             if (details.isEmpty()) break;
             String[] parts = details.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            persons.add(new Person(name, age));
         }

         System.out.println();
         System.out.println("Total number of persons: " + persons.size());
         System.out.println("Persons: ");

         for (Person person: persons) {
             System.out.println(person);
         }

         

    }
    
}
