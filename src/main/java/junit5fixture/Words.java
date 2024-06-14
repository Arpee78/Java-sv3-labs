package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word){
        words.add(word);
    }

    public void removeWordsWithoutLetter(String letter){
        List<String> wordsToRemove = new ArrayList<>();
        for (String actual : words) {
            if (!actual.contains(letter)){
                wordsToRemove.add(actual);
            }
        }
        words.removeAll(wordsToRemove);
    }

    public void removeWordsWithOtherLength(int length){
        List<String> wordsToRemove = new ArrayList<>();
        for (String actual : words) {
            if (actual.length() != length ){
                wordsToRemove.add(actual);
            }
        }
        words.removeAll(wordsToRemove);
    }


}
