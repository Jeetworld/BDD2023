Feature: Perform the login page testing

Scenario Outline: Connect to Login Page with different set of test data


Given I have "<username>" and "<password>"
When I enter the cred and it shows me warning or not
Then it should show corresponding page
Examples:
| username | password |
| KEERTHIKAA | Keerthi@10000 |
| KEERTHIKA | Keerthi@1000P |
| KEERTHIKA | Keerthi@1000 |
