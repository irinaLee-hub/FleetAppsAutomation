@PO11-56
Feature: As an authorized user store manager/sales manager should be able to access Vehicle Contracts

  Background: User is on landing page
    Given User is on landing page
    And User enters valid credentials
    And User navigates to Fleet Vehicle Contracts

  @AC1
  Scenario: Verify that authorized user should be able to access Vehicle Contract and able to see
  all vehicle contracts on the grid
    Then User verifies "All Vehicle Contract" text is displayed

  @AC2
  Scenario: Authorized user should be able to create Vehicle Contract
    When User clicks on Create Vehicle Contract button
    And User fills out contract information:
      | Responsible                         | mr.Test         |
      | Activation Cost                     | 5.00            |
      | Recurring Cost Amount (Depreciated) | 2.3             |
      | Odometer Details                    | 2500            |
      | Inovice Date                        | Dec 28, 2020    |
      | Contract Start Date                 | Dec 28, 2020    |
      | Contract Expiration Date            | Dec 28, 2021    |
      | Vendor                              | Teetos LLC      |
      | Driver                              | Benjamin McLean |
      | Contract Reference                  | 00AC567         |

    And User chooses contract type as "Leasing"
    And User clicks on save and close button
    Then User verifies that "Entity saved" message is displayed






