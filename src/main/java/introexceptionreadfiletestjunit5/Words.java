package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    public  String getFirstWordWithA(Path path){
        List<String> words = new Words().extracted(path);
        for (String word : words) {
            if (word.charAt(0)=='A'){
                return word;
            }
        }
        return "A";
    }

    private List<String> extracted(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }
}
