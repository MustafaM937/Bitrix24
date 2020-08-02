Feature: User should be able to click on create files icon to files and then to upload.
  #desktop application failed manual testing

  @MSOfficeDocument
  Scenario: User should be able to select documents from bitrix24
    Given User is on the main page
    When clicks on the file upload button
    Then User should be able to click on link Create File button from MSOffice
    Then User should be able to click on the Document creation link

  @MSOfficeSpreadsheet
  Scenario: User should be able to select documents from bitrix24
    Given User is on the main page
    When clicks on the file upload button
    Then User should be able to click on the Spreadsheet creation link

  @PowerPoint
  Scenario: User should be able to select documents from bitrix24
    Given User is on the main page
    When clicks on the file upload button
    Then User should be able to click on the PowerPoint creation link