package interfaces;

public class WorkWithInterfaces {

    public static void main(String[] args) {

        Creatable gin = new Gin();
        gin.createWish();

        Creatable khotabich = new Khotabich();
        khotabich.createWish();

        Immortable gin2 = new Gin();
        gin2.jumpFrom17Floor();

    }
}
