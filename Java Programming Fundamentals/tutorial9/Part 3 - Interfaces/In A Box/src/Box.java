import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private double weight;
    private ArrayList<Packable> contents;

    public Box(double capacity) {
        this.capacity = capacity;
        this.weight = 0;
        this.contents = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight + packable.weight() <= this.capacity) {
            this.contents.add(packable);
            this.weight += packable.weight();
        }
    }

    public double weight() {
        return this.weight;
    }


    @Override
    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + this.weight + " kg";
    }

}
