package thread;

public class RunablePrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable");
    }
}
