package interfaces;

public class Gin implements Creatable, Immortable {

    @Override
    public void createWish() {
        System.out.println("Слушаюсь и повинуюсь");
    }

    @Override
    public void jumpFrom17Floor() {
        System.out.println("Я удачно прыгаю с 16 этажа");
    }
}
