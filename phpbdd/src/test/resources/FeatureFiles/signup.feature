Feature: Php Register Feature
  This register feature is for login functionality in PHP website

 Scenario: Register with valid credentials
  
    Given Php Register page is launched
    When I input my First Name "Rocky"
    And I input my Last Name "Singh"
    And I input my Mobile Number "9172914952"
    And I input my Email Address "singh2815@yahoo.com"
    And I input my Password "Rocky2815"
    And I input my Confirm Password "Rocky2815"
    Then I click on signup
    