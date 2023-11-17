package pl.gornik.model;

public class Cat extends Animal {

    String Samochod;
    public Cat(String name, double weight, String type) {
        super(name, weight, type);
        this.Samochod = Samochod;
    }

    public Cat(Animal animal) {
        super(animal);
        this.Samochod = Samochod;
    }
    @Override
    public void giveVoice(String str) {
        str = "Miau, miau";
        super.giveVoice(str);
    }
}
