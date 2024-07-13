package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TrackPoints {

    public List<String> readTracking(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + path, ioe);
        }
    }

    public String calculateDifferences(List<String> trackPoints) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < trackPoints.size(); i++) {
            int previous = Integer.parseInt(trackPoints.get(i - 1).split(";")[2]);
            int next = Integer.parseInt(trackPoints.get(i).split(";")[2]);
            sb.append(next - previous + "\n");
        }
        return sb.toString();
    }


}
