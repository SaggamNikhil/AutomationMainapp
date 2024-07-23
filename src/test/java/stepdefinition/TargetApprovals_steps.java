package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TargetApprovals;

public class TargetApprovals_steps {
	TargetApprovals  TargetApprovals  = new TargetApprovals();
	
	@Given ("^User is login page of the oilpalm project screens$")
	public void User_is_login_page_of_the_oilpalm_project_screens() throws Throwable {
	TargetApprovals.User_is_login_page_of_the_oilpalm_project_screens();
    }
	@When ("^The Users enters with the a username and password inputs details$")
	public void The_Users_enters_with_the_a_username_and_password_inputs_details() throws Throwable {
		TargetApprovals.The_Users_enters_with_the_a_username_and_password_inputs_details();
	}
	@Then ("^the page will be Navigate to the Dashboards Main menu details screens$")
	public void the_page_will_be_Navigate_to_the_Dashboards_Main_menu_details_screens() throws Throwable {
		TargetApprovals.the_page_will_be_Navigate_to_the_Dashboards_Main_menu_details_screens();
	}
	@And ("^verify with the click on the Settings modules nav menu$")
	public void verify_with_the_click_on_the_Settings_modules_nav_menu() throws Throwable {
		TargetApprovals.verify_with_the_click_on_the_Settings_modules_nav_menu();
	}
	@Then ("^check with the navigated to the target Approvals screen$")
	public void check_with_the_navigated_to_the_target_Approvals_screen() throws Throwable {
		TargetApprovals.check_with_the_navigated_to_the_target_Approvals_screen();
	}
	@And ("^check with the Manager selection Dropdown input details$")
	public void check_with_the_Manager_selection_Dropdown_input_details() throws Throwable {
		TargetApprovals.check_with_the_Manager_selection_Dropdown_input_details();
	}
	@And ("^check with the Select user Drodown field details$")
	public void check_with_the_Select_user_Drodown_field_details() throws Throwable {
		TargetApprovals.check_with_the_Select_user_Drodown_field_details();
	}
	@Then ("^check with the clicking on the Search action button from the grid$")
	public void check_with_the_clicking_on_the_Search_action_button_from_the_grid() throws Throwable {
		TargetApprovals.check_with_the_clicking_on_the_Search_action_button_from_the_grid();
	}
	@And ("^check with the Clicking on the clear action button from the grid$")
	public void check_with_the_Clicking_on_the_clear_action_button_from_the_grid() throws Throwable {
		TargetApprovals.check_with_the_Clicking_on_the_clear_action_button_from_the_grid();
	}
	@And ("^check with the select Manager as L2 manager details$")
	public void check_with_the_select_Manager_as_L2_manager_details() throws Throwable {
		TargetApprovals.check_with_the_select_Manager_as_L2_manager_details();
	}
	@And ("^check with the select user for L2 manager details$")
	public void check_with_the_select_user_for_L2_manager_details() throws Throwable {
		TargetApprovals.check_with_the_select_user_for_L2_manager_details();
	}
}