package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hány ember adatát szeretnéd rögzíteni? ");
        int number = scanner.nextInt();
        scanner.nextLine();

        List<String> birthdays = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            System.out.print("Név: ");
            String name = scanner.nextLine();
            System.out.print("Szül. dátum(YYYY-MM-DD): ");
            String date = scanner.nextLine();
            birthdays.add(name + " " + date);
        }

        Path path = Path.of("src/main/resources/birthdays.txt");

        try {
            Files.write(path, birthdays);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file: " + path, ioe);
        }

    }
}
