package recursion;

import java.util.Arrays;

public class Numbers {


    public int getSum(int[] numbers) {

        if (numbers.length > 0) {
            int solution = getSum(Arrays.copyOfRange(numbers,1, numbers.length));
            return numbers[0] + solution;
        } else {
            return 0;
        }
    }

    public int getSum2(int[] numbers) {

        if (numbers.length > 0) {
            int solution = getSum2(Arrays.copyOf(numbers, numbers.length-1));
            return numbers[numbers.length-1] + solution;
        } else {
            return 0;
        }
    }
}


