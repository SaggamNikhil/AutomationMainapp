@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page screen of oilpalm project
  When The User enter with the valid username and password input details 
  Then the page will be Navigated to the Dashboards home menu page details
  And check with the click on the Settings module
  
  @data_1
  Scenario: Navigated to the Role screens From the Dashboard menu
  Then check with click on the Role screen module name
  
  @data_1
  Scenario: Verify with the Add New role actions from the Role screen
    Then check with click on the Role screen module name
    And check with Click on the Add Role action button
    
  @data_1
  Scenario: Verify with the Add new role form details
    Then check with click on the Role screen module name
    And check with Click on the Add Role action button
    And check with the click on the Name input field
    
  @data_1
  Scenario: Verify with the Select Reported role from the Add New role pop-up screen
    Then check with click on the Role screen module name
    And check with Click on the Add Role action button
    And check with the click on the Name input field
    And check with the Select Reported role from the Add new role popup screen
  
    
  @data_1
  Scenario: Verify with the Code input details from the Add New role pop-up screen
    Then check with click on the Role screen module name
    And check with Click on the Add Role action button
    And check with the click on the Name input field
    And check with the Select Reported role from the Add new role popup screen  
    And check with the code input details
    
  @data_1
  Scenario: Check with the Description input details from the Add new role popup screen
    Then check with click on the Role screen module name
    And check with Click on the Add Role action button
    And check with the click on the Name input field
    And check with the Select Reported role from the Add new role popup screen  
    And check with the code input details
    Then check with the Description input details
    
  @data_1
  Scenario: check with the Select Activity righs from the Add new role popup screen
  Then check with click on the Role screen module name
  And check with Click on the Add Role action button
  And check with the click on the Name input field
  And check with the Select Reported role from the Add new role popup screen  
  And check with the code input details
  Then check with the Description input details
  And check with the Select activity right from the dropdown field  
    
  @data_1
  Scenario: check with the Save details from the Add new role popup screen
  Then check with click on the Role screen module name
  And check with Click on the Add Role action button
  And check with the click on the Name input field
  And check with the Select Reported role from the Add new role popup screen  
  And check with the code input details
  Then check with the Description input details
  And check with the Select activity right from the dropdown field
  And check with the Clicking on the save action button
  
  @data_1
  Scenario: check with the View role hierarchy details from the Add new role popup screen
  Then check with click on the Role screen module name
  And check with Click on the Add Role action button
  And check with the click on the Name input field
  And check with the Select Reported role from the Add new role popup screen  
  And check with the code input details
  Then check with the Description input details
  And check with the Select activity right from the dropdown field
  And check with the Clicking on the save action button
  Then check with the View role Hierarchy details
  
  @data_1
  Scenario: check with the Filters from the Add new role popup screen
  Then check with click on the Role screen module name
  And check with Click on the Add Role action button
  And check with the click on the Name input field
  And check with the Select Reported role from the Add new role popup screen  
  And check with the code input details
  Then check with the Description input details
  And check with the Select activity right from the dropdown field
  And check with the Clicking on the save action button
  Then check with the View role Hierarchy details
  And check with the Enable filter button
  
  @data_1
  Scenario: check with the Edit action update details
  Then check with click on the Role screen module name
  And check with Click on the Add Role action button
  And check with the click on the Name input field
  And check with the Select Reported role from the Add new role popup screen  
  And check with the code input details
  Then check with the Description input details
  And check with the Select activity right from the dropdown field
  And check with the Clicking on the save action button
  Then check with the View role Hierarchy details
  And check with the Enable filter button
  Then check with the Edit action details