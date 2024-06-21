package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        String neptunCode1 = student.getNeptunCode();
        String neptunCode2 = anotherStudent.getNeptunCode();
        String eduId1 = student.getEducationalId();
        String eduId2 = anotherStudent.getEducationalId();

        return neptunCode1.equals(neptunCode2) && eduId1.equals(eduId2);
    }

}
