package Generics;

public class Client {
    public static void main(String[] args) {
        
        Pair<Integer,String> pair = new Pair<Integer,String>(10, "SAMPLE");

        System.out.println("Pair.first : "+ pair.getFIrst());
        System.out.println("Pair.second : "+ pair.getSecond());


        Pair<Integer,Float> pair2 = new Pair<Integer,Float>(22, 3.14f);

        System.out.println("Pair.first : "+ pair2.getFIrst());
        System.out.println("Pair.second : "+ pair2.getSecond());
    }
}
