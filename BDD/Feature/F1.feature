Feature: Test the KSRTC application
Scenario: Test the login page with valid details
Given Open chrome browser and url of the application
When Enter Username , password and click on login button
Then Success in login

Scenario: Test the register page with valid details
Given Open chrome browser and url of the application1
When Enter Email , fullname , mobilenumber and click on add button
Then Success in add

Scenario: Test the booking page with valid details
Given Open chrome browser and url of the application2
When Enter From , to , departure , return1 and click on search button
Then Success in search