package main.java;

import main.java.exception.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntNumber intNumber = new IntNumber();
        System.out.print("Enter the text to check for the palindrome: ");
        String text = scanner.nextLine();
        try {
            IsPalindrome.isPalindrome(text);
        } catch (NotPalindromeException e) {
            System.out.println(e.getMessage());
        }
        try {
            intNumber.randomNumber();
        } catch (IntOddNumberException|GreaterThanHundredException e) {
            System.out.println(e.getMessage());
        }
        try{
            IntNumber random = new IntNumber();
            random.randomObject();
        }catch (NullObjectException e){
            System.out.println(e.getMessage());
        }

        scanner.close();

    }

}


