package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> names;

    public Winner(List<String> names) {
        this.names = names;
    }

    public String getWinner() {
        Random random = new Random();
        int index = random.nextInt(names.size());
        String winnerName = names.get(index);
        return winnerName.toUpperCase();
    }
}
