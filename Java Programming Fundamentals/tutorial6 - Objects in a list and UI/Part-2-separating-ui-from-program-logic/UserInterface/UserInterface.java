import java.util.Scanner;

public class UserInterface{
    
    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }
    public void start() {
        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            
            if (this.wordSet.contains(word)) break;
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice");
    }

}