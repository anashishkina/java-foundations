package oop1;

public class Mvideo {
    public static void main(String[] args) {

        Telephone iphone = new Telephone("Apple", 64, "iOS", "green");
        Telephone honor = new Telephone("Honor", 128, "Android", "blue");
        Telephone samsung = new Telephone("Samsung", 512, "Android", "pink");

        System.out.println("iphone.getMark() = " + iphone.getMark());
        iphone.setMark("Iphone");
        System.out.println("iphone.getMark() = " + iphone.getMark());

        System.out.println("honor.getMemory() = " + honor.getMemory());
        honor.setMemory(256);
        System.out.println("honor.getMemory() = " + honor.getMemory());

        System.out.println("samsung.getOs() = " + samsung.getOs());
        samsung.setOs("Android 4.0");
        System.out.println("samsung.getOs() = " + samsung.getOs());

        System.out.println("iphone.getColour() = " + iphone.getColour());
        iphone.setColour("Gold");
        System.out.println("iphone.getColour() = " + iphone.getColour());
    }
}
