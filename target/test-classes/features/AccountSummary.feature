Feature: Zero - Account summary
  Scenario Display the Account Summary Pages
    Given the user is logged in
    When the user navigates to following pages
    | Cash Accounts |
    | Investment Accounts |
    | Credit Accounts     |
    | Loan Accounts       |


    Scenario: Display the Credit Accounts Pages
      Given the user is logged in
      When navigates to Credit Accounts Pages
      Then system displays the following tabs
    | Account |
    | Credit Card |
    | Balance tabs |





