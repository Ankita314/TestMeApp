Feature: Demo web shop login

this is a test to show demos

 

Scenario Outline: Valid Login

Given demoWebshop site is open

When demowebshop "<login>" plus "<password>" is provided

Then  demowebshop login page should be displayed

 

Examples:
|login|password|
|ar1@gmail.com|ar12345|
|ar2@gmail.com|ar12345|

