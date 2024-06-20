@OilPalm_Requirement
Feature: feature to test Modules functionality
@View_address_complaints1
Scenario: Navigated to the Dashboard Module Main menu screen
Given user signin with the Respective users roles details
#Then Click on the submit button
Then the page will Navigate to the Dashboard screen of the main menu screen 

@View_address_complaints2
Scenario: Navigated to the Crop Maintenance screen
Given user signin with the Respective users roles details
Then the page will Navigate to the Dashboard screen of the main menu screen
Then Side navgation click on the Crop Maintenances screen

@View_address_complaints3
Scenario: navigated to the view address complaints screen
Given user signin with the Respective users roles details
Then the page will Navigate to the Dashboard screen of the main menu screen 
Then Side navgation click on the Crop Maintenances screen
And Click on the View Address Complaints screen name

@view_add_complaints4
Scenario: Verify with Status Type Selection
Given user signin with the Respective users roles details
Then the page will Navigate to the Dashboard screen of the main menu screen 
Then Side navgation click on the Crop Maintenances screen
And Click on the View Address Complaints screen name
Then check with the Status wise details 
And check with the From date selection
When click on the Search action button

@View_add_complaints5
Scenario: verify with Complaint type selection
Given user signin with the Respective users roles details
Then the page will Navigate to the Dashboard screen of the main menu screen 
Then Side navgation click on the Crop Maintenances screen
And Click on the View Address Complaints screen name
Then check with the Status wise details 
And check with the Complaint type details wise
And check with the From date selection
When click on the Search action button

@View_add_complaints6
Scenario: Check with data between from From date and Todate
Given user signin with the Respective users roles details
Then the page will Navigate to the Dashboard screen of the main menu screen 
Then Side navgation click on the Crop Maintenances screen
And Click on the View Address Complaints screen name
And check with the From date selection
When click on the Search action button

@View_add_complaints7
Scenario: Check with action buttons view Image and view recording
Given user signin with the Respective users roles details
Then the page will Navigate to the Dashboard screen of the main menu screen 
Then Side navgation click on the Crop Maintenances screen
And Click on the View Address Complaints screen name
And check with the From date selection
When click on the Search action button
Then check with the View Image action button 
And check with the View recording action button