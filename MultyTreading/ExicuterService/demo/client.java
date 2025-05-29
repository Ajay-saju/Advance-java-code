package ExicuterService.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {

    // print numbers 1 to 50 using new thread but max thread limited to 10.
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i = 1; i<=50 ; i++){
            PrintNumTask obj = new PrintNumTask(i);
            service.submit(obj);
        }
        service.shutdown();
        
    }
}
