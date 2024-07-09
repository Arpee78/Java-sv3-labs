package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        System.out.print("Adj meg egy legfeljebb 5 betűs szót: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.length()>5){
            throw new IllegalArgumentException("The word is longer than 5 character: "+ word);
        }

        for (char c : word.toCharArray()) {
            if (!Character.isAlphabetic(c)){
                throw new IllegalArgumentException("This character isnt a letter: " + c);
            }
        }
        System.out.println(word);
    }
}
