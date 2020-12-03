import java.util.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("File to read: ");
            String fileName = userInput.nextLine();
            RecipeSearcher scanner = new RecipeSearcher(new Scanner(Paths.get(fileName)));
            System.out.println("Commands:" + "\nlist - lists the recipes" + "\nstop - stops the program"
                    + "\nfind name - searches recipes by name"
                    + "\nfind cooking time - searches recipes by cooking time"
                    + "\nfind ingredient - searches recipes by ingredient");
            System.out.println();
            while (true) {
                System.out.print("Enter command: ");
                String command = userInput.nextLine();
                if (command.equals("stop"))
                    break;
                switch (command) {
                    case "list":
                        System.out.println();
                        scanner.list();
                        break;
                    case "find name":
                        System.out.print("Seached word: ");
                        String searchedWord = userInput.nextLine();
                        System.out.println();
                        scanner.find_Name(searchedWord);
                        break;
                    case "find cooking time":
                        System.out.print("Max cooking time: ");
                        int maxCookingTime = Integer.valueOf(userInput.nextLine());
                        System.out.println();
                        scanner.find_cooking_time(maxCookingTime);
                        break;
                    case "find ingredient":
                        System.out.print("Ingredient: ");
                        String ingredient = userInput.nextLine();
                        System.out.println();
                        scanner.find_ingredient(ingredient);
                        break;
                    default:
                        System.out.println("Commands:" + "\nlist - lists the recipes" + "\nstop - stops the program"
                                + "\nfind name - searches recipes by name"
                                + "\nfind cooking time - searches recipes by cooking time"
                                + "\nfind ingredient - searches recipes by ingredient");
                        break;
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
