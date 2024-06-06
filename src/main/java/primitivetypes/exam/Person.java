package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate date;
    private int zipCode;
    private double average;

    public Person(String name, LocalDate date, int zipCode, double average) {
        this.name = name;
        this.date = date;
        this.zipCode = zipCode;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", zipCode=" + zipCode +
                ", average=" + average +
                '}';
    }
}
