 @alev
Feature: As a user, I should be able to upload a file.
  Background: User is already in the log in page
    Given the user is on the login page
    Given User is already logged into the Ceallo

  Scenario: verify users to upload a file from Files
    Given user on the dashboard page
    When the user clicks the "Files" module
    When the user clicks the add icon on the top
    And  the user uploads a file from files with the upload file option
    Then verify the file name is displayed on the page