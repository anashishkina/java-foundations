package core.hw;

public class Flat {
    public static void main(String[] args) {

        Man ivan = new Man("Ivan", true, 33);
        Woman elena = new Woman("Elena", false, 25);
        Man anton = new Man("Anton", true, 40);
        Woman anna = new Woman("Anna", false, 19);

        ivan.printAge();
        elena.printAge();
        anton.printAge();
        anna.printAge();

    }
}
