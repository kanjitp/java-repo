import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
        Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);

        Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
        System.out.println(alice);

    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
