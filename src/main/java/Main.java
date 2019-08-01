package main.java;

import main.java.exception.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CheckOut object = new CheckOut();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the text to check for the palindrome: ");
            String text = scanner.nextLine();
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
    }
}


