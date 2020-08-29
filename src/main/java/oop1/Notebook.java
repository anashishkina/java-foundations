package oop1;

public class Notebook {

    private String firm;
    private int memory;

    public Notebook(String firm, int memory){
        System.out.println("Ноутбук марки: " + firm + " с объемом памяти: " + memory);
        this.firm = firm;
        this.memory = memory;
    }

    public String getFirm(){return firm;}
    public int getMemory(){return memory;}

    public void setFirm(String firm){
        this.firm = firm;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }
}
