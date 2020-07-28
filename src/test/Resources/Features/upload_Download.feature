@AC1
Feature: User should be able to click on upload files icon to upload files
  and pictures from local disks,
  download from external drive,
  select documents from bixtrix24,
  and create files to upload.

  @upload
  Scenario: User should be able to click on upload file
    Given User is on the main page
    When clicks on the file upload button
    Then User should be able to upload file

  @download
  Scenario: User should be able to download from external drive
    Given User is on the main page
    When clicks on the file upload button
    Then User should be able to click on Download from external drive

    @Bitrix24
  Scenario: User should be able to select documents from bitrix24
    Given User is on the main page
    When clicks on the file upload button
    Then User should be able to click on link Select from bitrix24
