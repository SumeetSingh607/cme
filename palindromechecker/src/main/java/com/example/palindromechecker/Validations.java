package com.example.palindromechecker;

public class Validations {

    //to check if the input text contains any numbers or whitespaces
    public static boolean validateInputText(String text)
    {

        if(text.isEmpty() | (text.contains(" ") || isNumeric(text)))
            return true;

        return false;

    }

    public static boolean isNumeric(String text) {

        char[] chars = text.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
