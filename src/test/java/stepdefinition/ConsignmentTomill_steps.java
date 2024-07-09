package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConsignmentTomill;

public class ConsignmentTomill_steps {
	ConsignmentTomill ConsignmentTomill = new ConsignmentTomill();
	
	@Given ("^User is on login page screen of oilpalm$")
	public void User_is_on_login_page_screen_of_oilpalm() throws Throwable {
		ConsignmentTomill.User_is_on_login_page_screen_of_oilpalm();
	}
	@When ("^The User enters with the username and passwords ip details$")
	public void The_User_enters_with_the_username_and_passwords_ip_details() throws Throwable {
		ConsignmentTomill.The_User_enters_with_the_username_and_passwords_ip_details();
	}
	@And ("^Clicks on the logins button from the login details screen$")
	public void Clicks_on_the_logins_button_from_the_login_details_screen() throws Throwable {
		ConsignmentTomill.Clicks_on_the_logins_button_from_the_login_details_screen();
	}
	@Then ("^the page will be Navigated to the Dashboards home menu page$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_page() throws Throwable {
		ConsignmentTomill.the_page_will_be_Navigated_to_the_Dashboards_home_menu_page();
	}
	@And ("^Dashboard menu click on the Consignment to mill screen$")
	public void Dashboard_menu_click_on_the_Consignment_to_mill_screen() throws Throwable {
		ConsignmentTomill.Dashboard_menu_click_on_the_Consignment_to_mill_screen();
	}
	@Then ("^Verify with the Select Collection center from the Drop down field$")
	public void Verify_with_the_Select_Collection_center_from_the_Drop_down_field() throws Throwable {
		ConsignmentTomill.Verify_with_the_Select_Collection_center_from_the_Drop_down_field();
	}
	@And ("^Verify with the Select From date input details$")
	public void Verify_with_the_Select_From_date_input_details() throws Throwable {
		ConsignmentTomill.Verify_with_the_Select_From_date_input_details();
	}
	@And ("^Verify with the Search button criteria results$")
	public void Verify_with_the_Search_button_criteria_results() throws Throwable {
		ConsignmentTomill.Verify_with_the_Search_button_criteria_results();
	}
	@And ("^check with the All details input count details$")
	public void check_with_the_All_details_input_count_details() throws Throwable {
		ConsignmentTomill.check_with_the_All_details_input_count_details();
	}
	@Then ("^check with the clicking on the View Receipt details$")
	public void check_with_the_clicking_on_the_View_Receipt_details() throws Throwable {
		ConsignmentTomill.check_with_the_clicking_on_the_View_Receipt_details();
	}
}
