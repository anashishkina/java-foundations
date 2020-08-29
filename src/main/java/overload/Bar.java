package overload;

public class Bar {

    public static void main(String[] args) {

        Bottle.color = "blue";

        Bottle waterBottle = new Bottle("Saint Sprint", 0.75, "plastic", 8 );
        waterBottle.printBottle();

        Bottle waterBottle2 = new Bottle("Shishkin forest", 0.5, "plastic", 6);
        waterBottle2.printBottle();

        Bottle.color = "green";
        waterBottle2.printBottle();



    }
}
