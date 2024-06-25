package stringbuilder.airport;

public class FlightMain {

    public static void main(String[] args) {

        Airport airport = new Airport();

        Flight flightToBombay = new Flight("B-2351", Status.DELETED);
        Flight flightToParis = new Flight("P-626783", Status.ACTIVE);
        Flight flightToFrankfurt = new Flight("F-24671", Status.ACTIVE);
        Flight flightToNewYork = new Flight("N-312561", Status.DELETED);
        Flight flightToSydney = new Flight("S-35", Status.DELETED);

        airport.addFlight(flightToBombay);
        airport.addFlight(flightToParis);
        airport.addFlight(flightToFrankfurt);
        airport.addFlight(flightToNewYork);
        airport.addFlight(flightToSydney);

        System.out.println(airport.getDeletedFlights());

    }
}
