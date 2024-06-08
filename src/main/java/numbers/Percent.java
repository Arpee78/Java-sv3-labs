package numbers;

import java.util.Scanner;

public class Percent {

    public double getValue(int base, int percent) {
        return base / 100.0 * percent;
    }

    public double getBase(int value, int percent) {
        return 100.0 * value / percent;
    }

    public double getPercent(int base, int value) {
        return 100.0 * value / base;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eredeti szám: ");
        int originalNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Százalék: ");
        int percentValue = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Százalékérték: " + percent.getValue(originalNumber, percentValue));

        System.out.println();

        System.out.print("Százalékérték: ");
        int value = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Százalék: ");
        percentValue = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Eredeti szám: " + percent.getBase(value, percentValue));

        System.out.println();

        System.out.print("Eredeti szám: ");
        originalNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Százalékérték: ");
        value = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Százalék: " + percent.getPercent(originalNumber, value) + "%");
    }
}
