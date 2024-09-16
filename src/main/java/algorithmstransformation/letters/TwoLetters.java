package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    public List<String> getFirstTwoLetters(List<String> words) {

        List<String> wordsFirstTwoLetters = new ArrayList<>();

        for (String word : words) {
            wordsFirstTwoLetters.add(word.substring(0, 2));
        }

        return wordsFirstTwoLetters;
    }
}
