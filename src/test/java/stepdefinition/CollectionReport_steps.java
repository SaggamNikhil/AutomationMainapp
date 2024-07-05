package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CollectionReport;

public class CollectionReport_steps {
	CollectionReport CollectionReport = new CollectionReport();
	@Given("^User is on login page navga$")
	public void User_is_on_login_page_navga() throws Throwable {
		CollectionReport.User_is_on_login_page_navga();
	}

	@When("^User enters with the username and password$")
	public void User_enters_with_the_username_and_password() throws Throwable {
		CollectionReport.User_enters_with_the_username_and_password();
	}

	@And("^Clicks on the login button from login screen$")
	public void Clicks_on_the_login_button_from_login_screen() throws Throwable {
		CollectionReport.Clicks_on_the_login_button_from_login_screen();
	}
	@Then ("^Navigate to the Dashboard home screens$")
	public void Navigate_to_the_Dashboard_home_screens() throws Throwable {
		CollectionReport.Navigate_to_the_Dashboard_home_screens();
	}
	@Then ("^check with the Collection report navigation menu$")
	public void check_with_the_Collection_report_navigation_menu() throws Throwable {
		CollectionReport.check_with_the_Collection_report_navigation_menu();
	}
	@Then ("^check with the Select Location type input details$")
	public void check_with_the_Select_Location_type_input_details() throws Throwable {
		CollectionReport.check_with_the_Select_Location_type_input_details();
	}
	@Then ("^check with the Select Verification type input details$")
	public void check_with_the_Select_Verification_type_input_details() throws Throwable {
		CollectionReport.check_with_the_Select_Verification_type_input_details();
	}
	@And ("^check with the State selection fron the Active grid details$")
	public void check_with_the_State_selection_fron_the_Active_grid_details() throws Throwable {
		CollectionReport.check_with_the_State_selection_fron_the_Active_grid_details();
	}
	@And ("^check with the District selection from the Active grid details$")
	public void check_with_the_District_selection_from_the_Active_grid_details() throws Throwable {
		CollectionReport.check_with_the_District_selection_from_the_Active_grid_details();
	}
	@And ("^check with the Mandal selection from the Active grid details$")
	public void check_with_the_Mandal_selection_from_the_Active_grid_details() throws Throwable {
		CollectionReport.check_with_the_Mandal_selection_from_the_Active_grid_details();
	}
	@And ("^check with the Villages selection from the Active grid details$")
	public void check_with_the_Villages_selection_from_the_Active_grid_details() throws Throwable {
		CollectionReport.check_with_the_Villages_selection_from_the_Active_grid_details();
	}
//	@Then ("^check with the Select Collection center from the Dropdown field$")
//	public void check_with_the_Select_Collection_center_from_the_Dropdown_field() throws Throwable {
//		CollectionReport.check_with_the_Select_Collection_center_from_the_Dropdown_field();
//	}
	@Then ("^check with the From date input selection validation$")
	public void check_with_the_From_date_input_selection_validation() throws Throwable {
		CollectionReport.check_with_the_From_date_input_selection_validation();
	}
	@And ("^check with the click on the Search button details$")
	public void check_with_the_click_on_the_Search_button_details() throws Throwable {
		CollectionReport.check_with_the_click_on_the_Search_button_details();
	}
	@Then ("^check with the Select all checkbox input selection$")
	public void check_with_the_Select_all_checkbox_input_selection() throws Throwable {
		CollectionReport.check_with_the_Select_all_checkbox_input_selection();
	}
	@And ("^check with the selected Collection details verification details$")
	public void check_with_the_selected_Collection_details_verification_details() throws Throwable {
		CollectionReport.check_with_the_selected_Collection_details_verification_details();
	}
	@When ("^click on the Edit action button details$")
	public void click_on_the_Edit_action_button_details() throws Throwable {
		CollectionReport.click_on_the_Edit_action_button_details();
	}
	@Then ("^check with the clicking on the Cancelled action button$")
	public void check_with_the_clicking_on_the_Cancelled_action_button() throws Throwable {
		CollectionReport.check_with_the_clicking_on_the_Cancelled_action_button();
	}
}
