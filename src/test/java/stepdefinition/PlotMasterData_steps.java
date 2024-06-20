package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PlotMasterData;

public class PlotMasterData_steps {
	
	PlotMasterData PlotMasterData = new PlotMasterData();
	
	@Given ("^First login page with Respective user role$")
	public void First_login_page_with_Respective_user_role() throws Throwable{
	    PlotMasterData.First_login_page_with_Respective_user_role();
	}
	@Then ("^Navigate to the Dashboard page screen$")
	public void Navigate_to_the_Dashboard_page_screen() throws Throwable{
		PlotMasterData.Navigate_to_the_Dashboard_page_screen();
	}
    @And ("^the user click on the snapshot module screen$")
    public void the_user_click_on_the_snapshot_module_screen() throws Throwable {
    	PlotMasterData.the_user_click_on_the_snapshot_module_screen();
    }
    @And ("^Click on the PlotMasterData screen$")
    public void Click_on_the_PlotMasterData_screen() throws Throwable {
    	PlotMasterData.Click_on_the_PlotMasterData_screen();
    }
    @Then ("^check with the Selection location Dropdown$")
    public void check_with_the_Selection_location_Dropdown() throws Throwable {
    	PlotMasterData.check_with_the_Selection_location_Dropdown();
    }
    @And ("^Check with the Selection State dropdown$")
    public void Check_with_the_Selection_State_dropdown() throws Throwable{
    	PlotMasterData.Check_with_the_Selection_State_dropdown();
    }
    @And ("^check with the District selection validations$")
    public void check_with_the_District_selection_validations() throws Throwable {
    	PlotMasterData.check_with_the_District_selection_validations();
    }
    @And ("^check with the Mandal selection validations$")
    public void check_with_the_Mandal_selection_validations() throws Throwable {
    	PlotMasterData.check_with_the_Mandal_selection_validations();
    }
    @And ("^Check with the Village selection Validations$")
    public void Check_with_the_Village_selection_Validations()throws Throwable {
    	PlotMasterData.Check_with_the_Village_selection_Validations();
    }
    @Then ("^check with the Plot status validations$")
    public void check_with_the_Plot_status_validations() throws Throwable {
    	PlotMasterData.check_with_the_Plot_status_validations();
    }
    @And ("^check with the FromDate selection Validations$")
    public void check_with_the_FromDate_selection_Validations() throws Throwable{
    	PlotMasterData.check_with_the_FromDate_selection_Validations();
    }
    @And ("^check with the Search button click value$")
    public void check_with_the_Search_button_click_value()throws Throwable {
    	PlotMasterData.check_with_the_Search_button_click_value();
    }
    @Then ("^check with the Select Farmer from plotmasterdata screen$")
    public void check_with_the_Select_Farmer_from_plotmasterdata_screen() throws Throwable {
    	PlotMasterData.check_with_the_Select_Farmer_from_plotmasterdata_screen();
    }
    @And ("^check with Farmer details screen Edit button action$")
    public void check_with_Farmer_details_screen_Edit_button_action() throws Throwable {
    	PlotMasterData.check_with_Farmer_details_screen_Edit_button_action();
    }
    @And ("^check with the farmer firstname update validations$")
    public void check_with_the_farmer_firstname_update_validations() throws Throwable {
    	PlotMasterData.check_with_the_farmer_firstname_update_validations();
    }
    @And ("^check with the farmer Lastname update validations$")
    public void check_with_the_farmer_Lastname_update_validations() throws Throwable {
    	PlotMasterData.check_with_the_farmer_Lastname_update_validations();
    	
    }
    @And ("^check with the farmer fathername input validations$")
    public void check_with_the_farmer_fathername_input_validations() throws Throwable {
    	PlotMasterData.check_with_the_farmer_fathername_input_validations();
    	
    }
    @And ("^check with the Dateof birth input validations$")
    public void check_with_the_Dateof_birth_input_validations() throws Throwable {
    	PlotMasterData.check_with_the_Dateof_birth_input_validations();
    }
    @And ("^check with the Address one input validations$")
    public void check_with_the_Address_one_input_validations() throws Throwable {
    	PlotMasterData.check_with_the_Address_one_input_validations();
    }
    @And ("^check with the Address two input validations$")
    public void check_with_the_Address_two_input_validations() throws Throwable {
    	PlotMasterData.check_with_the_Address_two_input_validations();
    }
    @Then ("^Check with the State selection update validations$")
    public void Check_with_the_State_selection_update_validations() throws Throwable{
    	PlotMasterData.Check_with_the_State_selection_update_validations();
    }
    @And ("^check with the District Selection update validations$")
    public void check_with_the_District_Selection_update_validations() throws Throwable{
    	PlotMasterData.check_with_the_District_Selection_update_validations();
    }
    @And ("^check with the Mandal selection update validations$")
    public void check_with_the_Mandal_selection_update_validations() throws Throwable {
    	PlotMasterData.check_with_the_Mandal_selection_update_validations();
    }
    @And ("^check with the Villages selection update validations$")
    public void check_with_the_Villages_selection_update_validations() throws Throwable{
    	PlotMasterData.check_with_the_Villages_selection_update_validations();
    }
    @And ("^check with the Mobile number update validations$")
    public void check_with_the_Mobile_number_update_validations() throws Throwable {
    	PlotMasterData.check_with_the_Mobile_number_update_validations();
    }
    @And ("^check with the updated farmer image$")
    public void check_with_the_updated_farmer_image() throws Throwable {
    	PlotMasterData.check_with_the_updated_farmer_image();
    }
    @And ("^check with click on the save button$")
    public void check_with_click_on_the_save_button() throws Throwable {
    	PlotMasterData.check_with_click_on_the_save_button();
    }
    @Then ("^check with the Identity proof update validations$")
    public void check_with_the_Identity_proof_update_validations() throws Throwable {
    	PlotMasterData.check_with_the_Identity_proof_update_validations();
    }
    @And ("^check with Bank proof Update validations$")
    public void check_with_Bank_proof_Update_validations() throws Throwable {
    	PlotMasterData.check_with_Bank_proof_Update_validations();
    }
    @And ("^check with the Account num update validations$")
    public void check_with_the_Account_num_update_validations() throws Throwable {
    	PlotMasterData.check_with_the_Account_num_update_validations();
    }
    @And ("^check with the Account name update validations$")
    public void check_with_the_Account_name_update_validations() throws Throwable {
    	PlotMasterData.check_with_the_Account_name_update_validations();
    }
    @And ("^check with the Ifsc code field update$")
    public void check_with_the_Ifsc_code_field_update() throws Throwable {
    	PlotMasterData.check_with_the_Ifsc_code_field_update();
    }
    @And ("^check with the Upload Image$")
    public void check_with_the_Upload_Image() throws Throwable {
    	PlotMasterData.check_with_the_Upload_Image();
    }
    @Then ("^check with the Bank Update button$")
    public void check_with_the_Bank_Update_button() throws Throwable {
    	PlotMasterData.check_with_the_Bank_Update_button();
    }
    @And ("^check with the Plot details expansion$")
    public void check_with_the_Plot_details_expansion() throws Throwable {
    	PlotMasterData.check_with_the_Plot_details_expansion();
    	
    }
}
