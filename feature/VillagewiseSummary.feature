@OilPalm_Requirement
Feature: feature to test Modules functionality



@Regression2
 Scenario: Validate login is successful with valid credentials
  Given User First in login page
  Then Navigate to the Dashboard page details
  And the user click on the snapshot module
  And Click on the Village wise summary screen
  Then Select Location type from the grid
  And Select States from the dropdown field
  And Select District from the dropdown option
  And Select Mandal from the dropdown field
  And Select Village from the dropdown field
  Then Click on the grid Search button
  And Click on the Export action button
  Then Click on the Enable Filter Result
  
@Villagewise_summary_validations
Scenario: feature to test update and validations in Villagewise summary screen
  Given User First in login page
  Then Navigate to the Dashboard page details
  And the user click on the snapshot module
  And Click on the Village wise summary screen
  Then Select Location type from the grid
  And Select States from the Dropdown field validations
  And Select Districts from the Dropdown field Validations
  And select Mandals from the dropdown field validations
  And select Villages from the dropdown field validations
  Then Click on the grid Search button
  And Click on the Export action button
  Then Click on the Enable Filter Result
  And select location as cluster
  And check with the Cluster selection
  And check with the search button