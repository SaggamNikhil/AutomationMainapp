package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Alloilplamplots;

public class Alloilpalmplots_steps {
	Alloilplamplots Alloilplamplots = new Alloilplamplots();
	
	@Given ("^signIn with the Respective user roles details$")
	public void signIn_with_the_Respective_user_roles_details() throws Throwable {
		Alloilplamplots.signIn_with_the_Respective_user_roles_details();
	}
	@Then ("^the page will Navigate to the Dashboard menu of the oilpalm screens$")
	public void the_page_will_Navigate_to_the_Dashboard_menu_of_the_oilpalm_screens() throws Throwable {
		Alloilplamplots.the_page_will_Navigate_to_the_Dashboard_menu_of_the_oilpalm_screens();
	}
	@Then ("^click on the menu as a Area Extension module$")
	public void click_on_the_menu_as_a_Area_Extension_module() throws Throwable{
		Alloilplamplots.click_on_the_menu_as_a_Area_Extension_module();
	}
	@And ("^Click on the Alloilpalm plots screen$")
	public void Click_on_the_Alloilpalm_plots_screen() throws Throwable {
		Alloilplamplots.Click_on_the_Alloilpalm_plots_screen();
	}
	@Then ("^check with location type selection from the grid$")
	public void check_with_location_type_selection_from_the_grid() throws Throwable {
		Alloilplamplots.check_with_location_type_selection_from_the_grid();
	}
	@Then ("^select State from the Alloilpalmplots active grid screen$")
	public void select_State_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		Alloilplamplots.select_State_from_the_Alloilpalmplots_active_grid_screen();
	}
	@And ("^select Distrtict from the Alloilpalmplots active grid screen$")
	public void select_Distrtict_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		Alloilplamplots.select_Distrtict_from_the_Alloilpalmplots_active_grid_screen();
	}
	@And ("^select Mandal from the Alloilpalmplots active grid screen$")
	public void select_Mandal_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		Alloilplamplots.select_Mandal_from_the_Alloilpalmplots_active_grid_screen();
	}
	@And ("^select villages from the Alloilpalmplots active grid screen$")
	public void select_villages_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		Alloilplamplots.select_villages_from_the_Alloilpalmplots_active_grid_screen();
	}
	@And ("^select Ploststatus from the Alloilplamplots active grid screen$")
	public void select_Ploststatus_from_the_Alloilplamplots_active_grid_screen() throws Throwable {
		Alloilplamplots.select_Ploststatus_from_the_Alloilplamplots_active_grid_screen();
	}
	@Then ("^check with the From date selection from the Alloilplamplots active grid screen$")
	public void check_with_the_From_date_selection_from_the_Alloilplamplots_active_grid_screen() throws Throwable {
		Alloilplamplots.check_with_the_From_date_selection_from_the_Alloilplamplots_active_grid_screen();
	}
	@And ("^check with search button click$")
	public void check_with_search_button_click() throws Throwable {
		Alloilplamplots.check_with_search_button_click();
	}
	@Then ("^check with actions by Ho approvals$")
    public void check_with_actions_by_Ho_approvals() throws Throwable {
		Alloilplamplots.check_with_actions_by_Ho_approvals();
	}
}
