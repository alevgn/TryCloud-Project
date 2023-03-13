@nurseda
Feature: Ceallo creating a Folder functionality
  Agile Story:As a user, I should be able to add/create a folder.

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "User1" and password as "Userpass123"


  Scenario: Ceallo creating a folder functionality verification
    Given user clicks on add icon tab
    And user clicks on new folder button
    And user writes "New Folder Testing" for new folder name
    When user clicks on submit button
    Then user should verify folder is displayed on homepage