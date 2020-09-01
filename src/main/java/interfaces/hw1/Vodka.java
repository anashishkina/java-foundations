package interfaces.hw1;

public class Vodka {

    private double volumeOfBottle;
    private String brand;
    private String land; //типа страна происхождения
    private int amountOfBottles;

    public Vodka(double volumeOfBottle){
        this.volumeOfBottle = volumeOfBottle;
    }

    public Vodka(double volumeOfBottle, String brand){
        this.volumeOfBottle = volumeOfBottle;
        this.brand = brand;
    }

    public Vodka(double volumeOfBottle, String brand, String land){
        this.volumeOfBottle = volumeOfBottle;
        this.brand = brand;
        this.land = land;
    }

    public Vodka(double volumeOfBottle, String brand, String land, int amountOfBottles){
        this.volumeOfBottle = volumeOfBottle;
        this.brand = brand;
        this.land = land;
        this.amountOfBottles = amountOfBottles;
    }

}
