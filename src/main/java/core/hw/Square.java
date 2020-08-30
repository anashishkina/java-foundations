package core.hw;

public class Square extends Figure{

    public Square(double a, double b, double c) {
        super(a, b, c);
    }

    public void areaOfSquare(){
        System.out.println("Площадь квадрата равна: " + a * a + " cm");
    }
}
