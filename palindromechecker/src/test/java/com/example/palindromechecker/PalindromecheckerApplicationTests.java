package com.example.palindromechecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PalindromecheckerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void positiveTest()
	{
		CheckPalindrome cp = new CheckPalindromeImpl();
		cp.isPalindrome("teet");

		Assertions.assertEquals("The input text is a palindrome", PalindromeService.message);

	}

	@Test
	void negativeTest()
	{
		CheckPalindrome cp = new CheckPalindromeImpl();
		cp.isPalindrome("test");

		Assertions.assertEquals("The input text is not a palindrome", PalindromeService.message);

	}


}
