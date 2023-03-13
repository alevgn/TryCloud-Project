@Bobby
Feature: Users should access files page and upload any files in existing folders

  Background: Users should login page and login app successfully the app
    Given the user is on the login page
    Given Users on login page and login the app already

  Scenario: Uploading files in folders on files page verification

    When User clicks an existing folder
    Then User clicks + button
    Then User select a file and upload it
    Then Verify file uploaded and displayed on the page
