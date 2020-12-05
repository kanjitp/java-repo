import java.util.*;

public class ObjectOrientedProgIntro {
    public static void main(String[] args) {
        /*
         * ArrayList - class integers - object (instantiated when it is assigned a new
         * object of class ArrayList<>)
         * 
         * Person -class -- look up in the same folder ada, antti, martin - object
         */
        ArrayList<Integer> integers = new ArrayList<>();

        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");

        int i = 0;
        while (i < 30) { // increment Pekka's age till she is 30
            pekka.growOlder();
            i = i + 1;
        }
        

        int j = 0; 
        while(j < 17) {
            antti.growOlder();
            j = j + 1;
        }

        System.out.println("-- Profiles: ");

        antti.printPerson();
        pekka.printPerson();

        System.out.println("-- Status: ");

        if (antti.isOfLegalAge()) {
            System.out.println(antti.getName() + " is of legal age");
        } else {
            System.out.println(antti.getName() + " is underage");
        }

        if (pekka.isOfLegalAge()) {
            System.out.println(pekka.getName() + " is of legal age");
        } else {
            System.out.println(pekka.getName() + " is underage ");
        }
        
        pekka.setHeight(180);
        pekka.setWeight(86);

        antti.setHeight(175);
        antti.setWeight(64);

        System.out.println(pekka.getName() + ", body mass index is " + pekka.bodyMassIndex());
        System.out.println(antti.getName() + ", body mass index is " + antti.bodyMassIndex());

        System.out.println("-- System.out.println(pekka): ");
        System.out.println(pekka);

        System.out.println("-- System.out.println(pekka.toString()): ");
        System.out.println(pekka.toString());

    }

}
