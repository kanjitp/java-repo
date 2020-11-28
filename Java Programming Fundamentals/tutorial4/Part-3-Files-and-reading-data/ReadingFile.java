import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

//using paths
// import java.nio.file.Paths;

public class ReadingFile {
    public static void main(String[] args) {
        // replace new File("file.txt") with Paths.get("file.txt") for using Paths library
        try (Scanner scanner = new Scanner(new File("file.txt"))) {
            System.out.println("FILE FOUND");
            System.out.println("-- READING --");
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
            System.out.println("-- ENDFILE --");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
