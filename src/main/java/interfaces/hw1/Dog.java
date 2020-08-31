package interfaces.hw1;

public class Dog implements Flyable, Runnable, Swimable, Walkable {
    @Override
    public void fly() {
        System.out.println("Собакены не летают");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Зато собакены быстро бегают");

    }

    @Override
    public int maxRunDistance() {
        return 50;
    }

    @Override
    public void swim() {
        System.out.println("Собакены хорошо плавают");

    }

    @Override
    public double maxSwimSpeed() {
        return 20;
    }

    @Override
    public void walk() {
        System.out.println("Собакены любят гулять");

    }
}
