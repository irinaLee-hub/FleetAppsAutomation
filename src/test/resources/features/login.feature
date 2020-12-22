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

      @map
  Scenario: login with different credentials
    Given user logs in with the following credentials
      | username | salesmanager101 |
      | password | UserUser123     |

    Then user navigates to Fleet and Vehicles
    And user verifies that All Cars text is displayed