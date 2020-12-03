import java.util.ArrayList;
import java.util.HashMap;

public class BookMain {
    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1911, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "...");

        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        Book book = directory.get("Persuasion");
        System.out.println(book + "\n");
        book = directory.get("Pride and Prejudice");
        System.out.println(book);

        ArrayList<Book> books = new ArrayList<>();
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);
        long start = System.nanoTime();
        System.out.println(directory.get("Sense and Sensibility"));
        long end = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end - start) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");
        
    }

    public static Book get(ArrayList<Book> books, String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

}
