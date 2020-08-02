Feature: User should be able to add users from selecting
  contact from E-mail user,
  Employees and Departments and
  Recent contact lists

  @AC2
  Scenario: User should be able to add Users from recent, employees and email users
    Given User is on the main page
    When User clicks on the message feed area
    Then User clicks on the Address feed area
    And Adds contacts from recent contact list option
    And Adds contacts from employee list option
    And Adds contacts from email list option