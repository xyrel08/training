
public class OOPAnimal_Genio {
    public void eat() {
        System.out.println("Animal is eating.");
    }
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}
class Mammal extends OOPAnimal_Genio {
    public void run() {
        System.out.println("Mammal is running.");
    }
}


class Bird extends OOPAnimal_Genio {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}


class Fish extends OOPAnimal_Genio {
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}