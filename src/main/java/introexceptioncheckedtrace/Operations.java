package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public String getDailySchedule(List<String> carriages) {
        StringBuilder sb = new StringBuilder(LocalDate.now().toString() + ",");
        for (String carriage : carriages) {
            if (carriage.charAt(0) == '2') {
                sb.append(" " + carriage);
            }
        }
        return sb.toString();
    }
}
