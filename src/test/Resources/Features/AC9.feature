Feature: Video Recording

  @AC9
  Scenario: User should be able to click on "Record Video"
  tab to record a video and attach it with the message.
    Given User is on the main page
    When User clicks on the message feed area
    And User clicks on the recording button
    Then User should be able to record video
