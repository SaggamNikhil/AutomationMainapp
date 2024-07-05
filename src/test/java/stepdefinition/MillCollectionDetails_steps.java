package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MillCollectionDetails;

public class MillCollectionDetails_steps {
	MillCollectionDetails MillCollectionDetails = new MillCollectionDetails();
	
	@Given ("^User is on login page screen$")
	public void User_is_on_login_page_screen() throws Throwable {
		MillCollectionDetails.User_is_on_login_page_screen();
	}
	@When ("^The User enters with the username and passwords input details$")
	public void The_User_enters_with_the_username_and_passwords_input_details() throws Throwable {
		MillCollectionDetails.The_User_enters_with_the_username_and_passwords_input_details();
	}
	@And ("^Clicks on the logins button from the login details page$")
	public void Clicks_on_the_logins_button_from_the_login_details_page() throws Throwable {
		MillCollectionDetails.Clicks_on_the_logins_button_from_the_login_details_page();
	}
	@Then ("^the page will be Navigated to the Dashboards home menu$")
	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu() throws Throwable {
		MillCollectionDetails.the_page_will_be_Navigated_to_the_Dashboards_home_menu();
	}
	@And ("^Dashboard menu click on the Mill Collection Details screen$")
	public void Dashboard_menu_click_on_the_Mill_Collection_Details_screen() throws Throwable {
		MillCollectionDetails.Dashboard_menu_click_on_the_Mill_Collection_Details_screen();
	}
	@Then ("^verify with the Active grid Select mill details$")
	public void verify_with_the_Active_grid_Select_mill_details() throws Throwable {
		MillCollectionDetails.verify_with_the_Active_grid_Select_mill_details();
	}
	@And ("^check with the From date selection input details$")
	public void check_with_the_From_date_selection_input_details() throws Throwable {
		MillCollectionDetails.check_with_the_From_date_selection_input_details();
	}
	@And ("^verify with the click on the Search button$")
	public void verify_with_the_click_on_the_Search_button() throws Throwable {
		MillCollectionDetails.verify_with_the_click_on_the_Search_button();
	}
	@Then ("^check with the View Print details$")
	public void check_with_the_View_Print_details() throws Throwable {
		MillCollectionDetails.check_with_the_View_Print_details();
	}
}
