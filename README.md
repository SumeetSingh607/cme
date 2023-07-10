# cme

1. Download the project and import in to an IDE. Make suret that the Spring annocations are recognised by the IDE.
2. Run 'PalindromecheckerApplication.java' as a spring application. Console should show the start ups messages.
3. Open Postman and create a new collection.
4. Hit 'localhost:8080/checkpalindrome' with request body as below:-
   {
    "username":"sumeet",
    "text":"madam"
    }

5. The repose should contain 'username', 'text' and 'message' saying whether the input text is a palnidrome or not.
6. This application has caching enabled. So to mimic a backend delay for the first instance, I have put a 2 sec delay. So, when you hit the end point with same text input more than one time, response is retrived from the cache wihtout the 2 sec delay.
