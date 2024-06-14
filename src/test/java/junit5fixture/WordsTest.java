package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("egy");
        words.addWord("kettő");
        words.addWord("három");
        words.addWord("négy");
        words.addWord("öt");
        words.addWord("hat");
        words.addWord("hét");
        words.addWord("nyolc");
        words.addWord("kilenc");
    }

    @Test
    void testRemoveWordsWithoutLetter() {
        List<String> wordsWithoutLetter = Arrays.asList("nyolc", "kilenc");
        words.removeWordsWithoutLetter("c");
        assertEquals(wordsWithoutLetter, words.getWords());
    }

    @Test
    void testRemoveWordsWithOtherLength() {
        List<String> wordsWithOtherLength = Arrays.asList("kettő", "három", "nyolc");
        words.removeWordsWithOtherLength(5);
        assertEquals(wordsWithOtherLength, words.getWords());
    }

}