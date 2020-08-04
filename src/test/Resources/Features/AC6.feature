Feature: Add mention functionality

  @AC6
  Scenario: User should be able to add mention by
  clicking on the Add mention icon and select
  contacts from the lists provided in dropdown.
    Given User is on the main page
    When User clicks on the message feed area
    And User clicks on the mention button
    Then User is able to select contact from dropdown list
    Then User is able to click on send button