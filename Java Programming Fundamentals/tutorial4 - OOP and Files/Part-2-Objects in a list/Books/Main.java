import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        while(true) {
            System.out.printf("Title: ");
            String title = sc.nextLine();
            if (title.isEmpty()) break;
            System.out.printf("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            System.out.printf("Publication year: ");
            int publicationYear = Integer.valueOf(sc.nextLine());
            books.add(new Books(title, pages, publicationYear));
        }

        System.out.println();

        System.out.printf("What information will be printed? ");
        String input = sc.nextLine();
        if (input.equals("everything")) {
            for (Books book : books) {
                System.out.println(book);
            }
        } else if (input.equals("name")) {
            for (Books book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
