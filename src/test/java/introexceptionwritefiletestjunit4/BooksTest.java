package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BooksTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void writeBooks() throws IOException {
        Path testPath = temporaryFolder.newFile("books.txt").toPath();

        Books books = new Books();
        books.readBooks(Path.of("src/main/resources/books.txt"));
        books.writeBooks(testPath);

        List<String> writtenBooks = Files.readAllLines(testPath);

        List<String> expectedBooks = Arrays.asList(
                "Gárdonyi Géza: Egri csillagok",
                "Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár",
                "Jókai Mór: Kőszívű ember fiai");

        assertEquals(expectedBooks, writtenBooks);

    }
}