package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kis József"));
        students.add(new Student("Novák Imre"));
        students.add(new Student("Mongol Zsófia"));
        students.add(new Student("Német Géza"));
        students.add(new Student("Lengyel Tihamér"));
        System.out.println(students.size());

        students.get(0).setActive(false);
        students.get(2).setActive(false);

        List<Student> inActiveStudents = new ArrayList<>();
        for (Student actual : students) {
            if (!actual.isActive()){
                inActiveStudents.add(actual);
            }
        }
        students.removeAll(inActiveStudents);
        System.out.println(students.size());
    }
}
