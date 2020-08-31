package interfaces.hw1;

public class Man implements Flyable, Runnable, Walkable, Swimable {
    @Override
    public void fly() {
        System.out.println("Кожанные мешки не летают");
    }

    @Override
    public String flyMaxDistance() { ;
        return null;
    }

    @Override
    public void run() {
        System.out.println("Я могу бегать так же быстр как Уссейн Болт");

    }

    @Override
    public int maxRunDistance() {
        return 42;
    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать");

    }

    @Override
    public double maxSwimSpeed() {
        return 3.3;
    }

    @Override
    public void walk() {
        System.out.println("Человеки могут ходить");

    }
}
