Feature: Sample Feature
  Scenario: Sample Scenario
    Given I go to 'https://animalgenetics.com'
    And I click order now
    Then I should be redirected to 'https://my.animalgenetics.com/login'
