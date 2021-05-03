Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts
  Accounts are: librarian, student, admin

  @wip
  Scenario: Login as librarian
    Given User is on the login page
    When User enters librarian username
    And User enter librarian password
    Then User should see librarian in the dashboard



