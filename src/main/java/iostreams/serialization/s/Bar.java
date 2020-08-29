package iostreams.serialization.s;

import java.io.*;

public class Bar {


    public static void main(String[] args) throws IOException {
        Person vitaluiy = new Person("Vitaliy", 29);
        Person vitya = new Person("Vitya", 33);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/vitaliy.out"))){
            outputStream.writeObject(vitaluiy);

        }catch (IOException e){
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/vitaliy.out"))){
            Person vitaliyFromFile = (Person) inputStream.readObject();
            System.out.println("vitaliyFromFile = " + vitaliyFromFile);
        } catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }



















    }
}
