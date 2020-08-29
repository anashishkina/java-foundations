package oop1;

public class Mediamarkt {
    public static void main(String[] args) {

        Notebook macbook = new Notebook("Apple", 128);
        Notebook aser = new Notebook("Aser", 512);
        Notebook asus = new Notebook("Asus", 256);

        System.out.println("macbook.getFirm() = " + macbook.getFirm());
        macbook.setFirm("Apple MacBook");
        System.out.println("macbook.getFirm() = " + macbook.getFirm());

        System.out.println("aser.getMemory() = " + aser.getMemory());
        aser.setMemory(256);
        System.out.println("aser.getMemory() = " + aser.getMemory());

        System.out.println("asus.getFirm() = " + asus.getFirm());
        asus.setFirm("Asus ZenBook");
        System.out.println("asus.getFirm() = " + asus.getFirm());
    }
}
