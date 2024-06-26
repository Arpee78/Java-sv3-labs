package stringscanner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntScannerTest {

    @Test
    void testConvertInts() {
        IntScanner intScanner = new IntScanner();
        String result = intScanner.convertInts("5;3;107;12;123;18;198");
        assertEquals("107,123,198", result);
    }

}