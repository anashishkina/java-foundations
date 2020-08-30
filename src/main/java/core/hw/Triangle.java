package core.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
    public class Triangle extends Figure {

        public double a;
        public double b;
        public double c;

        public void areaOfTriange(){
           double p;
           p = (a + b + c)/2;
           double s;
           s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

           System.out.println("Площадь треугольника равна: " + s + " cm");
       }
}
