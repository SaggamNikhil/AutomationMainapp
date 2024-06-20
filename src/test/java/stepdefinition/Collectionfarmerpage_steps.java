package stepdefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Collectionfarmerpage;

public class Collectionfarmerpage_steps {

	Collectionfarmerpage Collectionfarmerpage = new Collectionfarmerpage();
	@Given("^User login with admin role$")
	public void User_login_with_admin_role() throws Throwable {
		Collectionfarmerpage.User_login_with_admin_role();
	}

	@Then("^Navigate to the Dashboard screen$")
	public void Navigate_to_the_Dashboard_screen() throws Throwable {
		Collectionfarmerpage.Navigate_to_the_Dashboard_screen();
	}

	@When("^click on the snapshot module name$")
	public void click_on_the_snapshot_module_name() throws Throwable {
		Collectionfarmerpage.click_on_the_snapshot_module_name();
	}
	@Then ("^Click on the Collectionfarmer screen$")
	public void Click_on_the_Collectionfarmer_screen() throws Throwable {
		Collectionfarmerpage.Click_on_the_Collectionfarmer_screen();
	}
	@When ("^the user update from date details$")
	public void the_user_update_from_date_details () throws Throwable {
		Collectionfarmerpage.the_user_update_from_date_details();
	}
    @Given ("^user click on the search button$")
    public void user_click_on_the_search_button () throws Throwable {
    	Collectionfarmerpage.user_click_on_the_search_button();
    }
    @Then ("^Select Farmer from Collectionfarmer screen$")
    public void Select_Farmer_from_Collectionfarmer_screen () throws Throwable {
    	Collectionfarmerpage.Select_Farmer_from_Collectionfarmer_screen();
    }
    @And ("^Click on the Edit button$")
    public void Click_on_the_Edit_button () throws Throwable {
    	Collectionfarmerpage.Click_on_the_Edit_button();
    }
    @Then ("^Update Farmer FirstName and Lastname$")
    public void Update_Farmer_FirstName_and_Lastname () throws Throwable {
    	Collectionfarmerpage.Update_Farmer_FirstName_and_Lastname();
    }
    @And ("^Update with Father name details$")
    public void Update_with_Father_name_details () throws Throwable {
    	Collectionfarmerpage.Update_with_Father_name_details();
    }
    @Then ("^Update with Dateofbirth$")
    public void Update_with_Dateofbirth () throws Throwable {
    	Collectionfarmerpage.Update_with_Dateofbirth();
    }
    @When ("^user update address details$")
    public void user_update_address_details () throws Throwable {
    	Collectionfarmerpage.user_update_address_details();
    }
    @And ("^Update with State District Mandal village selection$")
    public void Update_with_State_District_Mandal_village_selection() throws Throwable {
    	Collectionfarmerpage.Update_with_State_District_Mandal_village_selection();
    }
    @Given ("^user update mobile number details$")
    public void user_update_mobile_number_details () throws Throwable {
    	Collectionfarmerpage.user_update_mobile_number_details();
    }
    @Then ("^Update and select Source of contact$")
    public void Update_and_select_Source_of_contact() throws Throwable {
    	Collectionfarmerpage.Update_and_select_Source_of_contact();
    }
    @And ("^update Category option details$")
    public void update_Category_option_details() throws Throwable {
    	Collectionfarmerpage.update_Category_option_details();
    }
    @When ("^user update Annual income details$")
    public void user_update_Annual_income_details () throws Throwable {
    	Collectionfarmerpage.user_update_Annual_income_details();
    }
    @Then ("^select and modify Education details$")
    public void select_and_modify_Education_details () throws Throwable {
    	Collectionfarmerpage.select_and_modify_Education_details();
    }
    @Given ("^user update with farmer Img$")
    public void user_update_with_farmer_Img () throws Throwable {
    	Collectionfarmerpage.user_update_with_farmer_Img();
    }
    @And ("^Click on the Save button$")
    public void Click_on_the_Save_button () throws Throwable {
    	Collectionfarmerpage.Click_on_the_Save_button ();
    
    }
    @When ("^User able to update aadhar with Edit button click$")
    public void User_able_to_update_aadhar_with_Edit_button_click () throws Throwable {
    	Collectionfarmerpage.User_able_to_update_aadhar_with_Edit_button_click ();   
    	}

