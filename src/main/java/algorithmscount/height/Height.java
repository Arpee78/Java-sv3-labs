package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> childHeight, int heightLimit) {
        int count = 0;

        for (Integer i : childHeight) {
            if (i >= heightLimit) {
                count++;
            }
        }

        return count;
    }
}
