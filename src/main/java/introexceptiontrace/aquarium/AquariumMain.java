package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        Fish guppy = new Fish("Guppy","Orange");
        Fish neonTetra = new Fish("Neon Tetra","Blue");
        Fish betta = new Fish("Betta","Grey");

        aquarium.addFish(guppy);
        aquarium.addFish(neonTetra);
        aquarium.addFish(betta);

        System.out.println(aquarium.getNumberOfFish());
    }

    // Az Aquarium osztály addFish metódusában keletkezik a kivétel a 15. sorban,
    // mert a 8. sorban nem volt példányosítva a lista.
}
