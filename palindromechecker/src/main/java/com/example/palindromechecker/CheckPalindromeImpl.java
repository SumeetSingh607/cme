package com.example.palindromechecker;

public class CheckPalindromeImpl implements CheckPalindrome{


    //method to check palidrome
    public void isPalindrome(String text)
    {
        StringBuilder plain = new StringBuilder(text.toLowerCase());
        StringBuilder reverse = plain.reverse();
        if((reverse.toString()).equals(text)) {
           PalindromeService.message = "The input text is a palindrome";
        }
        else {
            PalindromeService.message = "The input text is not a palindrome";
        }

    }

}
