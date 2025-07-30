package Generics;

public class Pair<T, V> {

    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    // public T getFIrst() {
    // return first;
    // }

    // public V getSecond() {
    // return second;
    // }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <T, V> void doSomething(T data1, V data2) {

        System.out.println("T-data : " + data1 + "V-data : " + data2);

        // static method can invock without class object also data1 and data2 can't
        // access in non static methods

    }

}
