package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addDigitsToList(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                String digitString = Character.toString(c);
                int number = Integer.parseInt(digitString);
                numbers.add(number);
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("dfat674ghk73g1");
        System.out.println(digits.getNumbers());
    }


}
