package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManageUser;

public class ManageUser_steps {
	ManageUser ManageUser  = new ManageUser();
	@Given ("^User is on login page screen of oilpalm projects$")
	public void User_is_on_login_page_screen_of_oilpalm_projects() throws Throwable {
		ManageUser.User_is_on_login_page_screen_of_oilpalm_projects();
	}
	@When ("^The User enter with the valid username and password inputs details$")
	public void The_User_enter_with_the_valid_username_and_password_inputs_details() throws Throwable {
		ManageUser.The_User_enter_with_the_valid_username_and_password_inputs_details();
	}
	@Then ("^the page will be Navigated to the Dashboards home menu pages details$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_pages_details() throws Throwable {
		ManageUser.the_page_will_be_Navigated_to_the_Dashboards_home_menu_pages_details();
	}
	@And ("^check with the click on the Settings modules$")
	public void check_with_the_click_on_the_Settings_modules() throws Throwable {
		ManageUser.check_with_the_click_on_the_Settings_modules();
	}
	@Then ("^check with the click on the Manage user screen$")
	public void check_with_the_click_on_the_Manage_user_screen() throws Throwable {
		ManageUser.check_with_the_click_on_the_Manage_user_screen();
	}
	@And ("^check with the Click on the Add user action button$")
	public void check_with_the_Click_on_the_Add_user_action_button() throws Throwable {
		ManageUser.check_with_the_Click_on_the_Add_user_action_button();
	}
	@And ("^check with the First name input field details$")
	public void check_with_the_First_name_input_field_details()throws Throwable {
		ManageUser.check_with_the_First_name_input_field_details();
	}
	@And ("^check with the Last name input field details$")
	public void check_with_the_Last_name_input_field_details() throws Throwable {
		ManageUser.check_with_the_Last_name_input_field_details();
	}
	@Then ("^check with the Username input field details$")
	public void check_with_the_Username_input_field_details() throws Throwable {
		ManageUser.check_with_the_Username_input_field_details();
	}
	@And ("^check with the Password input field validation details$")
	public void check_with_the_Password_input_field_validation_details() throws Throwable {
		ManageUser.check_with_the_Password_input_field_validation_details();
	}
	@And ("^check with the Confirm Password input field validation details$")
	public void check_with_the_Confirm_Password_input_field_validation_details() throws Throwable {
		ManageUser.check_with_the_Confirm_Password_input_field_validation_details();
	}
	@Then ("^check with the Contact number input field validation details$")
	public void check_with_the_Contact_number_input_field_validation_details() throws Throwable {
		ManageUser.check_with_the_Contact_number_input_field_validation_details();
	}
	@And ("^check with the Role selection input field validations$")
	public void check_with_the_Role_selection_input_field_validations() throws Throwable {
		ManageUser.check_with_the_Role_selection_input_field_validations();
	}
	@And ("^check with the Final assessment done by input field validation$")
	public void check_with_the_Final_assessment_done_by_input_field_validation() throws Throwable {
		ManageUser.check_with_the_Final_assessment_done_by_input_field_validation();
	}
	@Then ("^check with the Reporting manager selection input field validations$")
	public void check_with_the_Reporting_manager_selection_input_field_validations() throws Throwable {
		ManageUser.check_with_the_Reporting_manager_selection_input_field_validations();
	}
	@And ("^check with the L one manager selection input field validations$")
	public void check_with_the_L_one_manager_selection_input_field_validations() throws Throwable {
		ManageUser.check_with_the_L_one_manager_selection_input_field_validations();
	}
	@And ("^check with the L two manager selection input field validations$")
	public void check_with_the_L_two_manager_selection_input_field_validations() throws Throwable {
		ManageUser.check_with_the_L_two_manager_selection_input_field_validations();
	}
	@Then ("^check with the Employee code input validation details$")
	public void check_with_the_Employee_code_input_validation_details() throws Throwable {
		ManageUser.check_with_the_Employee_code_input_validation_details();
	}
	@And ("^check with the State selection dropdown input details$")
	public void check_with_the_State_selection_dropdown_input_details() throws Throwable {
		ManageUser.check_with_the_State_selection_dropdown_input_details();
	}
	@Then ("^check with the Cluster selection dropdown input details$")
	public void check_with_the_Cluster_selection_dropdown_input_details() throws Throwable {
		ManageUser.check_with_the_Cluster_selection_dropdown_input_details();
	}
	@And ("^check with the select office type option details$")
	public void check_with_the_select_office_type_option_details() throws Throwable {
		ManageUser.check_with_the_select_office_type_option_details();
	}
	@And ("^check with the click on the Save action button$")
	public void check_with_the_click_on_the_Save_action_button() throws Throwable {
		ManageUser.check_with_the_click_on_the_Save_action_button();
	}
}
