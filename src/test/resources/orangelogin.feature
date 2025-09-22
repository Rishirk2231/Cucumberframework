Feature: Login functionality for orange hrm page

Background:
Given User launches the orange hrm page

Scenario: Need to login for orange hrm page

When User enters a username for the login page
And User enters a password for the login page
And User clicks a login button for login page
Then User should see the dashboard page for orange hrm



Scenario: Login with parameter based credentials

When User enters a username "Admin" for the login page
And User enters a password "admin123" for the login page
And User clicks a login button for login page
Then User should see the dashboard page for orange hrm


@Outline
Scenario Outline: Login with Invalid credentials

When User enters a username "<username>" for the login page
And User enters a password "<password>" for the login page
And User clicks a login button for login page
Then User should see the dashboard page for orange hrm

Examples:

|username|password|
|Admin   |admin123|
|Admin   |admin123|
|Admin   |admin123|