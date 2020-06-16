Feature: Zero - Pay Bills

  Scenario: Positively Pay operation
    Given the user is logged in
    When user completes successfull pay operation
    Then user gets a message

    Scenario: Negatively Pay operation
      Given the user is logged in
      When user tries to enter without amount
      And user tries to enter without date
      Then user gets an error message


      Scenario: Operating amount tab
        Given the user is logged in
        When user puts letters on amount tab
        And user puts special characters on amount tab
        Then system should not accept

        Scenario: Operating date tab
          Given the user is logged in
          When user puts alphabetical characters on date tab
          Then system rejects the user behaviour






