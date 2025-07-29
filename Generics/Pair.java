package Generics;

public class Pair<T, V> {

    private T first;
    private V second;

    public Pair(T first, V seceond) {
        this.first = first;
        this.second = seceond;
    }

    public T getFIrst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

}
