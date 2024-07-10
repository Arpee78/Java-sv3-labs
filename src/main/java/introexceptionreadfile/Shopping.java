package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {

        List<String> shoppingStuff = new ArrayList<>();

        try {
            shoppingStuff = Files.readAllLines(Paths.get("src/main/resources/shoppinglist.txt"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println(shoppingStuff);
    }
}
