Feature: Login Functionality
Scenario: Login with correct credentials
Given User is at the login screen
When User enters username
And User enters password
And User click on login button
Then User should see the home page

Scenario: Validate title
Given User is at the login page
Then Page title should get display


