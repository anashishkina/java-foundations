package core.hw;

public class Figure {
    public static void main(String[] args) {
        Square kvadrat = new Square(5);
        Triangle treugolnik = new Triangle(3,4,5);
        Rectangle pryamougolnik = new Rectangle(4, 6);


        kvadrat.areaOfSquare();
        treugolnik.areaOfTriange();
        pryamougolnik.areaOfRectangle();
    }
}
