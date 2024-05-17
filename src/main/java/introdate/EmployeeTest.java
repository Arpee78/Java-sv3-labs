package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Név: ");
        String name = scanner.nextLine();

        System.out.print("Év: ");
        int year = scanner.nextInt();

        System.out.print("Hónap: ");
        int month = scanner.nextInt();

        System.out.print("Nap: ");
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Név: " + employee.getName());
        System.out.println("Születési dátum: " + employee.getDateOfBirth());
        System.out.println("Belépési dátum: " + employee.getBeginEmployment());

    }
}
