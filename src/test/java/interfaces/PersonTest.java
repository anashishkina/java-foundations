package interfaces;

import interfaces.compare.hw2.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("В классе Person должны: ")
public class PersonTest {

    @Test
    @DisplayName("Корректно работать конструктор: ")
    public void CorrectConstructor(){
        Person newPerson = new Person("Ivan", "Smirnov", 22);

        assertEquals("Ivan", newPerson.getName());
        assertEquals("Smirnov", newPerson.getSurname());
        assertEquals(22, newPerson.getAge());
    }

    @Test
    @DisplayName("Корректно работать сеттер фамилии:")
    public void CorrectSetterForSurname(){
        Person anotherPerson = new Person("Elena", "Ivanova", 30);
        anotherPerson.setSurname("Smirnova");

        assertEquals("Smirnova", anotherPerson.getSurname());
    }

    @Test
    @DisplayName("Корректно работать метод compareTo")
    public void CorrectWorkOfCompareTo(){
        Person testPerson = new Person("Ivan", "Petrov", 44);
        Person testPerson2 = new Person("Petr", "Petrov", 44);

        assertEquals(-1, testPerson.compareTo(testPerson2));
    }


}
