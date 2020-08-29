package thread;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        //       for (int i = 0; i < 10; i++) {
//            Thread.sleep(2000L);//
//            System.out.print("A ");

        //       }
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.print("B ");

//        }

        Thread threadA = new Printer("A", 2000L);
        Thread threadB = new Printer("B", 3000L);

        System.out.println("START");
        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
        System.out.println("END");

        RunablePrinter runablePrinter = new RunablePrinter();
        Thread threadFromRunnable = new Thread(runablePrinter);
        threadFromRunnable.start();
















    }
}
