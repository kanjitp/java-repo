import java.util.Scanner;
import java.nio.file.Paths;

public class Files {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(Paths.get("plist.xml"));
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
