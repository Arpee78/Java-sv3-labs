package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public List<String> getWordsStartWith(List<String> words, String prefix) {

        List<String> wordsStartWith = new ArrayList<>();

        for (String word : words) {
            if (word.startsWith(prefix)) {
                wordsStartWith.add(word);
            }
        }

        return wordsStartWith;
    }
}
