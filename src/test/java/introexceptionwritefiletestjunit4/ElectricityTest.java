package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteStreets() throws IOException {
        Path path = temporaryFolder.newFile("street.txt").toPath();

        Electricity electricity = new Electricity();

        electricity.addPowerOutage("2024-08-10, Petőfi utca");
        electricity.addPowerOutage("2024-08-11, Kossuth L. utca");
        electricity.addPowerOutage("2024-08-11, Ady E. utca");

        electricity.writeStreets(path);

        List<String> streets = Files.readAllLines(path);

        assertEquals(electricity.getStreets(), streets);
    }
}