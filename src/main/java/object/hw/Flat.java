package object.hw;

public class Flat {

    public static void main(String[] args) {

        Person anton = new Person("Anton", 25, 180);
        System.out.println("anton.toString() = " + anton.toString());

        Person elena = new Person("Elena", 18, 175);
        System.out.println("elena.toString() = " + elena.toString());
    }
}
