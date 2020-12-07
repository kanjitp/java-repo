import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        List<Person> presidents = read("textfile.txt");
        for (Person person : presidents) {
            System.out.println(person);
        }
    }

    public static List<Person> read(String file) {
        List<Person> presidents = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                .map(row -> row.split("; ")).filter(parts -> parts.length >= 2)
                    .map(parts -> new Person(parts[0], Integer.valueOf(parts[1])))
                        .forEach(person -> presidents.add(person));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return presidents;
    }

}
