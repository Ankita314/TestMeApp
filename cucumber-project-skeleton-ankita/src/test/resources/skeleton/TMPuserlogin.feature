Feature: Login
This is a test to Login in TestMeApp

@smoke @sanity 
Scenario: user can do the successful login
Given user is on testmeapp Login page
When  user provides the correct credentials
Then  user rendered to TestMeApp home page
 
@sanity 
Scenario: user did invalid login
Given testmeapp login page
When  user provides the incorrect credentials
Then  user gets an error message
 
@sanity 
Scenario: blank input
Given login page is open
When  user provided no credentials
Then  user gets blank error message