package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        word = word.strip();
        StringBuilder sb = new StringBuilder(word);

        return word.equalsIgnoreCase(sb.reverse().toString());
    }

    public boolean isPalindrome2(String word) {
        word = word.toLowerCase().strip();
        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

}
