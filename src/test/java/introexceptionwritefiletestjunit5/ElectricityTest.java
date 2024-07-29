package introexceptionwritefiletestjunit5;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {

    @TempDir
    File temporaryFolder;

    @Test
    public void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("street.txt");

        Electricity electricity = new Electricity();

        electricity.addPowerOutage("2024-08-10, Petőfi utca");
        electricity.addPowerOutage("2024-08-11, Kossuth L. utca");
        electricity.addPowerOutage("2024-08-11, Ady E. utca");

        electricity.writeStreets(path);

        List<String> streets = Files.readAllLines(path);

        assertEquals(electricity.getStreets(), streets);
    }
}