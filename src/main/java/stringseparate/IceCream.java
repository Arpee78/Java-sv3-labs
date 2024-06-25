package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {

    public static void main(String[] args) {
        List<String> iceCreams = Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iceCreams.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(iceCreams.get(i));
        }

        System.out.println(sb);
    }
}
