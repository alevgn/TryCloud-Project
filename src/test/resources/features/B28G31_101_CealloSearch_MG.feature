@MG
Feature: As a user, I should be able to search any item/ users from the homepage

  Background: User is already in the log in page
    Given the user is on the login page
    Given User is already logged into the Ceallo

  Scenario: Verify users can search any files/folder/users from the search box.
    Given user on the dashboard page
    When the user clicks the magnifier icon on the right top
    And users search any existing file-folder-user name
    Then verify the app displays the expected result option