package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void addNote() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Student().addNote(0));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}