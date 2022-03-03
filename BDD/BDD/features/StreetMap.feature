Feature:  Cautare pe streetMap
  @TEST2

  Scenario: Cautare pe open streetMap si apasare pe butonul de go
    Given I am on openStreetMap
    When I enter on adress
    And I press on the go button
    Then I whill see the result available