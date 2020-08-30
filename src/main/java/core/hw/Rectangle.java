package core.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle {

    private final int dlinna;
    private final int shirina;

    public void areaOfRectangle(){
        System.out.println("Площать прямоугольника равна: " + dlinna * shirina + " cm");
    }
}
