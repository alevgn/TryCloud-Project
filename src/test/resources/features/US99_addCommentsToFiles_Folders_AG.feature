 @US99
Feature: As a user, I should be able to write comments to files/folders.

  Background: User is already in the log in page
    Given the user is on the login page
    Given User is already logged into the Ceallo


  Scenario: Verify users to write comments to files/folder
    Given user on the home page
    When the user clicks the Files module
    And user click action-icon from any file on the page
    And user choose the Details option
    And user write a comment as "Second Comment" inside the input box
    And user click the submit button to post it
    Then Verify the "Second Comment" is displayed in the comment section.