Feature: This feature is for Contact the vendor
  I want to use this template for my feature file

  
  Scenario: User won't be able to process their message
    Given I navigate to php contact page
    When I enter my name "Rocky Singh"
    And I enter my Email "rsjaswal@aol.com"
    And I enter my subject "HarryPotter is one the best movies/books ever:)"
    And I enter my message "Hello!!!!Everyone"
    Then I click submit button
    