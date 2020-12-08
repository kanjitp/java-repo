import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (this.hideout.isEmpty()) {
            this.hideout.add(toHide);
        } else {
            this.hideout.remove(0);
            this.hideout.add(toHide);
        }
    }

    public T takeFromHideout() {
        if (!this.hideout.isEmpty()) {
            T item = hideout.get(0);
            hideout.remove(item);
            return item;
        } else {
            return null;
        }
    }
    public boolean isInHideout() {
        return !this.hideout.isEmpty();
    }




    
}
