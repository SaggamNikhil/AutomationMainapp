package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GapFilling;

public class GapFilling_Steps {
	GapFilling GapFilling = new GapFilling();
	
	@Given ("the user has entered text an{string}")
	public void the_user_has_entered_text_an(String username) throws Throwable {
		GapFilling.the_user_has_entered_text_an(username);
    }
	@And ("the user has entered1 text an{string}")
	public void the_user_has_entered1_text_an(String password) throws Throwable {
		GapFilling.the_user_has_entered1_text_an(password);
	}
	@And ("^User In the page click on the LogIn button input$")
	public void User_In_the_page_click_on_the_LogIn_button_input() throws Throwable {
		GapFilling.User_In_the_page_click_on_the_LogIn_button_input();
	}
	@Then ("^the User navigated to the dashboard of home page details$")
	public void the_User_navigated_to_the_dashboard_of_home_page_details() throws Throwable {
		GapFilling.the_User_navigated_to_the_dashboard_of_home_page_details();
	}
	@And ("^check with the click on the Activities Menu screen$")
	public void check_with_the_click_on_the_Activities_Menu_screen() throws Throwable {
		GapFilling.check_with_the_click_on_the_Activities_Menu_screen();
	}
	@Then ("^check with the Click on the Gapfilling menu screen$")
	public void check_with_the_Click_on_the_Gapfilling_menu_screen() throws Throwable {
		GapFilling.check_with_the_Click_on_the_Gapfilling_menu_screen();
	}
	@Then ("^check with the From Date selection input details$")
	public void check_with_the_From_Date_selection_input_details() throws Throwable {
		GapFilling.check_with_the_From_Date_selection_input_details();
	}
	@When ("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		GapFilling.click_on_the_search_button();
	}
	@And ("^check with the navigated to the Initiate gap filling screen$")
	public void check_with_the_navigated_to_the_Initiate_gap_filling_screen() throws Throwable {
		GapFilling.check_with_the_navigated_to_the_Initiate_gap_filling_screen();
	}
	@Then ("^check with the Search farmer from the Initiate gap filling screen$")
	public void check_with_the_Search_farmer_from_the_Initiate_gap_filling_screen() throws Throwable {
		GapFilling.check_with_the_Search_farmer_from_the_Initiate_gap_filling_screen();
	}
	@And ("^check with the Auto search farmer using keywords details$")
	public void check_with_the_Auto_search_farmer_using_keywords_details() throws Throwable {
		GapFilling.check_with_the_Auto_search_farmer_using_keywords_details();
	}
	@And ("^check with the Imported Saplings To be Issued input field details$")
	public void check_with_the_Imported_Saplings_To_be_Issued_input_field_details() throws Throwable {
		GapFilling.check_with_the_Imported_Saplings_To_be_Issued_input_field_details();
	}
	@And ("^check with the Indigenous Saplings To be Issued input field details$")
	public void check_with_the_Indigenous_Saplings_To_be_Issued_input_field_details() throws Throwable {
		GapFilling.check_with_the_Indigenous_Saplings_To_be_Issued_input_field_details();
	}
	@Then ("^check with the Exp Date of Pickup input details validations$")
	public void check_with_the_Exp_Date_of_Pickup_input_details_validations() throws Throwable {
		GapFilling.check_with_the_Exp_Date_of_Pickup_input_details_validations();
	}
	@And ("^check with the Gap filling Reason Details update$")
	public void check_with_the_Gap_filling_Reason_Details_update() throws Throwable {
		GapFilling.check_with_the_Gap_filling_Reason_Details_update();
	}
	@Then ("^check with the Upload file input details$")
	public void check_with_the_Upload_file_input_details() throws Throwable {
		GapFilling.check_with_the_Upload_file_input_details();
	}
	@And ("^check with the Save details from the Initiate gap filling$")
	public void check_with_the_Save_details_from_the_Initiate_gap_filling() throws Throwable {
		GapFilling.check_with_the_Save_details_from_the_Initiate_gap_filling();
	}
	@Then ("^check with the Gap filling screen by Cluster manager Approvals$")
	public void check_with_the_Gap_filling_screen_by_Cluster_manager_Approvals() throws Throwable {
		GapFilling.check_with_the_Gap_filling_screen_by_Cluster_manager_Approvals();
	}
	@And ("^check with the Gap filling screen by State head manager Approvals$")
	public void check_with_the_Gap_filling_screen_by_State_head_manager_Approvals() throws Throwable {
		GapFilling.check_with_the_Gap_filling_screen_by_State_head_manager_Approvals();
	}
	@Then ("^check with the Add gap filling advance details$")
	public void check_with_the_Add_gap_filling_advance_details() throws Throwable {
		GapFilling.check_with_the_Add_gap_filling_advance_details();
	}
	@And ("^check with the Mode of Payement selection details$")
	public void check_with_the_Mode_of_Payement_selection_details() throws Throwable {
		GapFilling.check_with_the_Mode_of_Payement_selection_details();
	}
	@And ("^check with the No of imp saplings Amount Received for$")
	public void check_with_the_No_of_imp_saplings_Amount_Received_for() throws Throwable {
		GapFilling.check_with_the_No_of_imp_saplings_Amount_Received_for();
	}
	@And ("^check with the No of Indi saplings Amount received for$")
	public void check_with_the_No_of_Indi_saplings_Amount_received_for() throws Throwable {
		GapFilling.check_with_the_No_of_Indi_saplings_Amount_received_for();
	}
	@Then ("^check with the Add Print button click$")
	public void check_with_the_Add_Print_button_click() throws Throwable {
		GapFilling.check_with_the_Add_Print_button_click();
	}
    @When ("^click on the Advance state head approval$")
    public void click_on_the_Advance_state_head_approval() throws Throwable {
    	GapFilling.click_on_the_Advance_state_head_approval();
    }
    @Then ("^check with the Add gap filling Nursery details$")
    public void check_with_the_Add_gap_filling_Nursery_details() throws Throwable {
    	GapFilling.check_with_the_Add_gap_filling_Nursery_details();
    }
    @And ("^check with the Advance receipt number selection details$")
    public void check_with_the_Advance_receipt_number_selection_details() throws Throwable {
    	GapFilling.check_with_the_Advance_receipt_number_selection_details();
    }
    @And ("^check with the Variety option selection details$")
    public void check_with_the_Variety_option_selection_details() throws Throwable {
    	GapFilling.check_with_the_Variety_option_selection_details();
    }
    @And ("^check with the vendor option selection details$")
    public void check_with_the_vendor_option_selection_details() throws Throwable {
    	GapFilling.check_with_the_vendor_option_selection_details();
    }
    @And ("^check with the Imported saplings Issues Ip$")
    public void check_with_the_Imported_saplings_Issues_Ip() throws Throwable {
    	GapFilling.check_with_the_Imported_saplings_Issues_Ip();
    }
    @And ("^check with the Save imp details$")
    public void check_with_the_Save_imp_details() throws Throwable {
    	GapFilling.check_with_the_Save_imp_details();
    }
}
