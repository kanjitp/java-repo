public class Main {
    public static void main(String[] args) {
        Book bookObject = new Book("Book Object", 2000, "...");
        Book anotherBookObject = new Book("Book Object", 2000, "...");

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books aren't the same");
        }
    }

}
