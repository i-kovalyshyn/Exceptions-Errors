package main.java.exception;

public class IsPalindrome {

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
}
