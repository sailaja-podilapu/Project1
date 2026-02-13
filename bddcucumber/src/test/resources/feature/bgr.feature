Feature:login too HRM Applicatication
Background:
Given User is on HRMLogin page "http://opensource.demo.orange
@validCredentials 
Scenario:Login with valid Credentials
When user enters username as " " and password as "admin123"
Then user should be able to login successfully and new page open

@MissingUsername
Scenario:Login

When User enters username as"" and password as"admin123"
Then the user should be able see message"Requried"below Username


