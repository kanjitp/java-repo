import java.util.ArrayList;
public class OneItemBox extends Box{

    private ArrayList<Item> content;

    public OneItemBox() {
        this.content = new ArrayList<>(1);
    }

    @Override
    public void add(Item item) {
        if (content.isEmpty()) {
            content.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (!content.isEmpty()) {
            return content.get(0).equals(item);
        }
        return false;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return content.toString();
    }

    
}
