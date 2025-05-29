public class PrintHelloworldTask implements Runnable {

    private String name;

    public PrintHelloworldTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello world "+ name  + Thread.currentThread().getName());
    }

}
