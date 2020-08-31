package interfaces.hw1;

public class Main {

    public static void main(String[] args) {
        Man man = new Man();

        System.out.println("Что могут человеки: ");
        man.fly();
        System.out.println("man.flyMaxDistance() = " + man.flyMaxDistance());
        man.run();
        System.out.println("man.maxRunDistance() = " + man.maxRunDistance());
        man.swim();
        System.out.println("man.maxSwimSpeed() = " + man.maxSwimSpeed());
        man.walk();

        System.out.println();
        System.out.println("Теперь поговорим о рыбках: ");
        Fish fish = new Fish();
        fish.fly();
        System.out.println("fish.flyMaxDistance() = " + fish.flyMaxDistance());
        fish.run();
        System.out.println("fish.maxRunDistance() = " + fish.maxRunDistance());
        fish.walk();
        fish.swim();
        System.out.println("fish.maxSwimSpeed() = " + fish.maxSwimSpeed());

        System.out.println();
        System.out.println("Теперь речь пойдет о собаках:");

        Dog dog = new Dog();
        dog.fly();
        System.out.println("dog.flyMaxDistance() = " + dog.flyMaxDistance());
        dog.run();
        System.out.println("dog.maxRunDistance() = " + dog.maxRunDistance());
        dog.swim();
        System.out.println("dog.maxSwimSpeed() = " + dog.maxSwimSpeed());
        dog.walk();

        System.out.println();
        System.out.println("А теперь о кошках");

        Cat cat = new Cat();
        cat.fly();
        System.out.println("cat.flyMaxDistance() = " + cat.flyMaxDistance());
        cat.run();
        System.out.println("cat.maxRunDistance() = " + cat.maxRunDistance());
        cat.swim();
        System.out.println("cat.maxSwimSpeed() = " + cat.maxSwimSpeed());
        cat.walk();

        System.out.println();
        System.out.println("Птички");

        Bird bird = new Bird();
        bird.fly();
        System.out.println("bird.flyMaxDistance() = " + bird.flyMaxDistance());
        bird.walk();


    }
}
