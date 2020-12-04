import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> contents;
    private final int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.contents = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getWeight() {
        if (contents.isEmpty())
            return 0;
        int sum = 0;
        for (Item item : contents) {
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (this.getWeight() + item.getWeight() <= capacity) {
            this.contents.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (contents.isEmpty()) return false;
        for (Item itemInBox : contents) {
            if (itemInBox.equals(item))
                return true;
        }
        return false;
    }

}
