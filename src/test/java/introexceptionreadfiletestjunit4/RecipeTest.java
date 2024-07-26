package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RecipeTest {

    @Test
    public void getIngredients() {
        Recipe recipe = new Recipe();
        recipe.addIngredients(Path.of("src/test/resources/recipe.txt"));
        List<String> ingredients = recipe.getIngredients();
        List<String> expected = Arrays.asList("liszt", "margarin", "kristálycukor", "tojás","citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj");
        assertEquals(expected, ingredients);

    }
}