Feature: login
  A user should be able to login using Driver credentials

  Background:login as a user
    Given User is on landing page

  @driver
  Scenario: login as a Driver
    When user enters Driver's credentials
    Then User verifies that "Quick Launchpad" page name is displayed

  @storemanager
  Scenario: login as Store manager
    When  user enters Store manager's credentials
    Then user verifies that "Dashboard" page name is displayed

    Scenario: login as Sales manager
      When user enters Sales manager's credentials
      Then user verifies that "Dashboard" page name is displayed

