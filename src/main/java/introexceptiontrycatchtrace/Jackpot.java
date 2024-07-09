package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jackpot {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Joe", "John", "Jim", null));

        Winner winner = new Winner(names);
        try {
            String winnerName = winner.getWinner();
            System.out.println(winnerName);
        } catch (NullPointerException npe) {
            System.out.println("Value is null");
        }

    }
}
