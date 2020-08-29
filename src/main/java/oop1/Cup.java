package oop1;


public class Cup {

    private String colour;
    private int volume;
    private String material;

    public Cup (String colour, int volume, String material){
        System.out.println("Цвет новой чашки: " + colour);
        this.colour = colour;
        this.volume = volume;
        this.material = material;
    }

    public String getColour(){return colour;}
    public int getVolume(){return volume;}
    public String getMaterial(){return material;}

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setMaterial(String material){
        this.material = material;
    }
}
