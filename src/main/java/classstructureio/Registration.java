package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved és emailcímed!");

        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.print("Emailcím: ");
        String emailAddress = scanner.nextLine();

        System.out.println("Köszönöm, a(z) "
                + name
                + " névvel és a(z) "
                + emailAddress
                + " emailcímmel regisztráltál.");
    }
}
