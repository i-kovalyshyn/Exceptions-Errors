package main.java;

import main.java.exception.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckOut object = new CheckOut();
        System.out.print("Enter the text to check for the palindrome: ");
        String text = scanner.nextLine();
        try {
            CheckOut.isPalindrome(text);
        } catch (NotPalindromeException e) {
            System.out.println(e.getMessage());
        }
        try {
            object.randomNumber();
        } catch (IntOddNumberException | GreaterThanHundredException e) {
            System.out.println(e.getMessage());
        }
        try {
            object.randomObject();
        } catch (NullObjectException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}


