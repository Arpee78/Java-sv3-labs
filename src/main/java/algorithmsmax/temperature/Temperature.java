package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperatures) {
        int minTemp = Integer.MAX_VALUE;
        for (Integer temperature : temperatures) {
            if (temperature < minTemp) {
                minTemp = temperature;
            }
        }
        return minTemp;
    }
}
