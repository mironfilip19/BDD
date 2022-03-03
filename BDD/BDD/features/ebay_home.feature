Feature: ebay home page scenario

  Scenario: Advance search link
    Given I am on ebay homepage
    When I click on advance link
    Then I navigate on the advance page

  Scenario: Search items count

    Given I am on ebay homepage
    When I search for 'Iphone 11'
    Then I have at least 1000 search items returned