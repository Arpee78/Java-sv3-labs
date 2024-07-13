package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/poem_.txt");
        List<String> poem = new ArrayList<>();
        try {
            poem = getPoem(path);
        } catch (IllegalStateException ise) {
//            System.out.println(ise.getMessage());
            ise.printStackTrace();
//            System.out.println(ise.getCause().getMessage());
//            ise.getCause().printStackTrace();
        }

        for (String s : poem) {
            System.out.print(s.charAt(0));
        }
    }

    private static List<String> getPoem(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + path, ioe);
        }
    }
}
