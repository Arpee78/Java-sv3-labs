package recursion;

public class Vowels {

    // A Vowels osztályban írj egy getNumberOfVowels(String word) metódust,
    // amely visszaadja, hány magánhangzó van a paraméterként átadott szóban!
    // Írd meg a feladatot rekurzióval!
    // (A megoldás menete: Meg kell vizsgálni, hogy a szó első betűje magánhangzó-e,
    // és ez esetben 1-et visszaadni, ellenkező esetben 0-t.
    // Majd meg kell vizsgálni ugyanezt arra a szóra,
    // amelyet az eredeti szó első betűjének törlésével kapunk,
    // tehát újra kell hívni a metódust az egy betűvel rövidebb szóval.

    public int getNumberOfVowels(String word) {
        if (word.isEmpty()) {
            return 0;
        }

        String vowels = "aáeéiíoóöőuúüű";
        int count = 0;

        if (vowels.contains(word.substring(0, 1))) {
            count = 1;
        }

        return count + getNumberOfVowels(word.substring(1));
    }
}
