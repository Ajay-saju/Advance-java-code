package Synchronization_Problm;

import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {

       Count count = new Count();
       ReentrantLock lock = new ReentrantLock();

        Adder adder = new Adder(count,lock );
        Subtractor subtractor = new Subtractor(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new  Thread(subtractor);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        

        
        System.out.println(count.value);
        
    }
}
