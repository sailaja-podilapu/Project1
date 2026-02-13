Feature: Homepage_login
Scenario: Validate google search is working
Given browser is open
And user is on google search page 
When user entered a text in search bar
Then user is navigated to test results 




