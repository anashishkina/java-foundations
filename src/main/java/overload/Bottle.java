package overload;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bottle {
    private final String brand;
    private double volume;
    private final String matherial;
    private final int hightInCm;
    public static String color;


    public void printBottle(){
        System.out.println("Я бутылка" + this.toString());
    }



    @Override
    public String toString() {
        return "Bottle{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", matherial='" + matherial + '\'' +
                ", hightInCm=" + hightInCm +
                ", color=" + color +
                '}';
    }
}
