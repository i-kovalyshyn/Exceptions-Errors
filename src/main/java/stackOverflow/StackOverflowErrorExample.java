package main.java.stackOverflow;

class StackOverflowErrorExample {

   private static int recursivePrint(int num)  {

        System.out.println("Number: " + num);

        if(num == 0) {
            return 0;
        } else
            return  recursivePrint(++num);
    }

    public static void main(String[] args) {

        StackOverflowErrorExample.recursivePrint(1);
    }
}
