@OilPalm_Requirement
Feature: feature to test Modules functionality
@TotalUprootment_1
Scenario: Navigated to the Dashboard Module menu screen
Given user signin with the Respective user roles details
#Then Click on the submit button
Then the page will Navigate to the Dashboard screen of the oilpalm screen 

@TotalUprootment_smoke_2
Scenario: Navigated to the Crop Maintenance screen
Given user signin with the Respective user roles details
Then the page will Navigate to the Dashboard screen of the oilpalm screen 
Then Side navgation click on the Crop Maintenance screen

@TotalUprootment_smoke_3
Scenario: Navigated to the Total Uprootment screen
Given user signin with the Respective user roles details
Then the page will Navigate to the Dashboard screen of the oilpalm screen 
Then Side navgation click on the Crop Maintenance screen
And Click on the menu as a Total Uprootment screen

@TotalUprootment_smoke_regression_4
Scenario: Validate with Data by location wise details 
Given user signin with the Respective user roles details
Then the page will Navigate to the Dashboard screen of the oilpalm screen 
Then Side navgation click on the Crop Maintenance screen
And Click on the menu as a Total Uprootment screen
Then check with the select location type
Then select States from the Dropdown list data
And select Districts from the Dropdown list data
And select Mandals from the Dropdown list data
And select villages from the Dropdown list data
Then click on the Search button from the Total uprootment active grid

@TotalUprootment_smoke5
Scenario: User performs a specific actions
Given user signin with the Respective user roles details
Then the page will Navigate to the Dashboard screen of the oilpalm screen 
Then Side navgation click on the Crop Maintenance screen
And Click on the menu as a Total Uprootment screen
Then check with the select location type
Then select States from the Dropdown list data
And select Districts from the Dropdown list data
And select Mandals from the Dropdown list data
And select villages from the Dropdown list data
Then click on the Search button from the Total uprootment active grid
Then Verify with Click on the Cluster manager Approvals
And verify with Uprootment save button

@Totaluprrotment_Reg_06
Scenario: Check with the State Head approvals actions
Given user signin with the Respective user roles details
Then the page will Navigate to the Dashboard screen of the oilpalm screen 
Then Side navgation click on the Crop Maintenance screen
And Click on the menu as a Total Uprootment screen
Then check with the select location type
Then select States from the Dropdown list data
And select Districts from the Dropdown list data
And select Mandals from the Dropdown list data
And select villages from the Dropdown list data
Then click on the Search button from the Total uprootment active grid
Then Verify with Click on the Cluster manager Approvals
And verify with Uprootment save button
Then Verify with Click on the State Head approvals


@Totaluprootment_reg_09
Scenario: Check with the Agri head approvals actions
Given user signin with the Respective user roles details
Then the page will Navigate to the Dashboard screen of the oilpalm screen 
Then Side navgation click on the Crop Maintenance screen
And Click on the menu as a Total Uprootment screen
Then check with the select location type
Then select States from the Dropdown list data
And select Districts from the Dropdown list data
And select Mandals from the Dropdown list data
And select villages from the Dropdown list data
Then click on the Search button from the Total uprootment active grid
Then Verify with Click on the Cluster manager Approvals
And verify with Uprootment save button
Then Verify with Click on the State Head approvals
And Verify with click on the Agrihead approval action

@Totaluprootment_reg_10
Scenario: Check with Total uprootment Active grid 
Given user signin with the Respective user roles details
Then the page will Navigate to the Dashboard screen of the oilpalm screen 
Then Side navgation click on the Crop Maintenance screen
And Click on the menu as a Total Uprootment screen
Then Verify with Click on the Cluster manager Approvals
And verify with Uprootment save button
Then Verify with Click on the State Head approvals
And Verify with click on the Agrihead approval action