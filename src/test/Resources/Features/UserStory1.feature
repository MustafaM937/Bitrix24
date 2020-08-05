Feature: Active Stream Messaging feature including, upload, download, add link
  add video, add recording, quoting and etc

  Background:User is on the Bitrix Home Page and clicks on message feed area
    Given User is on the main page
    When User clicks on the message feed area

  @AC2
  Scenario: User should be able to add Users from recent, employees and email users
    Then User clicks on the Address feed area
    And Adds contacts from recent contact list option
    And Adds contacts from employee list option
    And Adds contacts from email list option

  @AC3
  Scenario: User should be able to attach link
    And User clicks on the attach icon
    Then User should be able attach a link to the message
    Then User should be able to send the linked message

  @AC4
  Scenario: User should be able to insert videos by clicking on
  the video icon and entering the video URL.
     And User clicks on the video Upload Button
    Then User should be able to insert video source link
    Then User should be able to save the video link
    Then User should be able to send the video link

  @AC5
  Scenario: User should be able to create a quote by clicking on the Comma icon
    And User clicks on the quote button
    Then User should be able to write on the quote area
    Then User should be able to send the quote

  @AC6
  Scenario: User should be able to add mention by
  clicking on the Add mention icon and select
  contacts from the lists provided in dropdown.
    And User clicks on the mention button
    Then User is able to select contact from dropdown list
    Then User is able to click on send button

  @AC7
  Scenario: User should be able to click on
  Visual Editor and see the editor text-bar
  displays on top of the message box
    Then User clicks on the visual Editor button
    Then User should be able to see the visual editor bar

  @AC8
  Scenario: User should be able to click on the Topic
  icon to see the Message Topic text box displays
  on top of the message box.
    Then User should be able to click on the Topic Icon
    Then User should be able to see the Topic header

  @AC9
  Scenario: User should be able to click on "Record Video"
  tab to record a video and attach it with the message.
    And User clicks on the recording button
    Then User should be able to record video


  @MSOfficeDocument
  Scenario: User should be able to select documents from bitrix24
    When clicks on the file upload button
    Then User should be able to click on link Create File button from MSOffice
    Then User should be able to click on the Document creation link

  @MSOfficeSpreadsheet
  Scenario: User should be able to select documents from bitrix24
    When clicks on the file upload button
    Then User should be able to click on the Spreadsheet creation link

  @PowerPoint
  Scenario: User should be able to select documents from bitrix24
    When clicks on the file upload button
    Then User should be able to click on the PowerPoint creation link

  @upload
  Scenario: User should be able to click on upload file
    When clicks on the file upload button
    Then User should be able to upload file

  @download
  Scenario: User should be able to download from external drive
    When clicks on the file upload button
    Then User should be able to click on Download from external drive

  @Bitrix24
  Scenario: User should be able to select documents from bitrix24
    When clicks on the file upload button
    Then User should be able to click on link Select from bitrix24