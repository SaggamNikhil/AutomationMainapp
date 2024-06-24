@OilPalm_Requirement
Feature: feature to test Modules functionality
@PartialUprootment_Data
Scenario: Navigated to the Dashboard Main menu
Given the user signin with the Respective role credential details
#Then Click on the submit button
Then the page will Navigate to the Dashboard screen of the main pages

@PartialUprootment_Data
Scenario: Navigated to the Activities module screen
Given the user signin with the Respective role credential details
Then the page will Navigate to the Dashboard screen of the main pages
Then click on the dashboard menu as Activities module name

@PartialUprootment_Data
Scenario: Navigated to the Partial Uprootment screen
Given the user signin with the Respective role credential details
Then the page will Navigate to the Dashboard screen of the main pages
Then click on the dashboard menu as Activities module name
And click on the Partial Uprootment screen

@PartialUprootment_Data
Scenario: verify with the Search farmer using keywords
Given the user signin with the Respective role credential details
Then the page will Navigate to the Dashboard screen of the main pages
Then click on the dashboard menu as Activities module name
And click on the Partial Uprootment screen
Then click on the search farmer input field
And Select farmer from the auto suggestion keywords list
And check with the selected farmer plot details 

@PartialUprootment_Data
Scenario: verify with the plot details by Total Plot area input details
Given the user signin with the Respective role credential details
Then the page will Navigate to the Dashboard screen of the main pages
Then click on the dashboard menu as Activities module name
And click on the Partial Uprootment screen
Then click on the search farmer input field
And Select farmer from the auto suggestion keywords list
And check with the selected farmer plot details 
Then check with the Total plot area input details

@PartialUprootment_Data
Scenario: Verify with the Plot details by Palm area input details
Given the user signin with the Respective role credential details
Then the page will Navigate to the Dashboard screen of the main pages
Then click on the dashboard menu as Activities module name
And click on the Partial Uprootment screen
Then click on the search farmer input field
And Select farmer from the auto suggestion keywords list
And check with the selected farmer plot details 
Then check with the Total plot area input details
And check with the Total Palm area input details

@PartialUprootment_Data1
Scenario: Verify with the Plot details by Crop in Left out area details
Given the user signin with the Respective role credential details
Then the page will Navigate to the Dashboard screen of the main pages
Then click on the dashboard menu as Activities module name
And click on the Partial Uprootment screen
Then click on the search farmer input field
And Select farmer from the auto suggestion keywords list
And check with the selected farmer plot details 
Then check with the Total plot area input details
And check with the Total Palm area input details
Then check with the Crop in Left out area dropdown selection