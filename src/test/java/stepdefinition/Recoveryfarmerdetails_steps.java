package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Recoveryfarmerdetails;

public class Recoveryfarmerdetails_steps {
	Recoveryfarmerdetails Recoveryfarmerdetails = new Recoveryfarmerdetails();
	
	@Given ("^the user signin with the Respective role details$")
	public void the_user_signin_with_the_Respective_role_details() throws Throwable {
		Recoveryfarmerdetails.the_user_signin_with_the_Respective_role_details();
	}
	@Then  ("^the page will Navigate to the Dashboard screen of the main page$")
	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_page() throws Throwable {
		Recoveryfarmerdetails.the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_page();
	}
	@Then ("^click on the menu as a Activities module$")
	public void click_on_the_menu_as_a_Activities_module() throws Throwable {
		Recoveryfarmerdetails.click_on_the_menu_as_a_Activities_module();
	}
	@And ("^click on the Recovery farmer details screen$")
	public void click_on_the_Recovery_farmer_details_screen() throws Throwable {
		Recoveryfarmerdetails.click_on_the_Recovery_farmer_details_screen();
	}
	@And ("^check with the From date selection from the Recovery farmer details screen$")
	public void check_with_the_From_date_selection_from_the_Recovery_farmer_details_screen() throws Throwable {
		Recoveryfarmerdetails.check_with_the_From_date_selection_from_the_Recovery_farmer_details_screen();
	}
	@Then ("^check with the click on the search button$")
	public void check_with_the_click_on_the_search_button() throws Throwable {
		Recoveryfarmerdetails.check_with_the_click_on_the_search_button();
	}
	@When ("^click on the Add recovery farmer action button$")
	public void click_on_the_Add_recovery_farmer_action_button() throws Throwable {
		Recoveryfarmerdetails.click_on_the_Add_recovery_farmer_action_button();
	}
	@And ("^check with the click on the Search button$")
	public void check_with_the_click_on_the_Search_button() throws Throwable {
		Recoveryfarmerdetails.check_with_the_click_on_the_Search_button();
	}
	@Then ("^select farmer from the auto suggestion key list$")
	public void select_farmer_from_the_auto_suggestion_key_list() throws Throwable {
		Recoveryfarmerdetails.select_farmer_from_the_auto_suggestion_key_list();
	}
	@And ("^check with the add recoveryfarmers by using Add action button$")
	public void check_with_the_add_recoveryfarmers_by_using_Add_action_button() throws Throwable {
		Recoveryfarmerdetails.check_with_the_add_recoveryfarmers_by_using_Add_action_button();
	}
}
