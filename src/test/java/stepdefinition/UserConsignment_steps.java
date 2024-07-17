package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserConsignment;

public class UserConsignment_steps {
	UserConsignment UserConsignment = new UserConsignment();
	
	@Given ("^User is on login page of oilpalm project page$")
	public void User_is_on_login_page_of_oilpalm_project_page() throws Throwable {
		UserConsignment.User_is_on_login_page_of_oilpalm_project_page();
	}
	@When ("^The Users enters with the valid username and password inputs data details$")
	public void The_Users_enters_with_the_valid_username_and_password_inputs_data_details() throws Throwable {
		UserConsignment.The_Users_enters_with_the_valid_username_and_password_inputs_data_details();
	}
	@Then ("^the page will be Navigated to the Dashboards home main menu pages screens$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_main_menu_pages_screens() throws Throwable {
		UserConsignment.the_page_will_be_Navigated_to_the_Dashboards_home_main_menu_pages_screens();
	}
	@And ("^verify with the click on the Settings module$")
	public void verify_with_the_click_on_the_Settings_module() throws Throwable {
		UserConsignment.verify_with_the_click_on_the_Settings_module();
	}
	@Then ("^check with the click on the User consignment screen$")
	public void check_with_the_click_on_the_User_consignment_screen() throws Throwable {
		UserConsignment.check_with_the_click_on_the_User_consignment_screen();
	}
	@And ("^check with the Click on the Assign user consignment action button$")
	public void check_with_the_Click_on_the_Assign_user_consignment_action_button() throws Throwable {
		UserConsignment.check_with_the_Click_on_the_Assign_user_consignment_action_button();
	}
	@And ("^check with the Role selection from the dropdown list$")
	public void check_with_the_Role_selection_from_the_dropdown_list() throws Throwable {
		UserConsignment.check_with_the_Role_selection_from_the_dropdown_list();
	}
	@And ("^check with the user selection from the dropdown list$")
	public void check_with_the_user_selection_from_the_dropdown_list() throws Throwable {
		UserConsignment.check_with_the_user_selection_from_the_dropdown_list();
	}
	@And ("^check with the Nursery code selection from the dropdown list$")
	public void check_with_the_Nursery_code_selection_from_the_dropdown_list() throws Throwable {
		UserConsignment.check_with_the_Nursery_code_selection_from_the_dropdown_list();
	}
	@Then ("^check with the Consignment code from the Dropdown list$")
	public void check_with_the_Consignment_code_from_the_Dropdown_list() throws Throwable {
		UserConsignment.check_with_the_Consignment_code_from_the_Dropdown_list();
	}
	@When ("the popup screen clicking on the Save action button$")
	public void the_popup_screen_clicking_on_the_Save_action_button() throws Throwable {
		UserConsignment.the_popup_screen_clicking_on_the_Save_action_button();
	}
	@And ("^check with the Active grid by clicking on the edit button$")
	public void check_with_the_Active_grid_by_clicking_on_the_edit_button() throws Throwable {
		UserConsignment.check_with_the_Active_grid_by_clicking_on_the_edit_button();
	}
}
