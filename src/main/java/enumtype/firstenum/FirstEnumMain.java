package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        for (Continent actual : Continent.values()) {
            System.out.println(actual);
        }

        String continents = Arrays.toString(Continent.values());
        System.out.println(continents);

        System.out.println(Ocean.valueOf("PACIFIC_OCEAN"));
        System.out.println(Ocean.valueOf("ATLANTIC_OCEAN"));
        System.out.println(Ocean.valueOf("INDIAN_OCEAN"));
        System.out.println(Ocean.valueOf("SOUTHERN_OCEAN"));
        System.out.println(Ocean.valueOf("ARCTIC_OCEAN"));

        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.CENTER_BACK.name());
        System.out.println(Football.FULL_BACK.name());
        System.out.println(Football.DEFENSIVE_MIDFIELDER.name());
        System.out.println(Football.CENTRAL_MIDFIELDER.name());
        System.out.println(Football.ATTACKING_MIDFIELDER.name());
        System.out.println(Football.WINGER.name());
        System.out.println(Football.STRIKER.name());


    }
}
