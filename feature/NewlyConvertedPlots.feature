@OilPalm_Requirement
Feature: feature to test Modules functionality
@NewlyConvertedplots1
Scenario: Navigated to the Dashboard Module menu screen
Given First signin with the Respective user roles details
#Then Click on the submit button
Then the page will Navigate to the Dashboard menu of the oilpalm screen 

@NewlyConvertedplots2
Scenario: Navigated to the Area Extension Module screen
Given First signin with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screen 
And Clicking on the Areaextensions module screen name 

@NewlyConvertedplots3
Scenario: Navigated to the NewlyConvertedplots screen
Given First signin with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screen 
And Clicking on the Areaextensions module screen name 
Then click on the NewlyConvertedPlots screen

@NewlyConvertedplots4
Scenario: Verify with the location filter wise details 
Given First signin with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screen 
And Clicking on the Areaextensions module screen name 
Then click on the NewlyConvertedPlots screen
And select with Location type wise details search
Then select State from the Newlyconverted active grid screen
Then Select District from the Newlyconverted active grid details
And select mandals from the newlyconverted active grid details
And select Villages from the newlyconverted active grid details
Then select fromdate from the newlyconverted active grid details
Then click on the Search button from the Newly converted active grid details 

@NewlyConvertedplots5
Scenario: Verify that the Plot Subsidy checkbox behaves correctly 
Given First signin with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screen 
And Clicking on the Areaextensions module screen name 
Then click on the NewlyConvertedPlots screen
And select with Location type wise details search
Then select State from the Newlyconverted active grid screen
Then Select District from the Newlyconverted active grid details
And select mandals from the newlyconverted active grid details
And select Villages from the newlyconverted active grid details
Then select fromdate from the newlyconverted active grid details
Then click on the Search button from the Newly converted active grid details 
Then click on the All details check box selections
And Check with Click on the Verify button 

@NewlyConvertedplots6
Scenario: verify with the From date and To date selection Data details
Given First signin with the Respective user roles details
Then the page will Navigate to the Dashboard menu of the oilpalm screen 
And Clicking on the Areaextensions module screen name 
Then click on the NewlyConvertedPlots screen
Then select fromdate from the newlyconverted active grid details
Then click on the Search button from the Newly converted active grid details 
Then click on the All details check box selections
And click on the All details submmitted are correct or not
And click on the Geoboundaries verification checkbox selection
And Check with Click on the Verify button 