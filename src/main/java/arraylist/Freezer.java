package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> cooledThings = new ArrayList<>();
        cooledThings.add("lecsó");
        cooledThings.add("palacsinta");
        cooledThings.add("gulyásleves");
        cooledThings.add("spagetti");
        cooledThings.add("mákostészta");
        System.out.println(cooledThings.size());
        System.out.println(cooledThings);
        cooledThings.remove(1);
        cooledThings.remove("spagetti");
        System.out.println(cooledThings.size());
        System.out.println(cooledThings);
    }


}
