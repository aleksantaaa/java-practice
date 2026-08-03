import java.util.ArrayList;

class Recipe {

    String name;
    String ingredient;

    Recipe (String name, String ingredient) {

        this.name = name;
        this.ingredient = ingredient;
    }
}


class Cookbook {

    ArrayList<Recipe> recipes = new ArrayList<>();

    Cookbook () {}

    void addRecipe (String name, String ingredient) {

        Recipe r = new Recipe (name, ingredient);
        recipes.add(r);

    }

    void showRecipes() {

        for ( int i = 0; i < recipes.size(); i++) {
            System.out.println ( recipes.get(i).name + " - " + recipes.get(i).ingredient );
        }
    }
}

public class RecipesList {

    public static void main (String[] args) {

        Cookbook cb = new Cookbook();          // создаём МЕНЕДЖЕРА, не Recipe
        cb.addRecipe("varenyky", "milk a lot, strawberries");   // передаём просто текст
        cb.showRecipes();
    }
}







