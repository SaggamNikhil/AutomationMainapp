@OilPalm_Requirement
Feature: feature to test Modules functionality
@Alloilpalmplots_smoke1
Scenario: Navigated to the Dashboard Module menu screen
Given signIn with the Respective user roles details
#Then Click on the submit button
Then the page will Navigate to the Dashboard menu of the oilpalm screens 

@Alloilpalmplots_smoke2
Scenario: Navigated to the Area Exetension Module Menu screen
Given signIn with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screens 
Then click on the menu as a Area Extension module

@Alloilpalmplots_smoke3
Scenario: Navigated to the Alloilpalm Plots screen
Given signIn with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screens 
Then click on the menu as a Area Extension module
And Click on the Alloilpalm plots screen

@Alloilpalmplots_smoke_regression4
Scenario: Filter Data details with a location wise details 
Given signIn with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screens 
Then click on the menu as a Area Extension module
And Click on the Alloilpalm plots screen
Then check with location type selection from the grid
Then select State from the Alloilpalmplots active grid screen
And select Distrtict from the Alloilpalmplots active grid screen
And select Mandal from the Alloilpalmplots active grid screen
And select villages from the Alloilpalmplots active grid screen
And select Ploststatus from the Alloilplamplots active grid screen
Then check with the From date selection from the Alloilplamplots active grid screen
And check with search button click 
Then check with actions by Ho approvals

@Alloilpalmplots_regression5
Scenario: Filter data with From date and Todate wise details
Given signIn with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screens 
Then click on the menu as a Area Extension module
And Click on the Alloilpalm plots screen
Then check with the From date selection from the Alloilplamplots active grid screen
And check with search button click 
Then check with actions by Ho approvals