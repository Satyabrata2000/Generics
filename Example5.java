package Generics;

//Generic method. A method that can accept any type of arguments.

//below is an example of java generic method to print an array of elements. Using E to denote the element.

public class Example5 {

    public static <E> void printArray(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }

}
