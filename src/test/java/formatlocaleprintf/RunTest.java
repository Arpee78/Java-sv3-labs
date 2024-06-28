package formatlocaleprintf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void testPrintFormattedRunText(){
        Run run = new Run(new ArrayList<>(Arrays.asList(4.5,3.1,7.3)), "Sanyi");
        String message = run.printFormattedRunText();
        assertEquals("Kedves Sanyi! A mai dátum: 2024-06-28. Ezen a héten ez a(z) 3. futásod. Most 7,3 km-t futottál. Csak így tovább!",message);
    }

}