package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void getFirstWordWithA() {
        Words words = new Words();
        String word = words.getFirstWordWithA(Path.of("src/test/resources/words.txt"));
        assertEquals("Anna", word);
    }

    @Test
    void getFirstWordWithAFalse() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                ()-> new Words().getFirstWordWithA(Path.of("src/test/resources/words_.txt")));
        assertEquals("Cannot read file!", exception.getMessage());
    }

    @Test
    void getFirstWordWithoutA() {
        Words words = new Words();
        String word = words.getFirstWordWithA(Path.of("src/test/resources/wordsWithoutA.txt"));
        assertEquals("A", word);
    }
}