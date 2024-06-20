@OilPalm_Requirement
Feature: feature to test Modules functionality
@Approvedplots1
Scenario: Navigated to the Dashboard Module screen
Given First signin with the Respective user role details
#Then Click on the submit button
Then the page is Navigate to the Dashboard menu of the oilpalm screen 

@Approvedplots2
Scenario: Navigated to the Area Extension Module screen
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 

@Approvedplots3
Scenario: Navigated to the Approved plots screen
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen

@Approvedplots4
Scenario: Filter with location type search
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen
And Select Location type from the Approvedplots screen grids
And select state from the Approvedplots screen grid details
And select District from Approvedplots screen grid details
And select mandals from the Approvedplots screen grid details
Then select villages from the Approvedplots screen grid details 
Then check with the Select From date selection details
And Click on the Search button from the Approvedplots screen grid view

@Approvedplots5
Scenario: Verify with the Actions performing
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen
And Select Location type from the Approvedplots screen grids
And select state from the Approvedplots screen grid details
And select District from Approvedplots screen grid details
And select mandals from the Approvedplots screen grid details
Then select villages from the Approvedplots screen grid details 
Then check with the Select From date selection details
And Click on the Search button from the Approvedplots screen grid view
Then check with Update Advance details button

@Approvedplots6
Scenario: Validate with the Add Sapling details imported details
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen
And Select Location type from the Approvedplots screen grids
And select state from the Approvedplots screen grid details
And select District from Approvedplots screen grid details
And select mandals from the Approvedplots screen grid details
Then select villages from the Approvedplots screen grid details 
Then check with the Select From date selection details
And Click on the Search button from the Approvedplots screen grid view
Then check with Update Advance details button
When Click on the Add sapling Nursery selection details button
Then Select Batch from the dropdown list
And Select Advance receipt numbers from the Dropdown option
And select Variety from the dropdown list
And select Vendor from the dropdown list
Then Enter No of Imported Saplings Dispatched input details
And Enter with the Imported comments
And click on the Save and Print button

@Approvedplots7
Scenario: Validate with the Add Sapling details Indigenous details
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen
And Select Location type from the Approvedplots screen grids
And select state from the Approvedplots screen grid details
And select District from Approvedplots screen grid details
And select mandals from the Approvedplots screen grid details
Then select villages from the Approvedplots screen grid details 
Then check with the Select From date selection details
And Click on the Search button from the Approvedplots screen grid view
Then check with Update Advance details button
When Click on the Add sapling indi Nursery selection details button
Then Select indi Batch from the dropdown list
And Select Advance receipt numbers from the Dropdown option
And select Variety from the dropdown list
And select Vendor from the dropdown list
Then Enter No of Indigenous Saplings Dispatched input details
And Enter with the Indigenous comments
And click on the Save and Print button

@Approvedplots8
Scenario: Validate with the Add Sapling details with From date Todate selection imp details
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen
Then check with the Select From date selection details
And Click on the Search button from the Approvedplots screen grid view
Then check with Update Advance details button
When Click on the Add sapling Nursery selection details button
Then Select Batch from the dropdown list
And Select Advance receipt numbers from the Dropdown option
And select Variety from the dropdown list
And select Vendor from the dropdown list
Then Enter No of Imported Saplings Dispatched input details
And Enter with the Imported comments
And click on the Save and Print button

@Approvedplots9
Scenario: Validate with the Add Sapling details with From date Todate selection Indi details
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen
Then check with the Select From date selection details
And Click on the Search button from the Approvedplots screen grid view
Then check with Update Advance details button
When Click on the Add sapling indi Nursery selection details button
Then Select indi Batch from the dropdown list
And Select Advance receipt numbers from the Dropdown option
And select Variety from the dropdown list
And select Vendor from the dropdown list
Then Enter No of Indigenous Saplings Dispatched input details
And Enter with the Indigenous comments
And click on the Save and Print button

@Approvedplots10
Scenario: Verify with the Saplings view Details action
Given First signin with the Respective user role details
Then the page is Navigate to the Dashboard menu of the oilpalm screen 
And Click on the Areaextensions module screen name 
Then click on the Approvedplots screen
Then check with the Select From date selection details
And Click on the Search button from the Approvedplots screen grid view
When Click on the View Sapling details action button
Then Check with the View sapling details cancel action button




