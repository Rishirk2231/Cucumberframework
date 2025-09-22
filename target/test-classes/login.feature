Feature: Login functionality to check in that page

Scenario: Login the test page

Given User launches the test page
When User enters a emailid
And User enters a password
And User clicks a signin button
Then User should redirect to the dashboard page