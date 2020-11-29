import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> archive = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = sc.nextLine();
            if (id.equals("")) break;
            System.out.println("Name? (empty will stop)");
            String name = sc.nextLine();
            if (name.equals("")) break;
            Item item = new Item(id, name);
            if (!containIn(archive, item)) {
                archive.add(item);
            }
        }
        System.out.println();
        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item.id + " : " + item.name);
        }

    }
    public static boolean sameId(Item item1, Item item2) {
        return item1.id.equals(item2.id);
    }
    public static boolean containIn(ArrayList<Item> archive, Item item) {
        int i = 0;
        while (i < archive.size()) {
            if (sameId(archive.get(i), item)){
                return true;
            }
            System.out.println("i:"  + i);
            i ++;
        }
        return false;
    }
    
}
