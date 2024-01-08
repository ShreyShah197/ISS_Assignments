package abstraction;
abstract class Animal {
    public abstract void makeSound();
}

class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}

class Sheep extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meh");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Sheep()};

        for (Animal animal : animals) {
            animal.makeSound(); 
        }
    }
}
