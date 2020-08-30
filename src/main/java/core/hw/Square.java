package core.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square {
     private final int storona;

     public void areaOfSquare(){
         System.out.println("Площадь квадрата равна: " + storona * storona + " cm");

     }
}
