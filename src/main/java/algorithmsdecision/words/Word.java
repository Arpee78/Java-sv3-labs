package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String word) {
        int lengthOfWord = word.length();
        for (String actual : words) {
            if (actual.length() > lengthOfWord) {
                return true;
            }
        }
        return false;
    }
}
