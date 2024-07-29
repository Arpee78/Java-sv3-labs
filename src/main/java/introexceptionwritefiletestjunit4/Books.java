package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> books = new ArrayList<>();

    public void readBooks(Path path) {
        try {
            books = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + path, ioe);
        }
    }

    public void writeBooks(Path path) {
        List<String> booksToWrite = new ArrayList<>();
        for (String book : books) {
            String[] bookArray = book.split(";");
            booksToWrite.add(bookArray[2] + ": " + bookArray[1]);
        }
        try {
            Files.write(path, booksToWrite);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file: " + path, ioe);
        }
    }
}
