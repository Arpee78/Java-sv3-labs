package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {

        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        Path path = Paths.get("src/main/resources/palutcaifiuk.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = paulStreetBoys.getLines(path);
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.getCause().printStackTrace();
        }

        for (String line : lines) {
            if (line.toLowerCase().contains("nemecsek")) {
                System.out.println(line.toUpperCase());
            } else {
                System.out.println(line);
            }
        }
    }

    private List<String> getLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + path, ioe);
        }
    }
}
