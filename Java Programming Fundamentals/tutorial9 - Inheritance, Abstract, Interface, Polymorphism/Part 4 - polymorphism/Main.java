import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        String string = " o ";
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTimes(string, 2);
        printer.printManyTimes(words, 3);

        Serializable serializableString = "string";
        CharSequence charSequenceString = "string";
        Comparable<String> comparableString = "string";

        String s = "works";
        // printer.printCharacters(serializableString);
        printer.printCharacters(charSequenceString);
        // printer.printCharacters(comparableString);
        printer.printCharacters(s);
    }

}
