import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends: ");
            String decision = sc.nextLine();
            if (decision.equals("quit"))
                break;

            System.out.print("Input first name: ");
            String firstName = sc.nextLine();
            System.out.print("Input last name: ");
            String lastName = sc.nextLine();
            System.out.print("Input the year of birth: ");
            int yearOfBirth = Integer.valueOf(sc.nextLine());

            persons.add(new Person(firstName, lastName, yearOfBirth));
            System.out.println();
        }

        System.out.println("\nUnique last names in alphabetical order: ");
        ArrayList<String> arrangedLastName = persons.stream()
                                                        .map(person -> person.getLastName())
                                                            .sorted()
                                                                .collect(Collectors.toCollection(ArrayList::new));
        arrangedLastName.stream().forEach(lastName -> System.out.println(lastName));
        
    }

}
