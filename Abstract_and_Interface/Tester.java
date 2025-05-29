package Abstract_and_Interface;
public class Tester {
    public static void main(String[] args) {
        Animal obj1  = new Dog();
        Dog obj2 = new Dog();
        obj1.sleep();
        obj1.produceSound();
        obj1.action();
        obj1.sleep();
        obj2.action();
    }
}
