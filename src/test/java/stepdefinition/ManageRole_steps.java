package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManageRole;

public class ManageRole_steps {
	ManageRole ManageRole = new ManageRole();
	
	@Given ("^User is on login page screen of oilpalm project$")
	public void User_is_on_login_page_screen_of_oilpalm_project() throws Throwable {
		ManageRole.User_is_on_login_page_screen_of_oilpalm_project();
	}
	@When ("^The User enter with the valid username and password input details$")
	public void The_User_enter_with_the_valid_username_and_password_input_details() throws Throwable {
		ManageRole.The_User_enter_with_the_valid_username_and_password_input_details();
	}
	@Then ("^the page will be Navigated to the Dashboards home menu page details$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_page_details() throws Throwable {
		ManageRole.the_page_will_be_Navigated_to_the_Dashboards_home_menu_page_details();
	}
	@And ("^check with the click on the Settings module$")
	public void check_with_the_click_on_the_Settings_module() throws Throwable {
		ManageRole.check_with_the_click_on_the_Settings_module();
	}
	@Then ("^check with click on the Role screen module name$")
	public void check_with_click_on_the_Role_screen_module_name() throws Throwable {
		ManageRole.check_with_click_on_the_Role_screen_module_name();
	}
	@And ("^check with Click on the Add Role action button$")
	public void check_with_Click_on_the_Add_Role_action_button() throws Throwable {
		ManageRole.check_with_Click_on_the_Add_Role_action_button();
	}
	@And ("^check with the click on the Name input field$")
	public void check_with_the_click_on_the_Name_input_field() throws Throwable {
		ManageRole.check_with_the_click_on_the_Name_input_field();
	}
	@And ("^check with the Select Reported role from the Add new role popup screen$")
	public void check_with_the_Select_Reported_role_from_the_Add_new_role_popup_screen() throws Throwable {
		ManageRole.check_with_the_Select_Reported_role_from_the_Add_new_role_popup_screen();
	}
	@And ("^check with the code input details$")
	public void check_with_the_code_input_details() throws Throwable {
		ManageRole.check_with_the_code_input_details();
	}
	@Then ("^check with the Description input details$")
	public void check_with_the_Description_input_details() throws Throwable {
		ManageRole.check_with_the_Description_input_details();
	}
	@And ("^check with the Select activity right from the dropdown field$")
	public void check_with_the_Select_activity_right_from_the_dropdown_field() throws Throwable {
		ManageRole.check_with_the_Select_activity_right_from_the_dropdown_field();
	}
	@And ("^check with the Clicking on the save action button$")
	public void check_with_the_Clicking_on_the_save_action_button() throws Throwable {
		ManageRole.check_with_the_Clicking_on_the_save_action_button();
	}
	@Then ("^check with the View role Hierarchy details$")
	public void check_with_the_View_role_Hierarchy_details() throws Throwable {
		ManageRole.check_with_the_View_role_Hierarchy_details();
	}
	@And ("^check with the Enable filter button$")
	public void check_with_the_Enable_filter_button() throws Throwable {
		ManageRole.check_with_the_Enable_filter_button();
	}
	@Then ("^check with the Edit action details$")
	public void check_with_the_Edit_action_details() throws Throwable {
		ManageRole.check_with_the_Edit_action_details();
	}
}
