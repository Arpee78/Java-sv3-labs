package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> hillHeights) {
        int highestHill = Integer.MIN_VALUE;
        for (Integer actualHeight : hillHeights) {
            if (actualHeight > highestHill) {
                highestHill = actualHeight;
            }
        }
        return highestHill;
    }
}
