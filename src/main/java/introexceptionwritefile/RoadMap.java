package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> stops = new ArrayList<>();
        stops.add("Veszprém");
        stops.add("Székesfehérvár");
        stops.add("Budapest");

        Path path = Path.of("src/main/resources/stops.txt");

        try {
            Files.write(path, stops);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }
}
