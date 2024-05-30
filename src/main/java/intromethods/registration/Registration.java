package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vezetéknév: ");
        String surName = scanner.nextLine();
        System.out.print("Keresztnév: ");
        String firstName = scanner.nextLine();

        System.out.print("Születési év: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Születési hónap: ");
        int monthOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Születési nap: ");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Registration registration = new Registration();
        Person person = new Person(registration.getFullName(surName, firstName),
                registration.getDateOfBirth(yearOfBirth,monthOfBirth,dayOfBirth), email);

        System.out.println(person);
    }

    public String getFullName(String surName, String firstName) {
        return firstName + " " + surName;
    }

    public LocalDate getDateOfBirth(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        return LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }


}
