package pl.gornik;

import pl.gornik.model.Animal;
import pl.gornik.model.Cat;
import pl.gornik.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Kacper", 10.5, "ssak");
        Animal dog2 = new Animal("Nissan", 1000, "ssak");
        Animal cat1 = new Cat("KitKat", 10, "ssak");
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);

        dog1.giveVoice("");

    }
}