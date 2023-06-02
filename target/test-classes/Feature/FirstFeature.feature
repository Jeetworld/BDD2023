Feature: This is a feature 1.0

@Smoke
Scenario: this is first scenario of first feature file

Given I have cred for fb
When I login with correct username "Rick" and password "Which"
#username and passsword are dynamic values which are featched from external file
Then Homepage should show with correct data
And I can operate fb application
But only as a end user

@Regression
Scenario: this is second scenario of first feature file

Given I have gmail cred
When I enter gmail username and password
And hit login button
Then I will redirect to homepage of gmail