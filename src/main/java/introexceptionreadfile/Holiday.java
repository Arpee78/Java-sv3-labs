package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {

        List<String> holidayStuff = new ArrayList<>();

        try {
            holidayStuff = Files.readAllLines(Paths.get("src/main/resources/holiday.txt"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println(holidayStuff);
    }
}
