package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> animalsWithNumberOfLegsGiven = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getNumberOfLegs() == numberOfLegs) {
                animalsWithNumberOfLegsGiven.add(animal);
            }
        }

        return animalsWithNumberOfLegsGiven;
    }
}
