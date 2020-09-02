package collections.list.hw1;


import java.util.ArrayList;

public class MainPeople {
    public static void main(String[] args) {

        //Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
        //с имя начинается на Н я чето не сообразила как

        ArrayList<Person> persons = new ArrayList<>();

        Person ivan = new Person("Ivan", "male", 22);
        Person nikita = new Person("Nikita", "male", 16);
        Person elena = new Person("Elena", "female", 24);
        Person nikolay = new Person("Nikolay", "male", 21);
        Person anton = new Person("Anton", "male", 29);
        Person natalia = new Person("Natalia", "female", 10);

        persons.add(0,ivan);
        persons.add(1, nikita);
        persons.add(2, elena);
        persons.add(3, nikolay);
        persons.add(4, anton);
        persons.add(5, natalia);

        System.out.println();
        System.out.println(persons);
        System.out.println();
        System.out.println();

        for (Person p : persons){
            if ((p.getAge() >= 18) && (p.getAge() <= 27) && p.getGender().equals("male")){
                System.out.println(p);
            }
        }
        int sumAge = 0;
        int i = 0;

        for (Person p2 : persons){
            if (p2.getGender().equals("female")){
                    sumAge = sumAge + p2.getAge();
                    ++i;

            }

        }
        System.out.println("Средний возраст женщин: " + sumAge / i);


    }
}
