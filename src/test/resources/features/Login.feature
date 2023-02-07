@Login
  Feature: Login
    As a user i want to login to GuruMu website

  Scenario: Login user with valid email & password
    Given User already in GuruMu login page
    When User input "johndoe@gmail.com" as email and input "pass12345" as password
    Then User clicked masuk button

  Scenario: Login user with empty data
    Given User already in GuruMu login page
    When User input "" as email and input "" as password
    Then User cant clicked masuk button

  Scenario Outline: Login user with invalid data
    Given User already in GuruMu login page
    When User input "<email>" as email and input "<password>" as password
    Then User cant clicked masuk button
  Examples:
    | email                  | password    |
    | unregistered@gmail.com | unregister  |
    | wrongemail@gmail.com   | validpass   |
    | validemail@gmail.com   | invalidpass |