Feature: Bank Account

  Scenario Outline: calculate interest
    Given balance is <initialBalance>
    And annual interest rate is <interestRate>
    When calculate interest
    Then balance becomes <endBalance>

    Examples: 
      | initialBalance | interestRate | endBalance |
      |        1000.00 |         0.05 |    1050.00 |
      |        1000.00 |         0.10 |    1100.00 |
      |        1000.00 |        0.012 |    1012.00 |
