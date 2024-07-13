package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Underground {

    public static void main(String[] args) {

        Operations operations = new Operations();

        Path path = Paths.get("src/main/resources/underground_.txt");
        List<String> carriages = new ArrayList<>();

        try {
            carriages = operations.readFile(path);
        } catch (IOException ioe) {
            System.out.println("Cannot read file");
            ioe.printStackTrace();
        }

        System.out.println(carriages);
        System.out.println(operations.getDailySchedule(carriages));
    }
}
