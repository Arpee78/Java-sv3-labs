package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        System.out.println("Válasszon az alábbi lépések közül:\n" +
                "1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("A felhasználók listázása");
        }

        if (number == 2) {
            System.out.println("Felhasználó felvétele");
        }

    }
}
