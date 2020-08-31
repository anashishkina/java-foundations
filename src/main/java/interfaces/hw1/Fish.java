package interfaces.hw1;

public class Fish implements Flyable, Runnable, Swimable,Walkable {
    @Override
    public void fly() {
        System.out.println("Рыбы не летают");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("И бегать рыбы тоже не умеют");

    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Зато рыбы могут плавать");

    }

    @Override
    public double maxSwimSpeed() {
        return 100;
    }

    @Override
    public void walk() {
        System.out.println("Раз ходить рыбы не могут, то и бегать тоже");

    }
}
