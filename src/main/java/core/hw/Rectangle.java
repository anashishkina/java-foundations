package core.hw;


public class Rectangle extends Figure {


    public Rectangle(double a, double b, double c) {
        super(a, b, c);
    }

    public void areaOfRectangle(){
        System.out.println("Площадь прямоугольника равна: " + a * b + " cm");
    }

}
