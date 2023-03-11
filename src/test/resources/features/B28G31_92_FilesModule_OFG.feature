@B28G31-92
Feature: As a user, I should be able to access to Files module.
  Background: User is already in the log in page
    Given the user is on the login page
    Given User is already logged into the Ceallo

  Scenario: verify users can access to Files module
    Given user on the dashboard page
    When the user clicks the Files module
    Then verify the page title is "Files - Ceallo - QA"

  Scenario: verify users can select all the uploaded files from the page
    Given user on the dashboard page
    When the user clicks the Files module
    And user click the top-left checkbox of the table
    Then verify all the files are selected