package object.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {

    private final String name;
    private int age;
    private int height;

    @Override
    public String toString(){
        return "Человек по имени " + name + " возрастом " + age + " лет и ростом " + height + " cm";

    }
}
