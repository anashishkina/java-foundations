package core.hw;

    public class Triangle extends Figure {
        public Triangle(double a, double b, double c) {
            super(a, b, c);
        }

        public void areaOfTriange(){
           double p;
           p = (a + b + c)/2;
           double s;
           s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

           System.out.println("Площадь треугольника равна: " + s + " cm");
       }
}
