package oop1;

public class mall {
    public static void main(String[] args) {

        Shop spar = new Shop("Spar", "Food");
        Shop zara = new Shop("Zara", "Clothes");

        System.out.println("spar.getName() = " + spar.getName());
        spar.setName("Interspar");
        System.out.println("spar.getName() = " + spar.getName());

        System.out.println("zara.getProducts() = " + zara.getProducts());
        zara.setProducts("Shmotki");
        System.out.println("zara.getProducts() = " + zara.getProducts());
    }
}
