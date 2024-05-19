package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"egy", "kettő", "három", "négy" };

        arrayHandler.addIndexToNumber(numbers);

        for (int actual : numbers) {
            System.out.println(actual);
        }

        for (int actual : numbers) {
            System.out.print(actual + ", ");
        }

        System.out.println();

        arrayHandler.concatenateIndexToWord(words);

        for (String actual : words) {
            System.out.println(actual);
        }

        for (String actual : words) {
            System.out.print(actual + ", ");
        }

    }
}
