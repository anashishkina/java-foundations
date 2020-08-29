package thread.lecture2;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import lombok.SneakyThrows;

public class ThreadPractice2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        //       Runnable runnable = new Runnable(){
        //           @Override
        //           public void run(){

        //           }
        //       };
        //       Runnable runnable = () -> {
        //           System.out.println("Yo");
        //       };

//        runnable.run();

//        new Thread(() -> System.out.println("yo-yo")).start();

//        new Object().notifyAll();

        //       Object obj = new Object();
        //     synchronized (obj){
        //          obj.wait();
//        }

        ThreadPractice2 threadPractice2 = new ThreadPractice2();

        Thread t1 = new Printer(1, threadPractice2);
        Thread t2 = new Printer(2, threadPractice2);
        Thread t3 = new Printer(3, threadPractice2);
        Thread t4 = new Printer(4, threadPractice2);

        t4.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }

    @SneakyThrows

    public synchronized void print(int num) {

        System.out.println("Start thread " + num);

        System.out.println("Wait begin...");
        if (num == 2) {
            this.notifyAll();
        } else {
            this.wait();
            System.out.println("Wait end...");

            System.out.println("End thread " + num);

        }


    }
}


