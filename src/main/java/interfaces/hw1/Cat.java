package interfaces.hw1;

public class Cat implements Flyable, Runnable, Swimable,Walkable{
    @Override
    public void fly() {
        System.out.println("Кошаки не летают");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Но зато кошаки хорошо бегают");

    }

    @Override
    public int maxRunDistance() {
        return 20;
    }

    @Override
    public void swim() {
        System.out.println("Кошки не любят плавать");

    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }

    @Override
    public void walk() {
        System.out.println("Кошки любят ходить");

    }
}
