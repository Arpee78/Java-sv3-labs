package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        System.out.print("Adj meg egy egész számot. ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number % 3 == 0 ? "Osztható hárommal" : "Nem osztható hárommal");

    }
}
