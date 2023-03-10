@failedLogin
Feature: As a user, I should not be able to login with invalid credentials.

  Scenario Outline: Verify user login fail with invalid credentials
    Given user is on the login page projectURL
    When user enters invalid "<username>" and "<password>"
    And user clicks the login button
    Then verify "<message>" message should be displayed

    Examples:
      | username | password | message                     |
      | MaryK4   | 33       | Wrong username or password. |
      | 4        | L        | Wrong username or password. |
      | .        | 123!     | Wrong username or password. |
