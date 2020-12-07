import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Book> books = new ArrayList<>();
    public static void main(String[] args) {
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) break;
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            Book book = new Book(input, age);
            books.add(book);
            System.out.println();
        }

        System.out.println(books.size() + " books in total.\n\nBooks:");
        books.stream().sorted().forEach(book -> System.out.println(book));

    }
    
}
