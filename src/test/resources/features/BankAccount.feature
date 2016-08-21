Feature: Bank Account

  Scenario: calculate interest
    Given balance is 1000.00
    And annual interest rate is 0.05
    When calculate interest
    Then balance becomes 1050.00