package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("String 1");
        list.add("String 2");
        String s = list.get(3);
        System.out.println(s);

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
