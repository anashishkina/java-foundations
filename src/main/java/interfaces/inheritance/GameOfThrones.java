package interfaces.inheritance;

import interfaces.inheritance.classes.Child;
import interfaces.inheritance.classes.Father;
import interfaces.inheritance.classes.Mother;

public class GameOfThrones {

    public static void main(String[] args) {
        Father jemiem = new Father();

        Mother sersey = new Mother();

        Child joffrey = new Child();

        jemiem.giveLove();
        sersey.giveLove();

        System.out.println("Child");
        joffrey.giveLove();

        Child joffrey2 = new Child();
        joffrey2.giveLove();
    }





























}
