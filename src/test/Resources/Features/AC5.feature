Feature: User should be able to create a quote by clicking on the Comma icon
  @AC5
  Scenario: User should be able to create a quote by clicking on the Comma icon
    Given User is on the main page
    When User clicks on the message feed area
    And User clicks on the quote button
    Then User should be able to write on the quote area
    Then User should be able to send the quote