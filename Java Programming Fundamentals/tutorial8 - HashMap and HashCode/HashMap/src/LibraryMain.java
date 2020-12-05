import java.util.*;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The wrinkle in time", 1999, "...");
        Book book2 = new Book("A brief history of time", 2017, "...");
        Book book3 = new Book("The time we are together", 2020, "...");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        ArrayList<Book> books = library.getBookByPart("time");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
}
