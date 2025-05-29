package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ConsumerTask implements Runnable {

    private Queue<Object> q;
    private int maxsize;
    private String threadName;
    Semaphore producerSmaphore;
    Semaphore consmerSemaphore;

    public ConsumerTask(Queue<Object> q, int maxsize, String threadName, Semaphore producerSmaphore,
            Semaphore consmerSemaphore) {
        this.q = q;
        this.maxsize = maxsize;
        this.threadName = threadName;
        this.producerSmaphore = producerSmaphore;
        this.consmerSemaphore = consmerSemaphore;
    }

    @Override
    public void run() {
        // Remove the product as soon as eny product available

        while (true) {
            try {
                consmerSemaphore.acquire();
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            if (q.size() > 0) {
                System.out
                        .println("Removing product with cunsumer name " + threadName + " and the size is " + q.size());
                q.remove();
            }
            producerSmaphore.release();
        }
    }

}
