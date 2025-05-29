package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        Queue <Object> q = new ConcurrentLinkedQueue<>();
        Semaphore producerSmaphore = new Semaphore(4);
        Semaphore consmerSemaphore = new Semaphore(0);

        ProducerTask p1 = new ProducerTask(q, 6, "p1",producerSmaphore,consmerSemaphore);
        ProducerTask p2 = new ProducerTask(q, 6, "p2",producerSmaphore,consmerSemaphore);
        ProducerTask p3 = new ProducerTask(q, 6, "p3",producerSmaphore,consmerSemaphore);
        ProducerTask p4 = new ProducerTask(q, 6, "p4",producerSmaphore,consmerSemaphore);
        ProducerTask p5 = new ProducerTask(q, 6, "p5",producerSmaphore,consmerSemaphore);

        ConsumerTask c1 = new ConsumerTask(q, 6, "c1",producerSmaphore,consmerSemaphore);
        ConsumerTask c2 = new ConsumerTask(q, 6, "c2",producerSmaphore,consmerSemaphore);
        ConsumerTask c3 = new ConsumerTask(q, 6, "c3",producerSmaphore,consmerSemaphore);
        ConsumerTask c4 = new ConsumerTask(q, 6, "c4",producerSmaphore,consmerSemaphore);
        ConsumerTask c5 = new ConsumerTask(q, 6, "c5",producerSmaphore,consmerSemaphore);
        ConsumerTask c6 = new ConsumerTask(q, 6, "c6",producerSmaphore,consmerSemaphore);
        ConsumerTask c7 = new ConsumerTask(q, 6, "c7",producerSmaphore,consmerSemaphore);
        ConsumerTask c8 = new ConsumerTask(q, 6, "c8",producerSmaphore,consmerSemaphore);
        ConsumerTask c9 = new ConsumerTask(q, 6, "c9",producerSmaphore,consmerSemaphore);
        ConsumerTask c10 = new ConsumerTask(q, 6, "c10",producerSmaphore,consmerSemaphore);

        

        Thread t1 = new Thread(p1,"p1");
        t1.start();
        Thread t2 = new Thread(p2, "p2");
        t2.start();
        Thread t3 = new Thread(p2, "p3");
        t3.start();
        Thread t4 = new Thread(p2, "p4");
        t4.start();
        Thread t5 = new Thread(p2, "p5");
        t5.start();

        Thread t6 = new Thread(c1, "c1");
        t6.start();
        Thread t7 = new Thread(c2, "c2");
        t7.start();
        Thread t8 = new Thread(c3, "c3");
        t8.start();
        Thread t9 = new Thread(c4, "c4");
        t9.start();
        Thread t10 = new Thread(c5, "c5");
        t10.start();
        Thread t11 = new Thread(c6, "c6");
        t11.start();
        Thread t12 = new Thread(c7, "c7");
        t12.start();
        Thread t13 = new Thread(c8, "c8");
        t13.start();
        Thread t14 = new Thread(c9, "c9");
        t14.start();
        Thread t15 = new Thread(c10, "c10");
        t15.start();
        

        

         


        






    }
    
}
