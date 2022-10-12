package Generics;

//Generic class - A class that can refer to any type is known as generic class
public class Example3<T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}
