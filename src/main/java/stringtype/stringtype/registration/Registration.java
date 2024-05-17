package stringtype.stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Felhasználónév: ");
        String userName = scanner.nextLine();

        System.out.print("Jelszó1: ");
        String password1 = scanner.nextLine();

        System.out.print("Jelszó2: ");
        String password2 = scanner.nextLine();

        System.out.print("Emailcím: ");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println("A felhasználónév " + (userValidator.isValidUsername(userName) ? "érvényes!" : "nem érvényes!"));
        System.out.println("A jelszó " + (userValidator.isValidPassword(password1, password2) ? "érvényes!" : "nem érvényes!"));
        System.out.println("Az emailcím " + (userValidator.isValidEmail(email) ? "érvényes!" : "nem érvényes!"));
    }
}
