package stringbasic.characters;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        System.out.print("Adj meg egy szót: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println("Betűzd le: " + word);

        char[] chars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chars[i] = scanner.nextLine().charAt(0);
        }

        System.out.println("Az eredeti szó: " + word);
        System.out.println("Az általad megadott szó: " + String.valueOf(chars));
        System.out.println("Helyes a betűzés? " + (String.valueOf(chars).equals(word) ? "Igen" : "Nem"));

    }

}
