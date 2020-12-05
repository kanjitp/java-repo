import java.util.*;
public class Main {
    public static void main(String[] args) {
        LiquidContainers first = new LiquidContainers("First", 100);
        LiquidContainers second = new LiquidContainers("Second", 100);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(first);
            System.out.println(second);
            String input = scan.nextLine();
            if (input.equals("quit")) break;
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                case "remove":
                    first.remove(amount);
                    break;
                case "move":
                    first.move(second, amount);
                    break;
                default:
                    break;
            }
        }
        



    }
    
}
