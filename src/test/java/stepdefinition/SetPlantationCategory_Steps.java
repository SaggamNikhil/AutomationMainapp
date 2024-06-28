package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SetPlantationCategory;

public class SetPlantationCategory_Steps {
	SetPlantationCategory SetPlantationCategory = new SetPlantationCategory();
	
	@Given ("the user has entered{string}")
	public void the_user_has_entered(String username) throws Throwable {
		SetPlantationCategory.the_user_has_entered(username);
	}
	@And ("the user has entered1{string}") 
	public void the_user_has_entered1(String password)throws Throwable{
		SetPlantationCategory.the_user_has_entered1(password);
	}
	@And  ("^User click on the signIn$")
	public void User_click_on_the_signIn() throws Throwable {
		SetPlantationCategory.User_click_on_the_signIn();
	}
	@Then ("^User navigated to the home page$")
	public void User_navigated_to_the_home_page() throws Throwable {
		SetPlantationCategory.User_navigated_to_the_home_page();
	}
	@Then ("^Click on the Activities module main menu$")
	public void Click_on_the_Activities_module_main_menu() throws Throwable {
		SetPlantationCategory.Click_on_the_Activities_module_main_menu();
	}
	@And ("^click on the Setplantation category screen$")
	public void click_on_the_Setplantation_category_screen() throws Throwable {
		SetPlantationCategory.click_on_the_Setplantation_category_screen();
	}
	@Then ("^check with the Select financial year wise data$")
	public void check_with_the_Select_financial_year_wise_data() throws Throwable {
		SetPlantationCategory.check_with_the_Select_financial_year_wise_data();
	}
	@And ("^check with the Select location type from the Active grid data details$")
	public void check_with_the_Select_location_type_from_the_Active_grid_data_details() throws Throwable {
		SetPlantationCategory.check_with_the_Select_location_type_from_the_Active_grid_data_details();
	}
	@And ("^check with the Select States from the Dropdown list data details$")
	public void check_with_the_Select_States_from_the_Dropdown_list_data_details() throws Throwable {
		SetPlantationCategory.check_with_the_Select_States_from_the_Dropdown_list_data_details();
	}
	@And ("^check with the Select Districts from the Dropdowm list data details$")
	public void check_with_the_Select_Districts_from_the_Dropdowm_list_data_details() throws Throwable {
		SetPlantationCategory.check_with_the_Select_Districts_from_the_Dropdowm_list_data_details();
	}
	@And ("^check with the Select Mandal from the Dropdown list data details$")
	public void check_with_the_Select_Mandal_from_the_Dropdown_list_data_details() throws Throwable {
		SetPlantationCategory.check_with_the_Select_Mandal_from_the_Dropdown_list_data_details();
	}
	@And ("^check with the Select Villages from the Dropdown list data details$")
	public void check_with_the_Select_Villages_from_the_Dropdown_list_data_details() throws Throwable {
		SetPlantationCategory.check_with_the_Select_Villages_from_the_Dropdown_list_data_details();
	}
	@Then ("^check with the clicking on the search button results$")
	public void check_with_the_clicking_on_the_search_button_results() throws Throwable {
		SetPlantationCategory.check_with_the_clicking_on_the_search_button_results();
	}
	@When ("^click on the Add plantation category button$")
	public void click_on_the_Add_plantation_category_button() throws Throwable {
		SetPlantationCategory.click_on_the_Add_plantation_category_button();
	}
	@Then ("^check with the Comments Input details$")
	public void check_with_the_Comments_Input_details() throws Throwable {
		SetPlantationCategory.check_with_the_Comments_Input_details();
	}
	@And ("^check with the Save input details$")
	public void check_with_the_Save_input_details() throws Throwable {
		SetPlantationCategory.check_with_the_Save_input_details();
	}
	@Then ("^check with the View Plantation category Comments input details$")
	public void check_with_the_View_Plantation_category_Comments_input_details() throws Throwable {
		SetPlantationCategory.check_with_the_View_Plantation_category_Comments_input_details();
	}
}
