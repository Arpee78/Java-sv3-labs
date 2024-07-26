package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void getFirstWordWithA() {
        Words words = new Words();
        String word = words.getFirstWordWithA(Path.of("src/test/resources/words.txt"));
        assertEquals("Anna", word);
    }

    @Test
    public void getFirstWordWithAFalse() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Path.of("src/test/resources/words_.txt")));
        assertEquals("Cannot read file!", exception.getMessage());
    }

    @Test
    public void getFirstWordWithoutA() {
        Words words = new Words();
        String word = words.getFirstWordWithA(Path.of("src/test/resources/wordsWithoutA.txt"));
        assertEquals("A", word);
    }
}