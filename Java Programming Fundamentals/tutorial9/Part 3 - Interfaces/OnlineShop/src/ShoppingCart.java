import java.util.HashMap;

public class ShoppingCart {

    private HashMap<String, Item> contents;

    public ShoppingCart() {
        this.contents = new HashMap<>();
    }
    public void add(String product, int price) {
        if (!(contents.containsKey(product))) {
            this.contents.put(product, new Item(product, 1, price));
        } else {
            this.contents.get(product).increaseQuantity();
        }

    }
       

    public int price() {
        int sum = 0;
        for (String item : contents.keySet()) {
            sum += contents.get(item).price();
        }
        return sum;
    }

    public void print() {
        for (String item : contents.keySet()) {
            System.out.println(contents.get(item));
        }
    }
    
}
