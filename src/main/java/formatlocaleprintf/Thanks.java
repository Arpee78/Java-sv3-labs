package formatlocaleprintf;

import java.util.ArrayList;
import java.util.List;

public class Thanks {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Joe");
        names.add("Jim");

        for (String name : names) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!", name);
            System.out.println();
        }
    }
}
