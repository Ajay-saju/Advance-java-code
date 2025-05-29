package Abstract_and_Interface;

abstract class Animal {
    String name;
    int age;

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
    void action (){
        System.out.println("Run");
    }

    // Abstract method
    abstract void produceSound();
    
}