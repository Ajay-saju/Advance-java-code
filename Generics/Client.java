package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        // Pair<Integer,String> pair = new Pair<>(10, "SAMPLE");

        // System.out.println("Pair.first : "+ pair.getFIrst());
        // System.out.println("Pair.second : "+ pair.getSecond());

        // Pair<Integer,Float> pair2 = new Pair<Integer,Float>(22, 3.14f);

        // System.out.println("Pair.first : "+ pair2.getFIrst());
        // System.out.println("Pair.second : "+ pair2.getSecond());

        // Pair.doSomething("calling static method ", 2);

        Pair<String, Integer> pair = new Pair<>("One", 1);
        System.out.println(pair.getFirst() + ", " + pair.getSecond()); // Output: ?

        Animal a = new Animal();
        Dog d = new Dog();

        List<Animal> aList = new ArrayList<>();
        List<Dog> dList = new ArrayList<>();

        a.doSomething(aList);
        d.doSomethingDog(dList);

        a.doSomething(dList);
        d.doSomethingDog(aList);

    }
}
