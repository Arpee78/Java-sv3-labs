package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public String getDeletedFlights(){
        StringBuilder sb = new StringBuilder("Töröl járatok:"+ "\n");
        for (Flight actual : flights) {
            if (actual.getStatus() == Status.DELETED){
                sb.append(actual.getFlightNumber() + "\n");
            }
        }
        return sb.toString();
    }
}
