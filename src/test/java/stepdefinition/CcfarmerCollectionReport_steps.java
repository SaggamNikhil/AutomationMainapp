package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CcfarmerCollectionReport;

public class CcfarmerCollectionReport_steps {
	CcfarmerCollectionReport CcfarmerCollectionReport = new CcfarmerCollectionReport();
	
	@Given ("^User is on login page navgat$")
	public void User_is_on_login_page_navgat() throws Throwable {
		CcfarmerCollectionReport.User_is_on_login_page_navgat();
	}
	@When ("^User enters with the username and password details$")
	public void User_enters_with_the_username_and_password_details() throws Throwable {
		CcfarmerCollectionReport.User_enters_with_the_username_and_password_details();
	}
	@And ("^Clicks on the login button from login pag$")
	public void Clicks_on_the_login_button_from_login_pag() throws Throwable {
		CcfarmerCollectionReport.Clicks_on_the_login_button_from_login_pag();
	}
	@Then ("^Navigate to the Dashboard home pag$")
	public void Navigate_to_the_Dashboard_home_pag() throws Throwable {
		CcfarmerCollectionReport.Navigate_to_the_Dashboard_home_pag();
	}
	@Then ("^check with the CC Farmer Collection report navigation menu$")
	public void check_with_the_CC_Farmer_Collection_report_navigation_menu() throws Throwable {
		CcfarmerCollectionReport.check_with_the_CC_Farmer_Collection_report_navigation_menu();
	}
	@Then ("^check with the Select Location type From the active grid details$")
	public void check_with_the_Select_Location_type_From_the_active_grid_details() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_Location_type_From_the_active_grid_details();
	}
	@Then ("^Verify with the Select Verification Dropdown input field$")
	public void Verify_with_the_Select_Verification_Dropdown_input_field() throws Throwable {
		CcfarmerCollectionReport.Verify_with_the_Select_Verification_Dropdown_input_field();	
	}
	@And ("^check with the Select States From the Dropdown input field$")
	public void check_with_the_Select_States_From_the_Dropdown_input_field() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_States_From_the_Dropdown_input_field();
	}
	@And ("^check with the Select Districts from the Dropdown input field$")
	public void check_with_the_Select_Districts_from_the_Dropdown_input_field() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_Districts_from_the_Dropdown_input_field();
    }
	@And ("^check with the Select Mandals from the Dropdown input field$")
	public void check_with_the_Select_Mandals_from_the_Dropdown_input_field() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_Mandals_from_the_Dropdown_input_field();
	}
	@And ("^check with the Select Villages from the Dropdown input field$")
	public void check_with_the_Select_Villages_from_the_Dropdown_input_field() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_Villages_from_the_Dropdown_input_field();
	}
	@And ("^check with the Select From date input details$")
	public void check_with_the_Select_From_date_input_details() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_From_date_input_details();
	}
	@Then ("^check with the Click on the Search action button$")
	public void check_with_the_Click_on_the_Search_action_button() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Click_on_the_Search_action_button();
	}
	@And ("^check with the Select All checkbox selection input$")
	public void check_with_the_Select_All_checkbox_selection_input() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_All_checkbox_selection_input();
	}
	@And ("^check with the Select Collection verification details$")
	public void check_with_the_Select_Collection_verification_details() throws Throwable {
		CcfarmerCollectionReport.check_with_the_Select_Collection_verification_details();
	}
	@And ("^check with the click on the Edit action button$")
	public void check_with_the_click_on_the_Edit_action_button() throws Throwable {
		CcfarmerCollectionReport.check_with_the_click_on_the_Edit_action_button();
	}
	@And ("^check with the clicking on the cancel action buttons$")
	public void check_with_the_clicking_on_the_cancel_action_buttons() throws Throwable {
		CcfarmerCollectionReport.check_with_the_clicking_on_the_cancel_action_buttons();
	}
	@And ("^check with the click on the View Receipt action details$")
	public void check_with_the_click_on_the_View_Receipt_action_details() throws Throwable {
		CcfarmerCollectionReport.check_with_the_click_on_the_View_Receipt_action_details();
	}
}
