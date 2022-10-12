package Generics;

public class Example4 {

    public static void main(String[] args) {

        Example3 <Integer> m = new Example3<Integer>();
        m.add(2);
        System.out.println(m.get());
    }
}
