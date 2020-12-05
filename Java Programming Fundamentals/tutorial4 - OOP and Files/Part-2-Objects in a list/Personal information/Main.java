import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PersonalInformationCollection> lists = new ArrayList<>();
        while (true) {
            System.out.printf("First name: ");
            String firstName = sc.nextLine();
            if (firstName.equals("")) break; 
            System.out.printf("Last name: ");
            String lastName = sc.nextLine();
            if (lastName.equals("")) break;
            System.out.printf("Identification number: ");
            String id = sc.nextLine();
            if(id.equals("")) break;
            lists.add(new PersonalInformationCollection(firstName, lastName, id));
        }
        System.out.println();
        for (PersonalInformationCollection person : lists) {
            System.out.println(person);
        }
    }
}