package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        char[] chars = text.toCharArray();

        for (char actual : chars) {
            if (Character.isAlphabetic(actual)) {
                System.out.println(actual + " : betű");
            } else if (Character.isDigit(actual)) {
                System.out.println(actual + " : számjegy");
            } else {
                System.out.println(actual + " : egyéb");
            }

        }
    }

    public static void main(String[] args) {
        new LettersAndDigits().printLetterOrDigit("bfa68fF;X");
    }
}
