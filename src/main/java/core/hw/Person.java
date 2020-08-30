package core.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {

    private String name;
    private boolean isMale;
    private int age;

    public void printAge(){
        System.out.println("Возраст " + name + ": " + age);
    }

}
