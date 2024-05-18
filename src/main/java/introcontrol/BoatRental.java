package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        System.out.print("Csoport létszáma: ");
        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();

        if (group >= 5) {
            System.out.println("Az 5 személyes csónak kiadva.");
            group -= 5;
        }

        if (group >= 3) {
            System.out.println("A 3 személyes csónak kiadva.");
            group -= 3;
        }

        if (group > 0) {
            System.out.println("A 2 személyes csónak kiadva.");
            group -= group >= 2 ? 2 : 1;
        }

        System.out.println("A parton " + group + " ember maradt.");

    }
}
