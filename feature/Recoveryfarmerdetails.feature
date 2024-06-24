@OilPalm_Requirement
Feature: feature to test Modules functionality
@Recoveryfarmer_smoke
Scenario: Navigated to the Dashboard Module Main menu
Given the user signin with the Respective role details
#Then Click on the submit button
Then the page will Navigate to the Dashboard screen of the main page

@Recoveryfarmer_smoke2
Scenario: Navigated to the Activities Screen
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 

@Recoveryfarmer_smoke3
Scenario: Navigated to the Recover farmer details screen
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen

@Recoveryfarmer_data_valid
Scenario: Check with active grid by from date selection
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen

@Recoveryfarmer_data_valid5
Scenario: check with the click on the Search button input validations 
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with the click on the search button

@Recoveryfarmer_data_valid6
Scenario: Verify with the Add Recovery Farmers action button
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with the click on the search button
When click on the Add recovery farmer action button

@Recoveryfarmer_data_valid7
Scenario: Verify Add recovery farmer with Search selection
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with the click on the search button
When click on the Add recovery farmer action button
And check with the click on the Search button

@Recoveryfarmer_data_valid8
Scenario: Verify Add recovery farmer details with Select farmer
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with the click on the search button
When click on the Add recovery farmer action button
And check with the click on the Search button
Then select farmer from the auto suggestion key list

@Recoveryfarmer_data_valid9
Scenario: Verify with Add recover farmers list from the grid
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with the click on the search button
When click on the Add recovery farmer action button
And check with the click on the Search button
Then select farmer from the auto suggestion key list
And check with the add recoveryfarmers by using Add action button
And click on the Save button for farmer one

@Recoveryfarmer_data_valid10
Scenario: Check with Duplicate Main Farmer save condition
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with the click on the search button
When click on the Add recovery farmer action button
And check with the click on the Search button
Then select farmer from the auto suggestion key list
Then select duplicate Main farmer from the auto suggestion key list

@Recoveryfarmer_data_valid11
Scenario: Check with Edit Recovery farmer details
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with active grid Edit button click
And check with the Add button with update details
Then check with the Search recovery farmer
And click on the update button 


@Recoveryfarmer_data_valid12
Scenario: Check with the Add Duplicate recovery farmer in list
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
And check with the From date selection from the Recovery farmer details screen
Then check with active grid Edit button click
And check with the Add button with update details
Then check with same recover farmer into another index
And click on the update button

@Recoveryfarmer_data_valid13
Scenario: Check with the Add Recovery farmer to Recovery farmer navigation
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
When click on the Add recovery farmer action button
And check with the click on the Search button
Then select farmer from the auto suggestion key list
And click on the Cancel button the page will be navigated to the Recovery farmer list screen


@Recoveryfarmer_data_Valid14
Scenario: Check with the Recovery farmers list delete
Given the user signin with the Respective role details
Then the page will Navigate to the Dashboard screen of the main page
Then click on the menu as a Activities module 
And click on the Recovery farmer details screen
Then check with grid delete action button