import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> units;

    public Herd() {
        this.units = new ArrayList<>();
    }
    public void addToHerd(Movable movable) {
        units.add(movable);
    }
    public void move(int dx, int dy) {
        for (Movable movable : units) {
            movable.move(dx, dy);
        }
    }
    public String toString() {
        String s = "";
        for (Movable movable : units) {
            s += movable.toString() + "\n";
        }
        return s;
    }
    
}
