package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("kés", "víztisztító", "internet");
        System.out.println(importantThings);
        importantThings.set(2, "macska");
        System.out.println(importantThings);
    }
}
