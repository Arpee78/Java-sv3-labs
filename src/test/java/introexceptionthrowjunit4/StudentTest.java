package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testAddNote() {
        Student student = new Student();
        student.addNote(3);
        assertThat(3, equalTo(student.getNotes().get(0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNoteException1() {
        new Student().addNote(6);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testAddNoteException2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        new Student().addNote(0);
    }

    @Test
    public void testAddNoteException3() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(7));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }

}