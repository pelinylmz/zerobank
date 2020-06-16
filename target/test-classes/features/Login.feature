
Feature: Login feature

  @Login
  Scenario: Login with credentials
    Given the user is on URL
    When user logs in with valid credentials
    Then the Account summary page should displayed

  Scenario:Login with invalid credentials
    Given the user is on URL
    When user logs in with invalid credentials
    Then the user gets an error message

  Scenario: Login with blank tab
    Given the user is on URL
    When the user logs in with blank tabs
    Then the user get error message