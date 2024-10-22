public class OOPAnimal_Genio_Main {
    public static void main(String[] args) {
        OOPAnimal_Genio  animal1 = new Mammal();
        OOPAnimal_Genio  animal2 = new Bird();
        OOPAnimal_Genio animal3 = new Fish();

        animal1.eat();
        animal2.sleep();
        ((Mammal) animal1).run();
        ((Bird) animal2).fly();
        ((Fish) animal3).swim();
    }
}

