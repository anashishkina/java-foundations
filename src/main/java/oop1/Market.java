package oop1;

public class Market {

    public static void main(String[] args) {

 //  Coздать пять коров
        Cows mashka = new Cows("Mashka", "Black", "5", "Yaroslavskaya");
        Cows murka = new Cows("Murka", "White", "3", "Krasnaya");
        Cows masya = new Cows("Masya", "Brown", "1", "Gollandskaya");
        Cows vanya = new Cows("Vanya", "White-Black", "4", "Yaroslavskaya");
        Cows burenka = new Cows("Burenka", "Grey", "7", "Krasnaya");

// Поменять цвет трем коровам
        System.out.println("mashka.getColour() = " + mashka.getColour());
        mashka.setColour("Brown");
        System.out.println("mashka.getColour() = " + mashka.getColour());

        System.out.println("murka.getColour() = " + murka.getColour());
        murka.setColour("Black");
        System.out.println("murka.getColour() = " + murka.getColour());

        System.out.println("burenka.getColour() = " + burenka.getColour());
        burenka.setColour("White");
        System.out.println("burenka.getColour() = " + burenka.getColour());
//В методе main сменить породу и вывести на экран
        System.out.println("masya.getBreed() = " + masya.getBreed());
        masya.setBreed("Krasnaya");
        System.out.println("masya.getBreed() = " + masya.getBreed());

        System.out.println("vanya.getBreed() = " + vanya.getBreed());
        vanya.setBreed("Gollandskaya");
        System.out.println("vanya.getBreed() = " + vanya.getBreed());


    }
}
