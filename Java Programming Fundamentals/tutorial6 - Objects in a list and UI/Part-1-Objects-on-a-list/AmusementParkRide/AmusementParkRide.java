import java.util.*;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }
        this.visitors++;
        this.riding.add(person);
        return true;
    }

    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (Person per : riding) {
            sumOfHeights += per.getHeight();
        }

        return 1.0 * sumOfHeights / riding.size();
    }

    public Person getTallest() {

        if (this.riding.isEmpty()) {
            return null;
        }
        Person returnObject = this.riding.get(0);

        for (Person prs : this.riding) {
            if (returnObject.getHeight() < prs.getHeight()) {
                returnObject = prs;
            }
        }
        return returnObject;
    }

    public String toString() {

        String printOutput = this.name + ", minimum height requirement: " + this.minimumHeight + ", visitors: "
                + this.visitors + "\n";

        if (riding.isEmpty()) {
            return printOutput + "no one is on the ride.";
        }

        // we form a string from the people on the list
        String peopleOnRide = "";

        for (Person person : riding) {
            peopleOnRide = peopleOnRide + person.getName() + "\n";
        }

        return printOutput + "\n" + "on the ride:\n" + peopleOnRide;
    }

}
