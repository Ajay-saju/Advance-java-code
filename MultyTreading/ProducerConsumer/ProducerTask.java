package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerTask implements Runnable {

    private Queue<Object> q;
    private int maxsize;
    private String threadName;
    private Semaphore producerSemaphore;
    private Semaphore consmerSemaphore;

    public ProducerTask(Queue<Object> q, int maxsize, String threadName, Semaphore producerSmaphore, Semaphore consmerSemaphore) {

        this.q = q;
        this.maxsize = maxsize;
        this.threadName = threadName;
        this.consmerSemaphore=consmerSemaphore;
        this.producerSemaphore=producerSmaphore;
    }

    

    @Override
    public void run() {
        // Add product if store have empty space

        while (true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            if (q.size() <= maxsize) {
                System.out
                        .println("Adding product with producer name " + threadName + " and the size is " + q.size());
                q.add(new Object());

            }
            consmerSemaphore.release();
        }
    }

}
