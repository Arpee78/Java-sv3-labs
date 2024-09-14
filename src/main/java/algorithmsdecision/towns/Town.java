package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> inhabitantsPerCity, int min){
        for (int habitants : inhabitantsPerCity) {
            if (habitants < min){
                return true;
            }
        }
        return false;
    }
}
