package introexceptioncause;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Tracking {

    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        List<String> lines = trackPoints.readTracking(Paths.get("src/main/resources/tracking.csv"));
        String heightDifferences = trackPoints.calculateDifferences(lines);
        System.out.println(heightDifferences);
    }
}
