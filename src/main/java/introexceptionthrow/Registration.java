package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Üdvözlöm, kérem adja meg a regisztrációs adatokat.");
        Scanner scanner = new Scanner(System.in);

        Validation validation = new Validation();

        boolean valid = true;

        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.print("Életkor: ");
        String ageText = scanner.nextLine();

        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            valid = false;
            throw new IllegalArgumentException(iae.getMessage());
        }

        try {
            validation.validateAge(ageText);
        } catch (IllegalArgumentException iae) {
            valid = false;
            throw new IllegalArgumentException(iae.getMessage());
        }

        System.out.println("A megadott név: " + name + " és az életkor: " + ageText);

        if (valid) {
            System.out.println("Sikeres regisztráció!");
        } else {
            System.out.println("Sikertelen regisztráció!");
        }


    }


}
