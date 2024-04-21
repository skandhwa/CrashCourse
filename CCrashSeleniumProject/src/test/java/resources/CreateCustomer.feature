@smoke
Feature: Creation of a New Customer

  Background: 
    Given User Opens the application
    And User enters the username as "mngr563548"
    And User enters the password as "nEzuzEj"
    When User clicks on the Submit button
    Then User will be navigated to home page of the application

  Scenario Outline: Creating a new Customer with all the credentails
    Given User will click on the new Customer Link
    And User will enter the Customer name as "<CustomerName>"
    And User will select gender
    And User will enter date of birth as "<dateOfBirth>"
    And User will then enter the address as "<Address>"
    And User will then enter the City as "<City>"
    And User will then enter the State as "<State>"
    And User will then enter the PinCode as "<Pincode>"
    And User will then enter the MobileNumber as "<Mobilenumber>"
    And User will then enter the Email as "<EmailId>"
    And User will then enter the Password as "<Password>"
    When User will Click on Submit button
    Then User will Fetch the Customer Id

    Examples: 
      | CustomerName | dateOfBirth | Address | City    | State | Pincode | Mobilenumber | EmailId         | Password  |
      | Harsh        | 04-08-1999  | PrAppt  | Kolkata | WB    |  700055 |   7003245321 | wrjhtbu@gmail.com | Test@1234 |
