package main.java;

import main.java.exception.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckOut intNumber = new CheckOut();
        System.out.print("Enter the text to check for the palindrome: ");
        String text = scanner.nextLine();
        try {
            CheckOut.isPalindrome(text);
        } catch (NotPalindromeException e) {
            System.out.println(e.getMessage());
        }
        try {
            intNumber.randomNumber();
        } catch (IntOddNumberException | GreaterThanHundredException e) {
            System.out.println(e.getMessage());
        }
        try {
            CheckOut random = new CheckOut();
            random.randomObject();
        } catch (NullObjectException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}


