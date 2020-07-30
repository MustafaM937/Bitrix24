Feature: As a user i should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.


  @UploadFiles
  Scenario: Given user is on the main home page
    When user clicks on message drop down tab
    When user clicks on upload files icon
    When user should be able to see upload files dropdown options
    Then user should be able to upload files and images
    And user should be able to select document from Bitrix24
    And user should be able to download from external drive
    And user should be able to create using MS office online