package interfaces.hw1;

public class Bird implements Walkable, Flyable {

    @Override
    public void fly() {
        System.out.println("Птицы летают");
    }

    @Override
    public String flyMaxDistance() {
        return "100";
    }

    @Override
    public void walk() {
        System.out.println("Иногда птицы могут ходить");

    }
}
