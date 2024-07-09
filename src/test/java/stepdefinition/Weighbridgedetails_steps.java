package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Weighbridgedetails;

public class Weighbridgedetails_steps {
	Weighbridgedetails Weighbridgedetails = new Weighbridgedetails();
	
	@Given ("^User is on login page of oilpalm screen$")
	public void User_is_on_login_page_of_oilpalm_screen() throws Throwable {
		Weighbridgedetails.User_is_on_login_page_of_oilpalm_screen();
	}
	@When ("^The User enters with the username and passwords ip data details$")
	public void The_User_enters_with_the_username_and_passwords_ip_data_details() throws Throwable {
		Weighbridgedetails.The_User_enters_with_the_username_and_passwords_ip_data_details();
	}
	@And ("^Clicks on the logins button from the login details screens$")
	public void Clicks_on_the_logins_button_from_the_login_details_screens() throws Throwable {
		Weighbridgedetails.Clicks_on_the_logins_button_from_the_login_details_screens();
	}
	@Then ("^the page will be Navigated to the Dashboards home menu pages$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_pages() throws Throwable {
		Weighbridgedetails.the_page_will_be_Navigated_to_the_Dashboards_home_menu_pages();
	}
	@And ("^Check with the Clicking on the Weighbridge details screen$")
	public void Check_with_the_Clicking_on_the_Weighbridge_details_screen() throws Throwable {
		Weighbridgedetails.Check_with_the_Clicking_on_the_Weighbridge_details_screen();
	}
	@Then ("^check with the Select Mill Dropdown input field$")
	public void check_with_the_Select_Mill_Dropdown_input_field() throws Throwable {
		Weighbridgedetails.check_with_the_Select_Mill_Dropdown_input_field();
	}
	@And ("^check with the Select Status Dropdown input field$")
	public void check_with_the_Select_Status_Dropdown_input_field() throws Throwable {
		Weighbridgedetails.check_with_the_Select_Status_Dropdown_input_field();
	}
	@And ("^check with the From Date selection ip details$")
	public void check_with_the_From_Date_selection_ip_details() throws Throwable {
		Weighbridgedetails.check_with_the_From_Date_selection_ip_details();
	}
	@When ("^Click on the Search actions button input details$")
	public void Click_on_the_Search_actions_button_input_details() throws Throwable {
		Weighbridgedetails.Click_on_the_Search_actions_button_input_details();
	}
	@And ("^check with the In progress and processed weight bridge details count$")
	public void check_with_the_In_progress_and_processed_weight_bridge_details_count() throws Throwable {
		Weighbridgedetails.check_with_the_In_progress_and_processed_weight_bridge_details_count();
	}
	@Then ("^check with the click on the Print Token details$")
	public void check_with_the_click_on_the_Print_Token_details() throws Throwable {
		Weighbridgedetails.check_with_the_click_on_the_Print_Token_details();
	}
}
