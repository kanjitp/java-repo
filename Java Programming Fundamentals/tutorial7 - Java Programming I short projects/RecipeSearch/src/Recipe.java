import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    // Accessor
    public int getCookingTime() {return this.cookingTime;}
    public String getName() {return this.name;}
    public ArrayList<String> getIngredients() {return this.ingredients;}

    public void printIngredients() {
        for (String ingredient : this.ingredients) {
            System.out.println(ingredient);
        }
    }
    // Method
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

    
}
