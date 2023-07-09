package com.example.palindromechecker;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    UserResponse response = new UserResponse();

    CheckPalindrome cp = new CheckPalindromeImpl();
    static String message;


    @Cacheable(cacheNames = {"palindromeCache"}, key="#input.text") //caches the method result with 'input.text' as key
    public UserResponse process(UserRequest input) {

        //simulates back end delay verifying caching
        simulateBackendCall();

        String inputText = input.getText();

        //checking if the UserInput.text is empty | contains numbers | contains white spaces | contains both
        if(Validations.validateInputText(inputText)) {
            message = "The input text is either empty OR contains whitespaces and/or numbers. Please give a valid String input.";
        }
        else {
            cp.isPalindrome(inputText);
        }

        return buildResponse(input);
    }

    //temp method to mimic backend processing delay
    public void simulateBackendCall() {
        try {
            System.out.println("------------- Going to sleep for 2 seconds to simulate Backend Delay -----------");
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    //method to build response object
    public UserResponse buildResponse(UserRequest input)
    {
        response.setUsername(input.getUsername());
        response.setText(input.getText());
        response.setMessage(message);

        return response;
    }
}
