import java.util.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //Scanner on keyboard input
        Scanner kbScanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = kbScanner.nextLine();
        // Scanner on file
        // check that path exist
        try (Scanner testFileScanner = new Scanner(Paths.get(fileName))) {
            // Actual Scanner
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while (true) {
                System.out.println("Enter names, an empty line quits.");
                String input = kbScanner.nextLine();
                if (input.equals("")) break;
                if (contains(fileScanner, input)) {
                    System.out.println("The name is on the list.");
                } else {
                    System.out.println("The name is not on the list");
                }
                //refresh the fileScanner from line one
                fileScanner = new Scanner(Paths.get(fileName));
            }
            System.out.println();
            System.out.println("Thank you!");
            kbScanner.close();
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static boolean contains(Scanner fileScanner, String name) {
        while (fileScanner.hasNextLine()) {
            String row = fileScanner.nextLine();
            if (row.contains(name)) return true;
        }
        return false;
    }
    
}
