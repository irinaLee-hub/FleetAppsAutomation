Feature: login
A user should be able to login using Driver credentials
   Background:login as a user
     Given User is on landing page

  Scenario: login as a Driver
    When user enters Driver's credentials
    Then User verifies that "Quick Launchpad" page name is displayed
