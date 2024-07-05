package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConsignmentMerge;

public class ConsignmentMerge_steps {
	ConsignmentMerge ConsignmentMerge = new ConsignmentMerge();
	
	@Given ("^User is on login page navgations$")
	public void User_is_on_login_page_navgations() throws Throwable {
		ConsignmentMerge.User_is_on_login_page_navgations();
	}
	@When ("^The User enters with the username and passwords details$")
	public void The_User_enters_with_the_username_and_passwords_details() throws Throwable {
		ConsignmentMerge.The_User_enters_with_the_username_and_passwords_details();
	}
	@And ("^Clicks on the logins button from login details page$")
	public void Clicks_on_the_logins_button_from_login_details_page() throws Throwable {
		ConsignmentMerge.Clicks_on_the_logins_button_from_login_details_page();
	}
	@Then ("^the page will be Navigate to the Dashboards home menu$")
	public void the_page_will_be_Navigate_to_the_Dashboards_home_menu() throws Throwable {
		ConsignmentMerge.the_page_will_be_Navigate_to_the_Dashboards_home_menu();
	}
	@And ("^Dashboard menu click on the Consignment Merge screen$")
	public void Dashboard_menu_click_on_the_Consignment_Merge_screen() throws Throwable {
		ConsignmentMerge.Dashboard_menu_click_on_the_Consignment_Merge_screen();
	}
	@Then ("^check with the Active grid Status type Dropdown selection field$")
	public void check_with_the_Active_grid_Status_type_Dropdown_selection_field() throws Throwable {
		ConsignmentMerge.check_with_the_Active_grid_Status_type_Dropdown_selection_field();
	}
	@And ("^check with the Active grid Select collection center dropdown field$")
	public void check_with_the_Active_grid_Select_collection_center_dropdown_field() throws Throwable {
		ConsignmentMerge.check_with_the_Active_grid_Select_collection_center_dropdown_field();
	}
	@Then ("^verify with the From date input selection details$")
	public void verify_with_the_From_date_input_selection_details() throws Throwable {
		ConsignmentMerge.verify_with_the_From_date_input_selection_details();
	}
	@And ("^check with the Vehicle number input details validation$")
	public void check_with_the_Vehicle_number_input_details_validation() throws Throwable {
		ConsignmentMerge.check_with_the_Vehicle_number_input_details_validation();
	}
	@When ("^click on the search details button$")
	public void click_on_the_search_details_button() throws Throwable {
		ConsignmentMerge.click_on_the_search_details_button();
	}
	@Then ("^check with the Checkbox selection from the Active grid$")
	public void check_with_the_Checkbox_selection_from_the_Active_grid() throws Throwable {
		ConsignmentMerge.check_with_the_Checkbox_selection_from_the_Active_grid();
	}
	@When ("^Click on the Merge action button$")
	public void Click_on_the_Merge_action_button() throws Throwable {
		ConsignmentMerge.Click_on_the_Merge_action_button();
	}
}
