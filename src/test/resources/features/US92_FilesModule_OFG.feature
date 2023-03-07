@OFG
Feature: As a user, I should be able to access to Files module.
  Background: User is already in the log in page
    Given User is already logged into the Ceallo - OFG

  Scenario: verify users can access to Files module
    Given user on the dashboard page - OFG
    When the user clicks the Files module - OFG
    Then verify the page title is "Files - Ceallo - QA" - OFG

  Scenario: verify users can select all the uploaded files from the page
    Given user on the dashboard page - OFG
    When the user clicks the Files module - OFG
    And user click the top-left checkbox of the table - OFG
    Then verify all the files are selected - OFG