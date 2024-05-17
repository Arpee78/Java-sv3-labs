package introdate;

import java.time.LocalDateTime;

public class University {

    public static void main(String[] args) {

        Exam exam1 = new Exam("Math", LocalDateTime.of(2024, 7, 22, 10, 0));
        Exam exam2 = new Exam("Biology", LocalDateTime.of(2024, 8, 10, 10, 0));

        System.out.println("Tantárgy: " + exam1.getSubject());
        LocalDateTime exam1Date = exam1.getExamDate();
        System.out.println("Év: " + exam1Date.getYear());
        System.out.println("Hónap: " + exam1Date.getMonth());
        System.out.println("Nap: " + exam1Date.getDayOfMonth());
        System.out.println("Óra: " + exam1Date.getHour());
        System.out.println("Perc: " + exam1Date.getMinute());

        System.out.println();
        System.out.println("Az 1. számú vizsga a 2. számú " +
                (exam1Date.isBefore(exam2.getExamDate()) ? "előtt" : "után") +
                " van.");

        System.out.println();
        System.out.println(exam1.getMessage());
        System.out.println(exam2.getMessage());

    }
}
