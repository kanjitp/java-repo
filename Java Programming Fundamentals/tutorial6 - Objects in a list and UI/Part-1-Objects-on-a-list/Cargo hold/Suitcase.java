import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item existingItem : items) {
            totalWeight += existingItem.getWeight();
        }
        if (item.getWeight() <= maxWeight - totalWeight)
            this.items.add(item);
    }
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Item existingItem : items) {
            totalWeight += existingItem.getWeight();
        }
        return totalWeight;
    }
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight())
                heaviestItem = item;
        }
        return heaviestItem;

    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Item existingItem : items) {
            totalWeight += existingItem.getWeight();
        }
        String itemPhrase = "";
        if (this.items.size() == 0) {
            itemPhrase = "no items";
        } else if (this.items.size() == 1) {
            itemPhrase = "1 item";
        } else {
            itemPhrase = this.items.size() + " items";
        }
        return  itemPhrase + " (" + totalWeight + " kg)";
    }

    
}
