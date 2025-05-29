package Synchronization_Problm;

import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Runnable {
    private Count count;
    private ReentrantLock lock;

    public Subtractor(Count count, ReentrantLock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        
        // lock.lock();


        synchronized(count){

             for (int i = 0; i < 100000; i++) {
            count.value -= 1;
        }
        }
        
       
        // lock.unlock();

    }

}
