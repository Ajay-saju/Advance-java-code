package ExicuterService.demo;

public class PrintNumTask implements Runnable {

    private int num;

    public PrintNumTask(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Num = " + num + "thread name = " + Thread.currentThread().getName());
    }

}
