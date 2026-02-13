Feature:Test login functionality
Scenario Outline: check login is succesful with
Given browser is open
And user is on google search page
When user enters <username> and <password>
And  user clicks on login
Then user is navigated to home page
Examples:
|username|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|sailu|12345|