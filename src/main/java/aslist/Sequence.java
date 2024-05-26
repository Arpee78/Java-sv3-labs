package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));
        for (int i = 1; i < 6; i++) {
            elements.add(elements.get(i) * elements.get(i - 1));
        }
        System.out.println(elements.size());
        System.out.println(elements);
    }
}
