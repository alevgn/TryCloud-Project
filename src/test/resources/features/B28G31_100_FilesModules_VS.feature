@VS
Feature:As a user, I should be able to update settings
  Background: User is already in the log in page
    Given the user is on the login page
    Given User is already logged into the Ceallo
  Scenario:Verify the users can check any checkbox on the Files page.
    Given user on the dashboard page
    When the user clicks the Files module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any checkbox
