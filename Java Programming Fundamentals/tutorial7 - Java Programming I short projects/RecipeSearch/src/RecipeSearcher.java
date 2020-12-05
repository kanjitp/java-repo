import java.util.*;
import java.nio.file.Paths;

public class RecipeSearcher {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public RecipeSearcher(Scanner sc) {
        this.scanner = sc;
        this.recipes = getRecipe();
    }

    public RecipeSearcher(String fileName) {
        try {
            this.scanner = new Scanner(Paths.get(fileName));
            this.recipes = getRecipe();
            System.out.println("Scanner created sucessfully **");
        } catch (Exception e) {
            System.out.println("RecipeSearcher Error: " + e.getMessage());
        }

    }

    // Methods
    public void list() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void find_Name(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void find_cooking_time(int maxCookingTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void find_ingredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

    public ArrayList<Recipe> getRecipe() {
        ArrayList<Recipe> recipes = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            int cookingTime = Integer.valueOf(scanner.nextLine());
            ArrayList<String> ingredients = new ArrayList<>();
            while (true) {
                String ingredient = scanner.nextLine();
                if (!ingredient.equals("")) {
                    ingredients.add(ingredient);
                } else {
                    recipes.add(new Recipe(name, cookingTime, ingredients));
                    break;
                }
            }
        }
        return recipes;
    }

    public static void main(String[] args) {
        // FOR TESTING
        try {
            Scanner scanner = new Scanner(Paths.get("recipes.txt"));
            // making ArrayList<Recipe> recipes within main
            ArrayList<Recipe> recipes = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (true) {
                    String ingredient = scanner.nextLine();
                    if (!ingredient.equals("")) {
                        ingredients.add(ingredient);
                    } else {
                        recipes.add(new Recipe(name, cookingTime, ingredients));
                        break;
                    }
                }
            }
            // Start testing here

        } catch (Exception e) {
            System.out.println("RecipeSearcherError: " + e.getMessage());
        }

    }

}