    @Then ("^Update Account Details grid$")
    public void Update_Account_Details_grid () throws Throwable {
    	Collectionfarmerpage.Update_Account_Details_grid();
    }
    @And ("^Click on the Updatebank button$")
    public void Click_on_the_Updatebank_button () throws Throwable {
    	Collectionfarmerpage.Click_on_the_Updatebank_button();
    }
    @When ("^user select location from the grid$")
    public void user_select_location_from_the_grid () throws Throwable {
    	Collectionfarmerpage.user_select_location_from_the_grid();
    }
    @Then ("^select State from Dropdown$")
    public void select_State_from_Dropdown () throws Throwable {
    	Collectionfarmerpage.select_State_from_Dropdown();
    }
    @And ("^Select District from the dropdown$")
    public void Select_District_from_the_dropdown() throws Throwable {
    	Collectionfarmerpage.Select_District_from_the_dropdown ();
    	}
    @Then ("^Select Mandal from the Dropdown$")
    public void Select_Mandal_from_the_Dropdown() throws Throwable {
    	Collectionfarmerpage.Select_Mandal_from_the_Dropdown ();
    }
    @Then ("^Select Village from the Dropdown$")
    public void Select_Village_from_the_Dropdown() throws Throwable {
    	Collectionfarmerpage.Select_Village_from_the_Dropdown();
    }
    @And ("^Search with From date selection$")
    public void Search_with_From_date_selection() throws Throwable {
    	Collectionfarmerpage.Search_with_From_date_selection ();
    }
    @Then ("^Click on the Search button view grid data$")
    public void Click_on_the_Search_button_view_grid_data() throws Throwable {
    	Collectionfarmerpage.Click_on_the_Search_button_view_grid_data ();
    }
    @And ("^Check with Clear button perform$")
    public void Check_with_Clear_button_perform () throws Throwable {
    	Collectionfarmerpage.Check_with_Clear_button_perform ();
    }
    
