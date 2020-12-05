
import java.util.*;

public class Items {

    String name;
    Date timeOfCreation;

    // Constructor
    public Items() {
        this.name = "";
        this.timeOfCreation = new java.util.Date();
    }
    public Items(String name) {
        this.name = name;
        this.timeOfCreation = new java.util.Date();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + " (created at: " + this.timeOfCreation + ")";
    }

    
}
