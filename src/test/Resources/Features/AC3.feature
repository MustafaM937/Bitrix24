Feature: User should be able to attach link by clicking on the link icon

  @AC3
  Scenario: User should be able to attach link
    Given User is on the main page
    When User clicks on the message feed area
    And User clicks on the attach icon
    Then User should be able attach a link to the message
    Then User should be able to send the linked message