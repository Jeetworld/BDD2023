Feature: this is feature 2.0

@Smoke
Scenario Outline: this is scenario outline..
Given I have lnk cred
When I enter the username as "<username>" and password as "<password>"
Then it should land me to homepage
Examples: 
| username | password |
| tiny | tiny123 |
| winy | winy123 |
| kiny | kiny123 |