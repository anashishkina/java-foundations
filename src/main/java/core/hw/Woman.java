package core.hw;

public class Woman extends Person {


    public Woman(String name, boolean isMale, int age) {
        super(name, isMale, age);
    }

    @Override
    public void printAge(){
        System.out.println("Мой возраст: всегда 18");
    }
}
