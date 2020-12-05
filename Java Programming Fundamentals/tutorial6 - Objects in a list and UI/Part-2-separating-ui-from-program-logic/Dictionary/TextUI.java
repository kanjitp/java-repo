import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.printf("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            } else if (command.equals("add")) {
                System.out.printf("Word: ");
                String word = scanner.nextLine();
                System.out.printf("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.printf("To be translated: ");
                String word = scanner.nextLine();
                if (dictionary.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(word));
                }
                
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }

}
