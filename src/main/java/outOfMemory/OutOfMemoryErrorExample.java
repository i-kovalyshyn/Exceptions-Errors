package main.java.outOfMemory;


public class OutOfMemoryErrorExample {


    public static void main(String[] args)  {
        Integer[] integers = new Integer[100000 * 100000];
        System.out.println(integers);
    }
}
