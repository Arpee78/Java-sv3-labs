package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();
        note.setName("John Doe");
        note.setTopic("Dinner");
        note.setText("chicken, rice, oil");

        System.out.println(note.getNoteText());
    }
}
