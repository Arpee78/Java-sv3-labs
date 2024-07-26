package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path) {
        List<String> recipe;
        try {
            recipe = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
        ingredients.addAll(getIngFromRecipe(recipe));
    }


    private List<String> getIngFromRecipe(List<String> recipe) {

        List<String> ingredients = new ArrayList<>();

        for (int i = 2; i < recipe.size(); i++) {
            ingredients.add(recipe.get(i).split(" ")[2]);
        }

        return ingredients;
    }
}
