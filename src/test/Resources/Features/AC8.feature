Feature: Message Topic visibility

  @AC8
  Scenario: User should be able to click on the Topic
  icon to see the Message Topic text box displays
  on top of the message box.
    Given User is on the main page
    When User clicks on the message feed area
    Then User should be able to click on the Topic Icon
    Then User should be able to see the Topic header