package core.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle {

    private final double storona1;
    private final double storona2;
    private final double storona3;

    public void areaOfTriange(){
        double p;
        p = (storona1 + storona2 + storona3)/2;
        double s;
        s = Math.sqrt(p * (p - storona1) * (p - storona2) * (p - storona3));

        System.out.println("Площадь треугольника равна: " + s + " cm");
    }
}
