package interfaces.compare.hw2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person> {

    private final String name;
    private final String surname;
    private int age;


    @Override
    public int compareTo(Person person) {
        if (!name.equals(person.name)){
            return -1;
        }else if (!surname.equals(person.surname)){
            return 1;

        }else if (age != person.age){
            return 0;
        }else {
        return 10;
    }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    }
