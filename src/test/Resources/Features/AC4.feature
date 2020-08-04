Feature: User should be able to insert videos by clicking on
        the video icon and entering the video URL.

  @AC4
  Scenario: User should be able to insert videos by clicking on
  the video icon and entering the video URL.
    Given User is on the main page
    When User clicks on the message feed area
    And User clicks on the video Upload Button
    Then User should be able to insert video source link
    Then User should be able to save the video link
    Then User should be able to send the video link