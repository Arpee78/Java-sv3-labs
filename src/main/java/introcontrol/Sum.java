package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Adj meg öt számot.");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ". szám: ");
            sum += scanner.nextInt();
        }
        System.out.println(sum);

    }
}
