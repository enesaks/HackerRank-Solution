import java.io.IOException;
import java.lang.reflect.Method;

public class JavaGenerics {

    /*
    Problem
    https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
     */


    class Printer<T>{
        private T[] list;



        public void printArray(T[] list){
            for (T l : list) {
                System.out.println(l);
            }
        }


    }

    public class Solution {


        public void main(String args[]) {
            Printer myPrinter = new Printer();
            Integer[] intArray = { 1, 2, 3 };
            String[] stringArray = {"Hello", "World"};
            myPrinter.printArray(intArray);
            myPrinter.printArray(stringArray);
            int count = 0;

            for (Method method : Printer.class.getDeclaredMethods()) {
                String name = method.getName();

                if(name.equals("printArray"))
                    count++;
            }

            if(count > 1)System.out.println("Method overloading is not allowed!");

        }
    }

}
