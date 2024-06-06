package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hány jelentkező lesz? ");
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        Exam exam = new Exam();

        for (int i = 0; i < numberOfPeople; i++) {

            System.out.print(i + 1 + ". jelentkező neve: ");
            String name = scanner.nextLine();

            System.out.print(i + 1 + ". jelentkező születési éve: ");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.print(i + 1 + ". jelentkező születési hónapja: ");
            int month = Integer.parseInt(scanner.nextLine());

            System.out.print(i + 1 + ". jelentkező születési napja: ");
            int day = Integer.parseInt(scanner.nextLine());

            LocalDate date = LocalDate.of(year, month, day);

            System.out.print(i + 1 + ". jelentkező irányítószáma: ");
            int zipCode = Integer.parseInt(scanner.nextLine());

            System.out.print(i + 1 + ". jelentkező átlaga: ");
            double average = Double.parseDouble(scanner.nextLine());

            Person person = new Person(name, date, zipCode, average);
            exam.addPerson(person);
        }

        System.out.println(exam.getPeople());
    }
}
