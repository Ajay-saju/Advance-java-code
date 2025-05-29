public class PrintNumbers implements Runnable {

    private String i;

    public PrintNumbers(String i) {

        this.i = i;

    }

    

    @Override
    public void run() {

        System.out.println(i + Thread.currentThread().getName());
        System.out.println();
        
    }

    public void don(){
        System.out.println("Do something ");
    }

}
