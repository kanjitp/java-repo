package library; 
// define the package you would like to oput in / create within this folder
import library.domain.Book;

public class Program {
    // use command "javac -d . fileName.java"
    
    public static void main(String[] args) {
        Book book = new Book("the ABCs of packages!");
        System.out.println("Hello packageworld: " + book.getName());

    }
}
