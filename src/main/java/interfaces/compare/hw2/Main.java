package interfaces.compare.hw2;

import lombok.SneakyThrows;

import java.util.Arrays;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        Person anton = new Person("Anton", "Ivanov", 33 );
        Person anton2 = new Person("Anton", "Petrov", 43);
        Person anton3 = new Person("Anton", "Ivanov", 33 );
        Person anton4 = new Person("Anton", "Ivanov", 35);
        Person elena = new Person("Elena", "Sidorova", 22);

        System.out.println("anton.compareTo(anton3) = " + anton.compareTo(anton3));
        System.out.println("anton.compareTo(anton2) = " + anton.compareTo(anton2));
        System.out.println("anton.compareTo(anton4) = " + anton.compareTo(anton4));
        System.out.println("anton.compareTo(elena) = " + anton.compareTo(elena));

        Person[] people = {anton, anton2, elena};
        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        Person elena2 = (Person) elena.clone();
        System.out.println("elena2 = " + elena2);




    }
}
