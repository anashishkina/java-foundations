package collections.list.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //а). Создать пустой список
        List<Movie> movies = new ArrayList<>();
        Movie hp1 = new Movie("Philosopher Stone", "Chris Columbus", 2001);
        Movie hp2 = new Movie("Chamber of Secrets", "Chris Columbus", 2002);
        Movie hp3 = new Movie("Prisoner of Azkaban", "Alfonso Cuarón", 2004);
        Movie hp4 = new Movie("Goblet of Fire", "Mike Newell", 2005);
        Movie hp5 = new Movie("Order of the Phoenix", "David Yates", 2007);
        Movie hp6 = new Movie("Half-Blood Prince", "David Yates", 2009);
        Movie hp7 = new Movie("Deathly Hallows: Part I", "David Yates", 2010);
        Movie hp8 = new Movie("Deathly Hallows: Part II", "David Yates", 2011);

        //б). Создать список размером 20
        List<Movie> movies2 = new ArrayList<>(20);

        //а) Добавить подряд 5 элементов.
        movies.add(hp1);
        movies.add(hp2);
        movies.add(hp3);
        movies.add(hp4);
        movies.add(hp5);
        System.out.println(movies);

        // Получить первый элемент
        System.out.println();
        System.out.println("movies.get(0) = " + movies.get(0));

        //Получить последний элемент
        System.out.println();
        System.out.println("movies.get(4) = " + movies.get(4));

        //Добавить шестой элемент в третию позицию.
        movies.add(hp6);
        movies.add(hp7);
        movies.add(hp8);
        System.out.println();
        System.out.println(movies);

        movies.add(2,hp6);
        System.out.println();
        System.out.println(movies);

        //Добавить седьмой элемент в первую позицию.

        movies.add(0,hp7);
        System.out.println();
        System.out.println(movies);

        //Записать в новый список все элементы предыдущего списка.
        ArrayList<Movie> movies3 = new ArrayList<>(movies);
        System.out.println();
        System.out.println(movies3);

        //а) Удалить элемент по значению

        movies.remove(hp7);
        System.out.println();
        System.out.println(movies);

        //б) Удалить элемент по индексу

        movies.remove(1);
        System.out.println();
        System.out.println(movies);

        //4. Проверить наличие элемента
        System.out.println();

        if(movies.contains(hp2)){
            System.out.println("Элемент есть");
        }else {
            System.out.println("Элемента нет");
        }

        //а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
        System.out.println();
        System.out.print("List: {");
        for (int i = 0; i < movies.size(); i++) {
            System.out.print(movies.get(i) + " , ");

        }
        System.out.print("}");

        //а) Условие на индекс: Индекс делится на 3
        System.out.println();
        for (Movie m : movies){
            if (movies.indexOf(m) % 3 == 0){
                System.out.println(m);
            }
        }
        System.out.println();

        //б) Условие на значение: Вернуть количество элементов, которые равны "***"

        for (Movie mo : movies){
            if (mo.getRegie().equals("David Yates")){
                System.out.println(mo);
            }
        }

        //а) Пропустить первые 3 элемента в списке.
        System.out.println();
        for (Movie m1 : movies){
            if (movies.indexOf(m1) > 2){
                System.out.println(m1);
            }
        }

        //а) Пропустить первые 2 элемента, которые равные "****"
        System.out.println();
        for (Movie m2 : movies){
            if (!m2.getRegie().equals("Mike Newell") && !m2.getRegie().equals("Alfonso Cuarón")){
                System.out.println(m2);
            }

        }

        //а) Возращаем Первый элемент Делящийся на 3.
        System.out.println();
        for (Movie m3 : movies){
            if (movies.indexOf(m3) % 3 == 0 && movies.indexOf(m3) != 0){
                System.out.println(m3);
                break;
            }
        }

        //а) Возвращаем все элементы делящиеся на 3
        System.out.println();
        for (Movie m3 : movies){
            if (movies.indexOf(m3) % 3 == 0 && movies.indexOf(m3) != 0){
                System.out.println(m3);
            }
        }

















    }
}
