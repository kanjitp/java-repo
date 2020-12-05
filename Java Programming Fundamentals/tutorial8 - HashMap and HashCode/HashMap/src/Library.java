import java.util.*;
public class Library {

    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = sanitizedString(book.getName());
        if (name == null) {
            name = "";
        }
        name = name.toLowerCase();
        name = name.trim();

        if (this.directory.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            directory.put(name, book);
        }
        
    }
    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        if (this.directory.containsKey(bookTitle)) {
            this.directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }
    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return this.directory.get(bookTitle);
    }
    public static String sanitizedString(String str) {
        if (str == null) return "";
        return str.toLowerCase().trim();
    }
    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);
        ArrayList<Book> books = new ArrayList<>();
        for (String bookTitle : this.directory.keySet()) {
            if(!bookTitle.contains(titlePart)) {
                continue;
            }
            books.add(this.directory.get(bookTitle));
        }
        return books;
    }
    
}
