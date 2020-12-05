import java.util.*;

public class ArrayListPerson {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person john = new Person("John");
        persons.add(john);

        persons.add(new Person("Matthew"));
        persons.add(new Person("Martin"));

        for (Person person : persons) {
            System.out.println(person);
        }


    }
}
