@OilPalm_Requirement
Feature: Test Modules functionality
Background:
  Given User is on login page with oilpalm project page 
  When The Users enters with the valid username and password inputs data  
  Then the page will be Navigated to the Dashboards menu
  And verify with the click on the Settings module from the Dashboard
  
 @sm_1
 Scenario: Navigated to the Mill weighbridge screen
 Then verify with the click on the Mill weighbridge screen
 
 @data_c1
 Scenario: Verify with the click on the Add Mill weighbridge action button 
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  
 @data_c1
 Scenario: Verify with the Add mill weightbridge popup screen by Name details
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  And validate with the Name input field from the popup screen
 
 @data_c1
 Scenario: Verify with the Add mill weightbridge popup screen by User name selection
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  And validate with the Name input field from the popup screen 
  Then check with the User Dropdown field from the popup screen
  
 @data_c1
 Scenario: Verify with the Add mill weightbridge popup screen by location selection
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  And validate with the Name input field from the popup screen 
  Then check with the User Dropdown field from the popup screen  
  And check with the location dropdown input field

 @data_c1
 Scenario: Verify with the Add mill weightbridge popup screen by location selection
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  And validate with the Name input field from the popup screen 
  Then check with the User Dropdown field from the popup screen  
  And check with the location dropdown input field
  And check with the Click on the save action button
  
@data_c1
 Scenario: Verify with the Active grid by Edit action click
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  And validate with the Name input field from the popup screen 
  Then check with the User Dropdown field from the popup screen  
  And check with the location dropdown input field
  And check with the Click on the save action button
  Then check with the Click on the active grid Edit action button

 @data_c1
 Scenario: Verify with the edit popup screen by Is automatic check
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  And validate with the Name input field from the popup screen 
  Then check with the User Dropdown field from the popup screen  
  And check with the location dropdown input field
  And check with the Click on the save action button
  Then check with the Click on the active grid Edit action button
  And check with the Is Automatic check box selection input
  
  
 @data_c1
 Scenario: Verify with the edit popup screen by update button click
  Then verify with the click on the Mill weighbridge screen
  And check with the click on the Add Mill weighbridge action button
  And validate with the Name input field from the popup screen 
  Then check with the User Dropdown field from the popup screen  
  And check with the location dropdown input field
  And check with the Click on the save action button
  Then check with the Click on the active grid Edit action button
  And check with the Is Automatic check box selection input
  Then check with the click on the update action button