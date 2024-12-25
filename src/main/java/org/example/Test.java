package org.example;

public class Test implements Runnable {
    String lockObjectOne= "object one";
    public void run()
    {
        synchronized (lockObjectOne) {


            System.out.println("thread is running"+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Test test1= new Test();
        Thread t1 = new Thread(test1);
        t1.start();
        Test test2= new Test();
        Thread t2 = new Thread(test2);
        t2.start();

    }


}
