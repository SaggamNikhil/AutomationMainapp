package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClusterTarget;

public class ClusterTarget_steps {
	ClusterTarget ClusterTarget = new ClusterTarget();
	
	@Given ("^User is login page of oilpalm project screens$")
	public void User_is_login_page_of_oilpalm_project_screens() throws Throwable {
		ClusterTarget.User_is_login_page_of_oilpalm_project_screens();
	}
	@When ("^The Users enters with the verify username and password inputs details$")
	public void The_Users_enters_with_the_verify_username_and_password_inputs_details() throws Throwable { 
		ClusterTarget.The_Users_enters_with_the_verify_username_and_password_inputs_details();
    }
	@Then ("^the page will be Navigated to the Dashboards Main menu details screens$")
	public void the_page_will_be_Navigated_to_the_Dashboards_Main_menu_details_screens() throws Throwable {
		ClusterTarget.the_page_will_be_Navigated_to_the_Dashboards_Main_menu_details_screens();
	}
	@And ("^verify with the click on the Settings modules navigate menu$")
	public void verify_with_the_click_on_the_Settings_modules_navigate_menu() throws Throwable {
		ClusterTarget.verify_with_the_click_on_the_Settings_modules_navigate_menu();
	}
	@Then ("^check with the navigated to the Cluster KRA screen$")
	public void check_with_the_navigated_to_the_Cluster_KRA_screen() throws Throwable {
		ClusterTarget.check_with_the_navigated_to_the_Cluster_KRA_screen();
	}
	@And ("^check with the Search cluster criteria$")
	public void check_with_the_Search_cluster_criteria() throws Throwable {
		ClusterTarget.check_with_the_Search_cluster_criteria();
	}
	@And ("^verify with actions by Edit button click$")
	public void verify_with_actions_by_Edit_button_click() throws Throwable {
		ClusterTarget.verify_with_actions_by_Edit_button_click();
	}
	@Then ("^check with the update Monthly target popup details$")
	public void check_with_the_update_Monthly_target_popup_details() throws Throwable {
		ClusterTarget.check_with_the_update_Monthly_target_popup_details();
	}
	@And ("^check with the click on the View monthly target details$")
	public void check_with_the_click_on_the_View_monthly_target_details() throws Throwable {
		ClusterTarget.check_with_the_click_on_the_View_monthly_target_details();
	}
}