   @And ("^check with Farmer First name validations$")
    public void check_with_Farmer_First_name_validations() throws Throwable {
	   Collectionfarmerpage.check_with_Farmer_First_name_validations ();
	   }
   @And ("^Check with Farmer Last name validations$")
   public void Check_with_Farmer_Last_name_validations () throws Throwable {
	   Collectionfarmerpage.Check_with_Farmer_Last_name_validations ();
   }
   @Then ("^check with Farmer Father name validations$")
   public void check_with_Farmer_Father_name_validations () throws Throwable {
	   Collectionfarmerpage.check_with_Farmer_Father_name_validations ();
   }
   @And ("^check with Farmer age validations$")
   public void check_with_Farmer_age_validations() throws Throwable{
	   Collectionfarmerpage.check_with_Farmer_age_validations();
   }
   @And ("^check with farmer address one validations$")
   public void check_with_farmer_address_one_validations ()throws Throwable {
	   Collectionfarmerpage.check_with_farmer_address_one_validations ();
   }
   @And ("^check with farmer address two validations$")
   public void check_with_farmer_address_two_validations ()throws Throwable {
	   Collectionfarmerpage.check_with_farmer_address_two_validations ();
   }
   @Then ("^Check with the Landmark validations$")
   public void Check_with_the_Landmark_validations ()throws Throwable {
	   Collectionfarmerpage.Check_with_the_Landmark_validations ();
   }
   @And ("^Check with the State modify validations$")
   public void Check_with_the_State_modify_validations ()throws Throwable {
	   Collectionfarmerpage.Check_with_the_State_modify_validations ();
   }
   @And ("^Check with the District modify validations$")
   public void Check_with_the_District_modify_validations()throws Throwable {
	   Collectionfarmerpage.Check_with_the_District_modify_validations ();
   }
   @Then ("^Check with the Mandal modify validations$")
   public void Check_with_the_Mandal_modify_validations()throws Throwable {
	   Collectionfarmerpage.Check_with_the_Mandal_modify_validations ();
   }
   @And ("^Check with the Village modify validations$")
   public void Check_with_the_Village_modify_validations()throws Throwable {
	   Collectionfarmerpage.Check_with_the_Village_modify_validations ();
   }
   @Then ("^Check with the Mobile number Validations$")
   public void Check_with_the_Mobile_number_Validations()throws Throwable {
	   Collectionfarmerpage.Check_with_the_Mobile_number_Validations();
   }
   @And ("^check with the Source of contact validations$")
   public void check_with_the_Source_of_contact_validations()throws Throwable {
	   Collectionfarmerpage.check_with_the_Source_of_contact_validations();
   }
   @Then ("^check with the Category selection validations$")
   public void check_with_the_Category_selection_validations()throws Throwable {
	   Collectionfarmerpage.check_with_the_Category_selection_validations();
   }
   @And ("^Check with the Annual Income selection validations$")
   public void Check_with_the_Annual_Income_selection_validations() throws Throwable {
	   Collectionfarmerpage.Check_with_the_Annual_Income_selection_validations();
   }
   @And ("^check with the Education selection validations$")
   public void check_with_the_Education_selection_validations() throws Throwable {
	   Collectionfarmerpage.check_with_the_Education_selection_validations();
   }
   @Given ("^user update with farmer Img validations$")
   public void user_update_with_farmer_Img_validations() throws Throwable{
	   Collectionfarmerpage.user_update_with_farmer_Img_validations();
   }
   @And ("^check with the Save button validations$")
   public void check_with_the_Save_button_validations() throws Throwable {
	   Collectionfarmerpage.check_with_the_Save_button_validations();
   }
   @And ("^Check with the Add Identity proof validations$")
   public void Check_with_the_Add_Identity_proof_validations() throws Throwable {
	   Collectionfarmerpage.Check_with_the_Add_Identity_proof_validations();
   }
   @And ("^Check with the Identity proof name validations$")
   public void Check_with_the_Identity_proof_name_validations() throws Throwable {
	   Collectionfarmerpage.Check_with_the_Identity_proof_name_validations();
   }
   @Then ("^check with the Save form$")
   public void check_with_the_Save_form () throws Throwable{
	   Collectionfarmerpage.check_with_the_Save_form();
   }
   @And ("^Click on the Bank info validations$")
   public void Click_on_the_Bank_info_validations()throws Throwable {
	   Collectionfarmerpage.Click_on_the_Bank_info_validations();
   }
   @Then ("^check with the account number validations$")
   public void check_with_the_account_number_validations() throws Throwable {
	   Collectionfarmerpage.check_with_the_account_number_validations();
   }
   @And ("^check with the Account holder name validations$")
   public void check_with_the_Account_holder_name_validations () throws Throwable {
	   Collectionfarmerpage.check_with_the_Account_holder_name_validations ();
   }
   @And ("^check with the Ifsc code validations$")
   public void check_with_the_Ifsc_code_validations() throws Throwable {
	   Collectionfarmerpage.check_with_the_Ifsc_code_validations ();
   }
   @Then ("^check with the Bank img selection$")
   public void check_with_the_Bank_img_selection () throws Throwable {
	   Collectionfarmerpage.check_with_the_Bank_img_selection ();
   }
   @And ("^check with the update button click$")
   public void check_with_the_update_button_click () throws Throwable {
	   Collectionfarmerpage.check_with_the_update_button_click ();
   }
}
