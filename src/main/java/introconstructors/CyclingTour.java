package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride(double km) {
        kms += km;
    }

    public static void main(String[] args) {

        CyclingTour cyclingTour = new CyclingTour("Alsóörs túra", LocalDate.of(2024, 05, 30));
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
        cyclingTour.registerPerson(3);
        cyclingTour.ride(30);
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }
}
