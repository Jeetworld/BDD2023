Feature: Perform the login page testing

Scenario Outline: Connect to Login Page with different set of test data
Given I navigate to netmeds app
When I enter "<username>" and "<password>"
Then it should show correct page
Examples:
| username | password |
| KEERTHIKAA | Keerthi@10000 |
| KEERTHIKA | Keerthi@1000P |
| KEERTHIKA | Keerthi@1000 |
