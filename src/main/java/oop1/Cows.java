package oop1;

public class Cows {

    private final String name;
    private String colour;
    private String age;
    private String Breed;

    public Cows(String name, String colour, String age, String Breed){
        System.out.println("Мы создали новую корову: " + name);
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.Breed = Breed;


    }
// Написать set get для поля nameBreed (у меня еще и colour)
    public String getName(){return name;}
    public String getColour(){return colour;}

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getBreed(){return Breed;}

    public void setBreed(String Breed){
        this.Breed = Breed;
    }



}
