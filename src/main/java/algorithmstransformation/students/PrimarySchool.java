package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private List<Person> people;

    public PrimarySchool(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        for (Person person : people) {
            int age = person.getAge();
            if (age >=6 && age <= 14){
                students.add(new Student(person.getName(), person.getAddress()));
            }
        }

        return students;
    }
}
