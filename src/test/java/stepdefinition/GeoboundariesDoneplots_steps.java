package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GeoboundariesDoneplots;

public class GeoboundariesDoneplots_steps {
	GeoboundariesDoneplots GeoboundariesDoneplots = new GeoboundariesDoneplots();
	
	@Given ("the users has entered{string}")
	public void the_users_has_entered(String username) throws Throwable {
		GeoboundariesDoneplots.the_users_has_entered(username);
	}
	@And ("the users has entered1{string}") 
	public void the_users_has_entered1(String password)throws Throwable{
		GeoboundariesDoneplots.the_users_has_entered1(password);
	}
	@And  ("^User click on the LogIn$")
	public void User_click_on_the_LogIn() throws Throwable {
		GeoboundariesDoneplots.User_click_on_the_LogIn();
	}
	@Then ("^Users navigated to the home page$")
	public void Users_navigated_to_the_home_page() throws Throwable {
		GeoboundariesDoneplots.Users_navigated_to_the_home_page();
	}
	@Then ("^Click on the Activities module main menus$")
	public void Click_on_the_Activities_module_main_menus() throws Throwable {
		GeoboundariesDoneplots.Click_on_the_Activities_module_main_menus();
	}
	@And ("^click on the Geo Boundaries Done Plots menu$")
	public void click_on_the_Geo_Boundaries_Done_Plots_menu() throws Throwable {
		GeoboundariesDoneplots.click_on_the_Geo_Boundaries_Done_Plots_menu();
	}
	@Then ("^Check with the Select Location details$")
	public void Check_with_the_Select_Location_details() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_Select_Location_details();
	}
	@And ("^Check with the Select States from the Geoboundaries Done Plots screen$")
	public void Check_with_the_Select_States_from_the_Geoboundaries_Done_Plots_screen() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_Select_States_from_the_Geoboundaries_Done_Plots_screen();
	}
	@And ("^Check with the Select Districts from the Geoboundaries Done Plots screen$")
	public void Check_with_the_Select_Districts_from_the_Geoboundaries_Done_Plots_screen() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_Select_Districts_from_the_Geoboundaries_Done_Plots_screen();
	}
	@And ("^Check with the Select Mandals from the Geoboundaries Done plots screen$")
	public void Check_with_the_Select_Mandals_from_the_Geoboundaries_Done_plots_screen() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_Select_Mandals_from_the_Geoboundaries_Done_plots_screen();
	}
	@And ("^Check with the Select Villages from the Geoboundaries Done plots screen$")
	public void Check_with_the_Select_Villages_from_the_Geoboundaries_Done_plots_screen() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_Select_Villages_from_the_Geoboundaries_Done_plots_screen();
	}
	@Then ("^Check with the Clicking on the Search button$")
	public void Check_with_the_Clicking_on_the_Search_button() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_Clicking_on_the_Search_button();
		
	}
	@Then ("^Check with the From date selection from the Active grid$")
	public void Check_with_the_From_date_selection_from_the_Active_grid() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_From_date_selection_from_the_Active_grid();
	}
	@And ("^Check with the All Documents Submitted checkbox selection$")
	public void Check_with_the_All_Documents_Submitted_checkbox_selection() throws Throwable {
		GeoboundariesDoneplots.Check_with_the_All_Documents_Submitted_checkbox_selection();
	}
	@And ("^check with the Bank details Confirmation popup window$")
	public void check_with_the_Bank_details_Confirmation_popup_window() throws Throwable {
		GeoboundariesDoneplots.check_with_the_Bank_details_Confirmation_popup_window();
	}
	@And ("^check with the All details correct or not checkbox input$")
	public void check_with_the_All_details_correct_or_not_checkbox_input() throws Throwable {
		GeoboundariesDoneplots.check_with_the_All_details_correct_or_not_checkbox_input();
	}
	@And ("^check with the Geo Boundaries verification Checkbox input$")
	public void check_with_the_Geo_Boundaries_verification_Checkbox_input() throws Throwable {
		GeoboundariesDoneplots.check_with_the_Geo_Boundaries_verification_Checkbox_input();
	}
	@And ("^check with the verify action confirmation$")
	public void check_with_the_verify_action_confirmation() throws Throwable {
		GeoboundariesDoneplots.check_with_the_verify_action_confirmation();
	}
}
