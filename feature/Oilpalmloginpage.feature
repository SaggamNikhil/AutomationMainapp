@OilPalm_Requirement
Feature: feature to test login functionality

@login_page1
 Scenario: Validate login is successful with valid credentials
  Given User is on login screen
  When User enter username and password
  And Clicks With the logins button
  Then Click on the Otp submit button
  Then Navigate to the Dashboard falsh screen
  
@login_page2
 Scenario: Validate login is successful with Invalid credentials
  Given User is on login screen
  Then Check with the Invalid Username and valid password
  And Clicks With the logins button
  