package oop1;

public class Telephone {

    public String mark;
    public int memory;
    public String os;
    public String colour;

    public Telephone(String mark, int memory, String os, String colour){
        System.out.println("Новый телефон марки: " + mark);
        this.mark = mark;
        this.memory = memory;
        this.os = os;
        this.colour = colour;
    }

    public String getMark(){return mark;}
    public int getMemory(){return memory;}
    public String getOs(){return os;}
    public String getColour(){return colour;}

    public void setMark(String mark){
        this.mark = mark;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public void setOs(String os){
        this.os = os;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
}
