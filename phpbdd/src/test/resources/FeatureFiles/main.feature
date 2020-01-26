Feature: Php Login Feature
  This login feature is for login functionality in PHP website

 Scenario: Login with wrong email and password
  
    Given Php login page is launched
    When Userinput wrong "rockysingh@gmail.com" and wrong "rocky123"
    And I click on login
    Then I should receive an error message

  Scenario Outline: Login with right email and password
    Given Php login page is launched
    When Userinput right "<email>" and  "<password>"
    And I click on login
    

    Examples: 
      | email                        | password     |
      | singh2815@yahoo.com          | Rocky2815    |
      #
