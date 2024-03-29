package main.java.exception;

import java.util.Optional;
import java.util.Random;

public class CheckOut {

    public static void isPalindrome(String text) throws NotPalindromeException {
        text = text.replaceAll("\\W", "");//delete unnecessary symbols
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();

        if (text.equalsIgnoreCase(invertedText)) {
            System.out.println("Yes, it is palindrome!");
        } else {
            throw new NotPalindromeException("Exception: your text is not palindrome :(");
        }
    }

    public void randomNumber() throws IntOddNumberException, GreaterThanHundredException {
        Random random = new Random();
        int number = random.nextInt(200);
        if (number % 2 == 0) {
            System.out.println("Cool! even number -" + number + " -is  dropped out in random condition");
        } else if (number > 100) {
            throw new GreaterThanHundredException("Exception: number-" + number + "- greater than 100");
        } else {
            throw new IntOddNumberException("Exception: odd number-" + number + "-");
        }
    }

    public void randomObject() throws NullObjectException {
        String[] arr = {null, "object"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        if (Optional.ofNullable(arr[randomNumber]).isEmpty()) {
            throw new NullObjectException("Exception: Object is null");

        } else {
            System.out.println("It is - " + arr[randomNumber]);
        }
    }
}
