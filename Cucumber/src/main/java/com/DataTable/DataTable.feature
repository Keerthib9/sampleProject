Feature: Customer Login

@single
  Scenario: Successful Login
  	Given Launch browser
    Then User enters url
    And He enters userName
    When He enters password
    Then Home page is displayed
