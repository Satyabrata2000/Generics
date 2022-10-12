package Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//going to use map elements using generics. Here we need to pass key and value.
public class Example2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "String 1");
        map.put(2, "String 2");
        map.put(3, "String 3");

        //now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry e = itr.next(); //no need to typecast
            System.out.println(e.getKey()+ " " +e.getValue());
        }
    }
}
