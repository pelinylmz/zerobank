Feature:Zero-Account activity
  Scenario: Display the Savings drop down
    Given the user is logged in
    When the user navigates to Account Activities
    Then system should displays following drop downs
    | Savings |
    | Checking |
    | Loan |
    | Credit Card |
    | Brokerage |
    And table should have following names
    | Date |
    | Description |
    | Deposit |
    | Withdrawal |
