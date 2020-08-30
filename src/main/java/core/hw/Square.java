package core.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square extends Figure{

    public double a;

    public void areaOfSquare(){
        System.out.println("Площадь квадрата равна: " + a * a + " cm");
    }
}
