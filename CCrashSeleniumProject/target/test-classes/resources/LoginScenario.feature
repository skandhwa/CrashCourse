@smoke
Feature: Login to Application with correct User ID and password

  Scenario Outline: Login Check
    Given User Opens the application
    And User enters the username as "<username>"
    And User enters the password as "<password>"
    When User clicks on the Submit button
    Then User will be navigated to home page of the application
    
    

    Examples: 
      | username   | password |
      | mngr563548 | nEzuzEj  |
    
    
   