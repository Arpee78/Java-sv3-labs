package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kiss József");
        names.add("Nagy Béla");
        names.add("Németh Géza");
        names.add("Szép Virág");
        names.add("Szabó Norbert");
        names.add("Bíbor Hajnalka");
        names.add("Dávid László");
        names.add("Gyárfás Dezső");
        names.add("Céhes Dóra");
        names.add("Gémes Máté");

        Random random = new Random();
        int number1 = random.nextInt(5);
        int number2 = random.nextInt(5) + 5;

        System.out.println("Az első nyertes sorszáma: " + number1);
        System.out.println("Az első nyertes neve: " + names.get(number1));
        System.out.println("A második nyertes sorszáma: " + number2);
        System.out.println("A második nyertes neve: " + names.get(number2));


    }
}
