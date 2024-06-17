package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A Fibonacci sorozat hány elemét írjam ki? ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(new Fibonacci().findFibonacciByFor(number));
        System.out.println(new Fibonacci().findFibonacciByWhile(number));
        System.out.println(new Fibonacci().findFibonacciByDoWhile(number));
    }

    private List<Integer> findFibonacciByFor(int number) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        for (int i = 2; i < number; i++) {
            fibonacciNumbers.add(fibonacciNumbers.get(i - 2) + fibonacciNumbers.get(i - 1));
        }
        return fibonacciNumbers;
    }

    private List<Integer> findFibonacciByWhile(int number) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        int count = 2;
        while (count < number) {
            fibonacciNumbers.add(fibonacciNumbers.get(count - 2) + fibonacciNumbers.get(count - 1));
            count++;
        }
        return fibonacciNumbers;
    }

    private List<Integer> findFibonacciByDoWhile(int number) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        int count = 2;
        do {
            fibonacciNumbers.add(fibonacciNumbers.get(count - 2) + fibonacciNumbers.get(count - 1));
            count++;
        } while (count < number);
        return fibonacciNumbers;
    }

}
