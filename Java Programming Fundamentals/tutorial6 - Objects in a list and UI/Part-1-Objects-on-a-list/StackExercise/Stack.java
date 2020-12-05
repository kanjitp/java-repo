import java.util.*;
public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return values.size() == 0;
    }
    public void add(String value) {
        this.values.add(value);
    }
    public ArrayList<String> values() {
        return this.values;
    }
    public String take() {
        String temp = this.values.get(values.size() - 1);
        this.values.remove(temp);
        return temp;
    }

}
