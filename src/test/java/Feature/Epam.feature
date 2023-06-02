Feature: This is the feature to test Data Table functionality

Background: 
Given I have user credentials

@REGRESSIONTESTS
Scenario Outline:
Given I have admin user credentials
When I open the login page
And enter the "<username>" and "<password>"
Then It should redirect me to Homepage
Examples:
| username | password |
| ABC | pass123 |
| EEE | pass234 |
| YYY | pass345 |


@SMOKETESTS
Scenario:
Given I want to login in Twitter 
When I enter the login details for below users
|	Rahul 	| Ankit | Tutu	| Manish	| Agam |
Then I am able to login for every user

