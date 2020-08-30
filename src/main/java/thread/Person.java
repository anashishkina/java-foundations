package thread;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Person {
    private boolean isMale;
    private String name;
    private int age;


    public abstract void printAge();
}
