package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egy pozitív egész számot: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        ForbiddenSevens forbiddenSevens = new ForbiddenSevens();
        for (int i = number; ; i++) {
            if (i % 7 != 0 && forbiddenSevens.hasSeven(i)) {
                break;
            }
            if (i % 7 == 0) {
                System.out.println("X");
                continue;
            }
            System.out.println(i);
        }
    }

    private boolean hasSeven(int i) {
        String s = String.valueOf(i);
        if (s.contains("7")) {
            return true;
        }
        return false;
    }
}
