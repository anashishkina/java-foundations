package thread;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Printer extends Thread {
    private final String message;
    private final long sleepMLs;

    @SneakyThrows
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            Thread.sleep(sleepMLs);
            System.out.print(message + " ");

        }
    }
}
