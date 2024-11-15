package recursion;

public class Palindrome {

    //A megoldás menete: Meg kell vizsgálni, hogy a szó első és utolsó betűje megegyezik-e,
    // majd utána az ezen betűk közötti, “középső” szóra kell újra megvizsgálni ugyanazt.
    // Ha már csak nulla vagy egy betű marad a szóból,
    // akkor az már logikailag egyértelmű, hogy palindrom szó.

    public boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (word.length() <= 3) {
            return word.charAt(0) == word.charAt(word.length() - 1);
        } else {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }
}
