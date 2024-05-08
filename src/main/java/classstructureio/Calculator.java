package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg két egész számot!");

        System.out.print("Szám 1: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Szám 2: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(number1 + " + " + number2);
        System.out.println(number1 + number2);

    }
}
