package stringconcat.employee;

public class Employee {

    private String name;
    private String occupation;
    private int salary;

    public Employee(String name, String occupation, int salary) {
        this.name = name;
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  name + " - " + occupation + " - " + salary + " Ft";
    }
}
