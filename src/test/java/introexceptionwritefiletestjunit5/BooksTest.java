package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File temporaryFolder;

    @Test
    void writeBooks() throws IOException {
        Path testPath = temporaryFolder.toPath().resolve("books.txt");

        introexceptionwritefiletestjunit5.Books books = new Books();
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