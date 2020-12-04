public class Item {

    private String name;
    private int weight;

    public Item(String name) {
        this(name, 0);
    }
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    // Accessor
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
    @Override
    public boolean equals(Object obj) { // not considering weight
        if (this == obj) {
            return true;
        } 
        if (!(obj instanceof Item)) {
            return false;
        }
        Item itemObj = (Item) obj;
        if (itemObj.name == this.name) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.weight + ")";
    }
}
