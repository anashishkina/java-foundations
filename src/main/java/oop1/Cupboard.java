package oop1;

public class Cupboard {
    public static void main(String[] args) {

        Cup cup1 = new Cup("Black", 350, "Ceramic");
        Cup cup2 = new Cup("White", 500, "Glass");

        System.out.println("cup1.getColour() = " + cup1.getColour());
        cup1.setColour("Dark Blue");
        System.out.println("cup1.getColour() = " + cup1.getColour());

        System.out.println("cup2.getVolume() = " + cup2.getVolume());
        cup2.setVolume(420);
        System.out.println("cup2.getVolume() = " + cup2.getVolume());

        System.out.println("cup1.getMaterial() = " + cup1.getMaterial());
        cup1.setMaterial("Keramika");
        System.out.println("cup1.getMaterial() = " + cup1.getMaterial());
    }
}
