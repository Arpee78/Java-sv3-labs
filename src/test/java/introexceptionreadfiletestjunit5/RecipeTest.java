package introexceptionreadfiletestjunit5;

import introexceptionreadfiletestjunit4.Recipe;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void getIngredients() {
        introexceptionreadfiletestjunit4.Recipe recipe = new Recipe();
        recipe.addIngredients(Path.of("src/test/resources/recipe.txt"));
        List<String> ingredients = recipe.getIngredients();
        List<String> expected = Arrays.asList("liszt", "margarin", "kristálycukor", "tojás","citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj");
        assertEquals(expected, ingredients);
    }
}