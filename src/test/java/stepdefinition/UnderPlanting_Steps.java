package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.UnderPlanting;

public class UnderPlanting_Steps {
	UnderPlanting UnderPlanting =new UnderPlanting();
	
	@Given ("the user has entered a{string}")
	public void the_user_has_entered_a(String username) throws Throwable {
		UnderPlanting.the_user_has_entered_a(username);
		}
	@And ("the user has entered1 a{string}")
	public void the_user_has_entered1_a(String password) throws Throwable  {
		UnderPlanting.the_user_has_entered1_a(password);
		
	}
    @And ("^User click on the LogIn button$")
    public void User_click_on_the_LogIn_button() throws Throwable{
    	UnderPlanting.User_click_on_the_LogIn_button();
    }
    @Then ("^the User navigated to the home page$")
    public void the_User_navigated_to_the_home_page() throws Throwable {
    	UnderPlanting.the_User_navigated_to_the_home_page();
    }
    @Then ("^click on the dashoboard menu as Activities$")
    public void click_on_the_dashoboard_menu_as_Activities() throws Throwable {
    	UnderPlanting.click_on_the_dashoboard_menu_as_Activities();
    }
    @And ("^click on the Underplanting menu screen$")
    public void click_on_the_Underplanting_menu_screen() throws Throwable {
    	UnderPlanting.click_on_the_Underplanting_menu_screen();
    }
    @Then ("^check with the Select location type wise details$")
    public void check_with_the_Select_location_type_wise_details() throws Throwable {
    	UnderPlanting.check_with_the_Select_location_type_wise_details();
    }
    @And ("^check with the Select State selection wise details$")
    public void check_with_the_Select_State_selection_wise_details() throws Throwable {
    	UnderPlanting.check_with_the_Select_State_selection_wise_details();
    }
    @And ("^check with the Select District wise details$")
    public void check_with_the_Select_District_wise_details() throws Throwable {
    	UnderPlanting.check_with_the_Select_District_wise_details();
    }
    @And ("^check with the Select Mandal wise details$")
    public void check_with_the_Select_Mandal_wise_details() throws Throwable {
    	UnderPlanting.check_with_the_Select_Mandal_wise_details();
    }
    @And ("^check with the Select Villages wise details$")
    public void check_with_the_Select_Villages_wise_details() throws Throwable {
    	UnderPlanting.check_with_the_Select_Villages_wise_details();
    }
    @Then ("^check with the From date selection validations details$")
    public void check_with_the_From_date_selection_validations_details() throws Throwable {
    	UnderPlanting.check_with_the_From_date_selection_validations_details();
    }
    @Then ("^check with the Click on the search button from the Underplanting screen$")
    public void check_with_the_Click_on_the_search_button_from_the_Underplanting_screen() throws Throwable {
    	UnderPlanting.check_with_the_Click_on_the_search_button_from_the_Underplanting_screen();
    }
    @And ("^check with the Click on the Initiate Underplanting action button$")
    public void check_with_the_Click_on_the_Initiate_Underplanting_action_button() throws Throwable {
    	UnderPlanting.check_with_the_Click_on_the_Initiate_Underplanting_action_button();
    }
    @Then ("^Check with the Select Farmer search input details$")
    public void Check_with_the_Select_Farmer_search_input_details() throws Throwable {
    	UnderPlanting.Check_with_the_Select_Farmer_search_input_details();
    }
    @And ("^check with the Select plot from the underplanting screen$")
    public void check_with_the_Select_plot_from_the_underplanting_screen() throws Throwable {
    	UnderPlanting.check_with_the_Select_plot_from_the_underplanting_screen();
    }
    @Then ("^check with the plot details by Total Plot area ip details$")
    public void check_with_the_plot_details_by_Total_Plot_area_ip_details() throws Throwable {
    	UnderPlanting.check_with_the_plot_details_by_Total_Plot_area_ip_details();
    }
    @And ("^check with the Plot details by Total Plam area ip details$")
    public void check_with_the_Plot_details_by_Total_Plam_area_ip_details() throws Throwable {
    	UnderPlanting.check_with_the_Plot_details_by_Total_Plam_area_ip_details();
    }
    @Then ("^check with the Expected month of Underplanting tress Date selection$")
    public void check_with_the_Expected_month_of_Underplanting_tress_Date_selection() throws Throwable {
    	UnderPlanting.check_with_the_Expected_month_of_Underplanting_tress_Date_selection();
    }
    @And ("^check with the Address one input details$")
    public void check_with_the_Address_one_input_details() throws Throwable {
    	UnderPlanting.check_with_the_Address_one_input_details();
    }
    @Then ("^check with the Landmark field input details$")
    public void check_with_the_Landmark_field_input_details() throws Throwable {
    	UnderPlanting.check_with_the_Landmark_field_input_details();
    }
    @And ("^check with the file upload application for underplanting$")
    public void check_with_the_file_upload_application_for_underplanting() throws Throwable {
    	UnderPlanting.check_with_the_file_upload_application_for_underplanting();
    }
    @Then ("^check with the Underplanting reason dropdown selection$")
    public void check_with_the_Underplanting_reason_dropdown_selection() throws Throwable {
    	UnderPlanting.check_with_the_Underplanting_reason_dropdown_selection();
    }
    @And ("^check with the Approx height of current tress details$")
    public void check_with_the_Approx_height_of_current_tress_details() throws Throwable {
    	UnderPlanting.check_with_the_Approx_height_of_current_tress_details();
    }
    @And ("^check with the Harvesting method dropdown selection details$")
    public void check_with_the_Harvesting_method_dropdown_selection_details() throws Throwable {
    	UnderPlanting.check_with_the_Harvesting_method_dropdown_selection_details();
    }
    @And ("^check with the Plan for uprooting current plantation details$")
    public void check_with_the_Plan_for_uprooting_current_plantation_details() throws Throwable {
    	UnderPlanting.check_with_the_Plan_for_uprooting_current_plantation_details();
    }
    @And ("^Check with the Clicking on the Save butoon details$")
    public void Check_with_the_Clicking_on_the_Save_butoon_details() throws Throwable {
    	UnderPlanting.Check_with_the_Clicking_on_the_Save_butoon_details();
    }
}