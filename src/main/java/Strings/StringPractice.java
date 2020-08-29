package Strings;

public class StringPractice {
    public static void main(String[] args) {
        String str = " Я супер-строка ! ";
        System.out.println("str = " + str);
        str = str.trim();
        System.out.println("str = " + str);

        String name = "Nastya";
        String nameCopy = "Nastya";
        String constName = new String("Nastya");

        System.out.println(name == nameCopy);
        System.out.println(name == constName);

        constName = constName.intern();
        System.out.println(name == constName);

        name.equals(constName);













    }
}
