package core.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Figure {

    public double a;
    public double b;

    public void areaOfRectangle(){
        System.out.println("Площадь прямоугольника равна: " + a * b + " cm");
    }

}
