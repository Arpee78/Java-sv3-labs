package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todos = new ArrayList<>();
        String in = "";

        while (!in.equalsIgnoreCase("x")) {
            System.out.print("Add meg a következő todot! ");
            in = scanner.nextLine();
            if (!in.equalsIgnoreCase("x")) {
                todos.add(in);
            }
        }

        Path path = Path.of("src/main/resources/todos.txt");
        try {
            Files.write(path, todos);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file: " + path, ioe);
        }
    }
}

