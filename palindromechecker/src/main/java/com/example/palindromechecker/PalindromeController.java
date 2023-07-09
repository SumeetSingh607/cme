package com.example.palindromechecker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PalindromeController {

    @Autowired
    PalindromeService pc;

    @RequestMapping(value = "/checkpalindrome", method = RequestMethod.POST)
    public UserResponse checkPalindrome(@RequestBody UserRequest input) {

        return pc.process(input);
    }

}
