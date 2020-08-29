package oop1;

public class Men {

    public static void main(String[] args) {
        Man vasya = new Man("Vasya", 33, 180);
        Man lesha = new Man("Lesha", 25, 176);
        Man anton = new Man("Anton", 55, 202);

        System.out.println("vasya.getName() = " + vasya.getName());
        vasya.setName("Vasiliy");
        System.out.println("vasya.getName() = " + vasya.getName());

        System.out.println("lesha.getName() = " + lesha.getName());
        lesha.setName("Aleksey");
        System.out.println("lesha.getName() = " + lesha.getName());

        System.out.println("anton.getName() = " + anton.getName());
        anton.setName("Antonio");
        System.out.println("anton.getName() = " + anton.getName());

        System.out.println("vasya.getAge() = " + vasya.getAge());
        vasya.setAge(43);
        System.out.println("vasya.getAge() = " + vasya.getAge());

        System.out.println("lesha.getAge() = " + lesha.getAge());
        lesha.setAge(15);
        System.out.println("lesha.getAge() = " + lesha.getAge());

        System.out.println("anton.getAge() = " + anton.getAge());
        anton.setAge(25);
        System.out.println("anton.getAge() = " + anton.getAge());

        System.out.println("vasya.getHeight() = " + vasya.getHeight());
        vasya.setHeight(185);
        System.out.println("vasya.getHeight() = " + vasya.getHeight());

        System.out.println("lesha.getHeight() = " + lesha.getHeight());
        lesha.setHeight(180);
        System.out.println("lesha.getHeight() = " + lesha.getHeight());

        System.out.println("anton.getHeight() = " + anton.getHeight());
        anton.setHeight(198);
        System.out.println("anton.getHeight() = " + anton.getHeight());

    }
}
