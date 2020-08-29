package oop1;

public class Man {
    private String name;
    private int age;
    private int height;

    public Man(String name, int age, int height) {
        System.out.println("Мы создали нового мужика по имени: " + name + ", возрастом " + age + " и ростом " + height);
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){return name;}
    public int getAge() {return age; }
    public int getHeight(){return height;}

    public void setName (String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(int height){
        this.height = height;
    }
}
