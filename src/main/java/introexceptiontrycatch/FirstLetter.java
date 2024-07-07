package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    private List<String> words;

    public FirstLetter(List<String> words) {
        this.words = words;
    }

    public static void main(String[] args) {
        FirstLetter firstLetter = new FirstLetter(Arrays.asList("Macska", "Alma", "Répa", "Sajt", ""));
        firstLetter.printFirstLetter();
    }

    private void printFirstLetter() {
        for (String word : words) {
            try {
                System.out.print(word.charAt(0));
            } catch (StringIndexOutOfBoundsException ex) {
                ex.printStackTrace();
            }
        }
    }

}
