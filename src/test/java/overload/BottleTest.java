package overload;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("В классе Bottle должен: ")
public class BottleTest {

    @Test
    @DisplayName("Корректно работать конструктор: ")
    public void CorrectConstructor(){
        Bottle newBottle = new Bottle("Evian", 0.5, "plastic", 20);

        assertEquals("Evian", newBottle.getBrand());
        assertEquals(0.5, newBottle.getVolume());
        assertEquals("plastic", newBottle.getMatherial());
        assertEquals(20, newBottle.getHightInCm());
    }

    @Test
    @DisplayName("Корректно работать сеттер объема: ")
    public void CorrectSetterForBrand(){
        Bottle testBottle = new Bottle("Evian", 1.0, "glass", 25);
        testBottle.setVolume(1.5);

        assertEquals(1.5, testBottle.getVolume());
    }

    @Test
    @DisplayName("Тест для toString: ")
    public void BottleToString(){
        Bottle.color = "blue";
        Bottle anotherBottle = new Bottle("Evian", 0.5, "glass", 25);

        assertEquals("Bottle{brand='Evian', volume=0.5, matherial='glass', hightInCm=25, color=blue}", anotherBottle.toString());
    }


}
