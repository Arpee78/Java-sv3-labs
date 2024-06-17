package controliteration.division;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni. ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Hánnyal osztható számokat szeretne kapni? ");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        System.out.println(new Division().findDivisorsByFor(number, divisor));
        System.out.println(new Division().findDivisorsByWhile(number, divisor));


    }

    private List<Integer> findDivisorsByFor(int number, int divisor) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (i % divisor == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    private List<Integer> findDivisorsByWhile(int number, int divisor) {
        List<Integer> divisors = new ArrayList<>();

        int count = 1;
        while (count < number) {
            if (count % divisor == 0) {
                divisors.add(count);
            }
            count++;
        }
        return divisors;
    }
}
