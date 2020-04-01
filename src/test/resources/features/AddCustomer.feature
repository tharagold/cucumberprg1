Feature: Add Customer in demo site
 
  Scenario: Add Customer with hard coded datas
    Given User launches demo telecom site
    And User click on add customer button
    When User enters all the fields
    And User click on submit button 
    Then User should be displayed cutomer ID is generated or no
  



 