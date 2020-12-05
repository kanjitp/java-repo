import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));

        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages));

        for (Readable readable : readingList) {
            System.out.println(readable.read());
        }
        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");

        ArrayList<String> pages2 = new ArrayList<>();
        pages2.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
        Ebook book = new Ebook("Introduction to University Mathematics.", pages2);

        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);
    }
}
