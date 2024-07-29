package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    private List<String> powerOutages = new ArrayList<>();
    private List<String> streets = new ArrayList<>();

    public List<String> getPowerOutages() {
        return powerOutages;
    }

    public List<String> getStreets() {
        return streets;
    }

    public void addPowerOutage(String value) {
        powerOutages.add(value);
    }

    public void writeStreets(Path path) {
        for (String powerOutage : powerOutages) {
            streets.add(powerOutage.split(",")[1].strip());
        }
        try {
            Files.write(path, streets);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file: " + path, ioe);
        }
    }
}
