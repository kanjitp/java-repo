import java.util.*;

public class itemsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();
        while (true) {
            System.out.printf("Name: ");
            String input = sc.nextLine();
            // remember to use equals because string is a Class
            if (input.equals("")) break;
            items.add(new Items(input));
        }

        for (Items item : items) {
            System.out.println(item);
        }
    }
    
}
