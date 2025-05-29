class Client {
    public static void main(String[] args) {
        System.out.println("Hello world " + Thread.currentThread().getName());

        // step 1 identify the task --- print hello world in a different tread

        // step 2 create a new class

        // step 3 Impliments the runneble interface in the newly created class

        // step 4 crete object for the task

        // PrintHelloworldTask task = new PrintHelloworldTask("Ajay");

        // step 5 crete new Tread

        // Thread t = new Thread(task);
        // t.start();

        // System.out.println("Bye bye ");

        for (int i = 1; i <= 10; i++) {

            String num = Integer.toString(i);
            PrintNumbers number = new PrintNumbers(num);
            Thread t = new Thread(number);
            t.start();
        }

    }
}