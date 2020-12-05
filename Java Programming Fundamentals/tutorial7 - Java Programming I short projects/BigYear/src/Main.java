import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BirdDatabase data = new BirdDatabase();
        System.out.println("== BIRD OBSERVATORY ==");
        while (true) {
            System.out.print("Enter Command: ");
            String command = sc.nextLine();
            if (command.equals("Quit")) break;
            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = sc.nextLine();
                    data.add(new Bird(name, latinName));
                    break;
                case "Observation":
                    System.out.print("Name of bird: ");
                    String name2 = sc.nextLine();
                    if (data.observation(name2)) {
                        // ADD TO DATABASE
                    } else {
                        System.out.println("Not a bird");
                    }
                    break;
                case "All":
                    System.out.println(data);
                    break;
                case "One":
                    System.out.print("Name of bird: ");
                    String name3 = sc.nextLine();
                    data.printOne(name3);
                    break;
                default:
                    break;
            }
        }
    }
    
}
