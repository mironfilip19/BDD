Feature: OrangeHRM home page scenario
@TEST1
  Scenario: Test functionn " Add DisciplinaryCases"
    Given I am on OrangeHRM homepage
    When I click on username and complete "Admin"
    And I click on password and complete "AW4@nJgO0r"
    When Go to Discipline
    And Go to DisciplinaryCases
    Then Go to Add DisciplinaryCases
    And Add Disciplinary Case Save And Exit