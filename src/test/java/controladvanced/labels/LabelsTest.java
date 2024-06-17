package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    @Test
    void testGetTableOfNumbers(){
        Labels labels = new Labels();
        int[][] arrayOfArray = labels.getTableOfNumbers(5);
        assertEquals(5, arrayOfArray[2][1]);
        assertEquals(10, arrayOfArray[4][4]);

    }

}