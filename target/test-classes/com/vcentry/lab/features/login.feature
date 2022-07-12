Feature: Validate Login
#background is for precondition
Background:Open browser and launch Url
Given User should Open browser as "chrome"
And User should launch URL
 @validlogin
  Scenario: User should able to login with valid credentials
    Given User enter Username "standard_user"
    And User enter Password "secret_sauce"
    When Click on Login button
    Then User should navigate to HomePage
    
   @invalidlogin
   Scenario Outline: user should not able to login with invalid credentials
    Given User enter Username"<username>"
    And User enter password"<pwd>" 
    When click on Login Button
    Then User should get error message
    Examples:
    |browser|username|pwd|
    |chrome|test|test123|
    |chrome|abctest|abc123|
