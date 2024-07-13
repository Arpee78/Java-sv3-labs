package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/neptun.csv");
        List<String> neptuneCodes;

        try {
            neptuneCodes = new Neptun().getNeptuneCodes(path);
            System.out.println(neptuneCodes);
        } catch (IOException ioe) {
            System.out.println("Cannot read file: " + path);
            ioe.printStackTrace();
        }
    }

    private List<String> getNeptuneCodes(Path path) throws IOException {
        return Files.readAllLines(path);
    }


}
