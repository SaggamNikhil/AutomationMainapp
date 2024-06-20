package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Collectionfarmerpage extends DriverFactory {
	Utilities utilities     = new Utilities();
	By username             = By.xpath("//input[@type='text']");
	By password             = By.xpath("//input[@type='password']");
	By Login                = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar              = By.xpath("//a[@class='sidebar-toggle']");
	By snapshot             = By.xpath("//span[text()='Snapshot']");
	By CollectionFarmer     = By.xpath("//li[@class='ng-scope']/./a[@href='#/collectionFarmerMaster']");
	By Fromdate_select      = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]"); 
	By Search_Click         = By.xpath("(//button[@class='btn btn-sm btn-theme'])[1]");
	By Select_Farmer        = By.xpath("(//tr[@class='ng-scope']/td[@ng-click='showFarmerDetails(row, $event)'])[1]");
	By Edit_Farmer          = By.xpath("(//button[@class='btn btn-sm btn-theme'])[2]");
	By First_name_update    = By.xpath("//input[@name='FarmerFirstName']");
	By Last_name_update     = By.xpath("//input[@name='FarmerLastName']");
	By Father_name_update   = By.xpath("//input[@name='GuardianName']");
	By Date_of_birth_update = By.xpath("//button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple']");
	By year_selection       = By.xpath("(//md-icon[@class='ng-scope'])[8]");
	By month_selection      = By.xpath("//td[@aria-label='May 2002']");
	By Date_update          = By.xpath("//td[@aria-label='Friday May 3 2002']");
	By Address1             = By.xpath("//input[@ng-model='farmerEdit.AddressLine1']");
	By Address2             = By.xpath("//input[@ng-model='farmerEdit.AddressLine2']");
	By Landmark             = By.xpath("//input[@ng-model='farmerEdit.Landmark']");
	By State_selection      = By.xpath("//input[@id='fl-input-22']");
	By DropDown_select      = By.xpath("(//li[@ng-click='$mdAutocompleteCtrl.select($index)'])[1]");
	By District             = By.xpath("//input[@id='fl-input-23']");
	By District_select      = By.xpath("//span[text()='West Godavari - WG']");
	By Mandal               = By.xpath("//input[@id='fl-input-24']");
	By Mandal_Select        = By.xpath("//span[text()='Tadepalligudem - TP']");
	By Village              = By.xpath("//input[@id='fl-input-25']");
	By Village_select       = By.xpath("//span[text()='Amruthapuram - AM']");
	By Mobile_no            = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Sourceof_Contact     = By.xpath("//md-select-value[@id='select_value_label_5']");
	By Change_source_opt    = By.xpath("//md-option[@id='select_option_43']");
	By category             = By.xpath("//md-select[@ng-model='farmerEdit.CategoryTypeId']");
	By Change_category      = By.xpath("//md-option[@id='select_option_46']");
	By Annual_Income        = By.xpath("//md-select[@ng-model='farmerEdit.AnnualIncomeTypeId']");
	By Modify_Ann_inc       = By.xpath("//md-option[@id='select_option_55']");
	By Education            = By.xpath("//md-select[@ng-model='farmerEdit.EducationTypeId']");
	By Education_opt_chg    = By.xpath("//md-option[@id='select_option_58']");
	By Farmer_src           = By.xpath("//input[@id='fileInputFarmer']");
	By Save_Click           = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Aadhar_edit          = By.xpath("//button[@ng-click ='editIdentityProof(row)']");
	By Click_event          = By.xpath("//md-input-container[@class='ng-scope md-input-has-value']");
	By Enter_aadharinput    = By.xpath("(//input[@ng-model='rowEdit.IdProofNumber'])[2]");
	By update_aadhar        = By.xpath("//button[@class='btn btn-success btn-xs ng-scope']");
	
	By Update_bank          = By.xpath("//button[@ng-click='editFarmerBank()']");
	By Enter_accountnum     = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Update_accountname   = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Ifsc_code            = By.xpath("//input[@name='IFSCcode']");
	By Select_Ifsc		    = By.xpath("(//span[@class='ng-binding'])[6]");
	By Bank_src             = By.xpath("//input[@id='fileInput']");
	By updateby_bank        = By.xpath("//button[@ng-click='updateFarmerBank(BankRequest)']");
	By Grid_select_Loc      = By.xpath("(//div[text()='GeoLocations'])[1]");
	By Side_clk_mouse_over  = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By State_select         = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Option_sel			= By.xpath("//div[text()='Andhra Pradesh - AP']");
	By Side_clk_mouse_o     = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By District_sele        = By.xpath("//md-select[@ng-model='GeoLocation.DistrictIds']");
	By option_sel_dis       = By.xpath("(//md-option[@ng-repeat='district in districts'])[3]");
	By Side_clk_mouse       = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By Mandal_sel           = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By option_selec         = By.xpath("//div[text()='RAJAHMUNDRY - RJ']");
	By Side_clk_m           = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
    By Village_selec        = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_sel_opt      = By.xpath("//div[text()='Bommuru - BU']");
	By Side_clk             = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By Fromdate_sel         = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By Search_Cli           = By.xpath("(//button[@class='btn btn-sm btn-theme'])[1]");
	By clear_cli            = By.xpath("//button[@ng-click='clear()']");
	By Farmer_first_valid   = By.xpath("//input[@ng-model='farmerEdit.FirstName']");
	By Farmer_Last_valid    = By.xpath("//input[@ng-model='farmerEdit.LastName']");
    By farmer_lastname_alt  = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']//div"); 
	By Farmer_Father_valid  = By.xpath("//input[@ng-model='farmerEdit.GuardianName']");
	By farmer_father_alt    = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']//div");
	By farmer_age_valid     = By.xpath("//input[@name='Age']");
	By farmer_age_alert     = By.xpath("//div[@ng-messages='farmerForm.Age.$error']//div");
	By farmer_address_one   = By.xpath("//input[@ng-model='farmerEdit.AddressLine1']");
	By farmer_add_one_alt   = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']//div");
	By farmer_add_two       = By.xpath("//input[@ng-model='farmerEdit.AddressLine2']");
	By farmer_add_two_alt   = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
	By Landmark_click_val   = By.xpath("//input[@ng-model='farmerEdit.Landmark']");
	By State_changes_val	= By.xpath("//input[@aria-label='State Name *']");
	By State_chg_validation = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
	By State_option_modify  = By.xpath("//span[text()='Andhra Pradesh - AP']");
	By District_sel_val     = By.xpath("//input[@id ='fl-input-23']");
	By District_opt_valid   = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
	By District_opt_modify  = By.xpath("//span[text()='EAST GODAVARI - EG']");	
	By Mandal_sel_val       = By.xpath("//input[@name='MandalName']");
	By Mandal_opt_valid     = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
	By Mandal_opt_modify    = By.xpath("//span[text()='Devarapalli-II - DA']");
	By village_sel_val      = By.xpath("//input[@name='VillageName']");
	By village_opt_valid    = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
	By village_opt_modify   = By.xpath("//span[text()='Krishnampalem - KP']");
	By Mobile_numb_val      = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
    By Mobile_valid_chk     = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
    By Source_of_con_click  = By.xpath("//md-select[@ng-model='farmerEdit.SourceOfContactTypeId']");
    By Modify_source        = By.xpath("//div[text()='Farmer Reference']");
    By Category_check       = By.xpath("//md-select[@ng-model='farmerEdit.CategoryTypeId']");
    By Category_modify_cli  = By.xpath("//div[text()='BC']");
    By Annual_inc_check     = By.xpath("//md-select[@ng-model='farmerEdit.AnnualIncomeTypeId']");
    By Modify_ann_inc       = By.xpath("//div[text()='5,00,001 -10,00,000']");
    By Education_val_chk    = By.xpath("//md-select[@ng-model='farmerEdit.EducationTypeId']");
    By Edc_val_modify       = By.xpath("//div[text()='Post Graduate']");
    By Identity_click       = By.xpath("//button[@ng-click='addNewIdentityProof()']");
    By click_edit_identity  = By.xpath("//button[@ng-click='editIdentityProof(row)']");
    By Identity_name_clic   = By.xpath("(//input[@name='Name'])[2]");
    By modify_proof_opt     = By.xpath("//span[text()='Driving License']");
    By drive_lic_number     = By.xpath("(//input[@ng-model='rowEdit.IdProofNumber'])[2]");
    By drive_lic_alert      = By.xpath("(//div[@ng-messages='rowForm.IdProofNumber.$error'])[2]");
    By Update_proof_num     = By.xpath("//button[@ng-click='updateIdentityProof(rowEdit,rowForm)']");
    By Bank_info_edit       = By.xpath("//button[@ng-click='editFarmerBank()']");
    By Account_no_cli       = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
    By Acc_no_valid_alert   = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']");
    By Account_name_valid   = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
    By Account_name_alert   = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
    By Ifsc_code_value      = By.xpath("//input[@name='IFSCcode']");
    By ifsc_code_alert      = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']");
    By Change_ifsc_val      = By.xpath("//span[text()='SBIN0011663']");
    By Bank_upload_i        = By.xpath("//input[@id='fileInput']");
    By Click_update_bank    = By.xpath("//button[@ng-disabled='editBankForm.$invalid||!IsValid()']");
    
	
	public void User_login_with_admin_role() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);

	}
	public void Navigate_to_the_Dashboard_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MinimumWait(driver);
	}

	public void click_on_the_snapshot_module_name() throws Throwable {
		utilities.webDriverWait(driver, snapshot);
		driver.findElement(snapshot).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Collectionfarmer_screen() throws Throwable {
		utilities.webDriverWait(driver, CollectionFarmer);
		driver.findElement(CollectionFarmer).click();
		utilities.MinimumWait(driver);
	}
	public void the_user_update_from_date_details() throws Throwable {
		utilities.webDriverWait(driver, Fromdate_select);
		driver.findElement(Fromdate_select).clear();
		driver.findElement(Fromdate_select).sendKeys("01/10/2023");
		utilities.MinimumWait(driver);
		
	}
	public void user_click_on_the_search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_Click);
		driver.findElement(Search_Click).click();
		utilities.MinimumWait(driver);
		
	}
	public void Select_Farmer_from_Collectionfarmer_screen() throws Throwable {
		utilities.webDriverWait(driver, Select_Farmer);
		driver.findElement(Select_Farmer).click();
		utilities.MaximumWait(driver);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				utilities.MediumWait(driver);
			}
		}
		
	}
	public void Click_on_the_Edit_button() throws Throwable {
		utilities.webDriverWait(driver, Edit_Farmer);
		driver.findElement(Edit_Farmer).click();
		utilities.MinimumWait(driver);
	}
	public void Update_Farmer_FirstName_and_Lastname() throws Throwable {
		utilities.webDriverWait(driver, First_name_update);
		driver.findElement(First_name_update).clear();
		driver.findElement(First_name_update).sendKeys("Collection Farmer");
		utilities.MinimumWait(driver);
		driver.findElement(Last_name_update).clear();
		driver.findElement(Last_name_update).sendKeys("One update");
		utilities.MinimumWait(driver);
	}
	public void Update_with_Father_name_details() throws Throwable {
		utilities.webDriverWait(driver, Father_name_update);
		driver.findElement(Father_name_update).clear();
		driver.findElement(Father_name_update).sendKeys("Father of Dev");
		utilities.MinimumWait(driver);
	}
	public void Update_with_Dateofbirth() throws Throwable {
		utilities.webDriverWait(driver, Date_of_birth_update);
		driver.findElement(Date_of_birth_update).click();
		utilities.MaximumWait(driver);	
		driver.findElement(year_selection).click();
		utilities.MinimumWait(driver);	
		driver.findElement(month_selection).click();
		utilities.MinimumWait(driver);	
		driver.findElement(Date_update).click();
		utilities.MinimumWait(driver);

	}
	public void user_update_address_details() throws Throwable {
		utilities.webDriverWait(driver, Address1);
		driver.findElement(Address1).clear();
		driver.findElement(Address1).sendKeys("Street Number 1");
		utilities.MinimumWait(driver);
		driver.findElement(Address2).clear();
		driver.findElement(Address2).sendKeys("Street Number 2");
		utilities.MinimumWait(driver);
		driver.findElement(Landmark).clear();
		driver.findElement(Landmark).sendKeys("Street Number 3");
	}
	public void Update_with_State_District_Mandal_village_selection() throws Throwable {
		utilities.webDriverWait(driver, State_selection);
		driver.findElement(State_selection).clear();
		driver.findElement(State_selection).click();
		driver.findElement(DropDown_select).click();
		utilities.MaximumWait(driver);
		driver.findElement(District).clear();
		driver.findElement(District).click();
		driver.findElement(District_select).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal).clear();
		driver.findElement(Mandal).click();
		driver.findElement(Mandal_Select).click();
		utilities.MaximumWait(driver);
		driver.findElement(Village).clear();
		driver.findElement(Village).click();
		driver.findElement(Village_select).click();
		utilities.MaximumWait(driver);
		
	}
	public void user_update_mobile_number_details() throws Throwable {
		utilities.webDriverWait(driver, Mobile_no);
		driver.findElement(Mobile_no).clear();
		driver.findElement(Mobile_no).sendKeys("5852333339");
		utilities.MaximumWait(driver);
		
	}
	public void Update_and_select_Source_of_contact() throws Throwable {
		utilities.webDriverWait(driver, Sourceof_Contact);
		driver.findElement(Sourceof_Contact).click();
		driver.findElement(Change_source_opt).click();
		utilities.MaximumWait(driver);
		
	}
	public void update_Category_option_details() throws Throwable {
		utilities.webDriverWait(driver, category);
		driver.findElement(category).click();
		driver.findElement(Change_category).click();
		utilities.MaximumWait(driver);
		
	}
	public void user_update_Annual_income_details() throws Throwable {
		utilities.webDriverWait(driver, Annual_Income);
		driver.findElement(Annual_Income).click();
		driver.findElement(Modify_Ann_inc).click();
		
	}
	public void select_and_modify_Education_details() throws Throwable {
		utilities.webDriverWait(driver, Education);
		driver.findElement(Education).click();
		driver.findElement(Education_opt_chg).click();
		utilities.MaximumWait(driver);
		
	}
	public void user_update_with_farmer_Img() throws Throwable {
		utilities.webDriverWait(driver, Farmer_src);
		driver.findElement(Farmer_src).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);
		
	}
	public void Click_on_the_Save_button() throws Throwable {
		utilities.webDriverWait(driver, Save_Click);
		driver.findElement(Save_Click).click();
		utilities.MaximumWait(driver);
		
	}
	public void User_able_to_update_aadhar_with_Edit_button_click() throws Throwable {
		utilities.webDriverWait(driver, Aadhar_edit);
		driver.findElement(Aadhar_edit).click();
		driver.findElement(Click_event).click();
		utilities.MinimumWait(driver);
		driver.findElement(Enter_aadharinput).clear();
		driver.findElement(Enter_aadharinput).click();
		driver.findElement(Enter_aadharinput).sendKeys("133666333999");
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, update_aadhar);
		driver.findElement(update_aadhar).click();
		utilities.MaximumWait(driver);
		
	}
	public void Update_Account_Details_grid() throws Throwable {
		utilities.webDriverWait(driver, Update_bank);
		driver.findElement(Update_bank).click();
		utilities.MaximumWait(driver);
		driver.findElement(Enter_accountnum).clear();
		driver.findElement(Enter_accountnum).sendKeys("0334443339999");
		utilities.MaximumWait(driver);
		driver.findElement(Update_accountname).clear();
		driver.findElement(Update_accountname).sendKeys("Updated Userthree");
		utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code).clear();
		driver.findElement(Ifsc_code).click();
		driver.findElement(Select_Ifsc).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Bank_src);
		driver.findElement(Bank_src).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);
		
	}
	public void Click_on_the_Updatebank_button() throws Throwable {
		utilities.webDriverWait(driver, updateby_bank );
		driver.findElement(updateby_bank).click();
		utilities.MaximumWait(driver);
		String child = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
		    if (!window.equals(child)) {
		        driver.switchTo().window(window);
		        // Perform actions on the child window
		        utilities.MediumWait(driver); // Assuming this is a custom wait function
		        //driver.close(); // Close the child window
		    }
		}
		// Switch back to the parent window and close it
		driver.switchTo().window(child);


			}
	public void user_select_location_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, Grid_select_Loc );
		driver.findElement(Grid_select_Loc).click();
		utilities.MaximumWait(driver);
		driver.findElement(Side_clk_mouse_over).click();
		utilities.MaximumWait(driver);
	}
	public void select_State_from_Dropdown() throws Throwable {
		utilities.webDriverWait(driver, State_select );
		driver.findElement(State_select).click();
		utilities.MaximumWait(driver);
		driver.findElement(Option_sel).click();
		driver.findElement(Side_clk_mouse_o).click();
		utilities.MaximumWait(driver);
		
	}
	public void Select_District_from_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, District_sele );
		driver.findElement(District_sele).click();
		utilities.MaximumWait(driver);
		driver.findElement(option_sel_dis).click();
		utilities.MaximumWait(driver);
		driver.findElement(Side_clk_mouse).click();
	
		
	}
	public void Select_Mandal_from_the_Dropdown() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel );
		driver.findElement(Mandal_sel).click();
		utilities.MaximumWait(driver);
		driver.findElement(option_selec).click();
		driver.findElement(Side_clk_m).click();
		utilities.MaximumWait(driver);

		
		
	}
	public void Select_Village_from_the_Dropdown() throws Throwable {
		utilities.webDriverWait(driver, Village_selec );
		driver.findElement(Village_selec).click();
		utilities.MaximumWait(driver);
		driver.findElement(Village_sel_opt).click();
		driver.findElement(Side_clk).click();
		utilities.MaximumWait(driver);
		
	}
	public void Search_with_From_date_selection() throws Throwable {
		utilities.webDriverWait(driver, Fromdate_sel);
		driver.findElement(Fromdate_sel).clear();
		driver.findElement(Fromdate_sel).sendKeys("01/10/2023");
		utilities.MinimumWait(driver);
		
	}
	public void Click_on_the_Search_button_view_grid_data() throws Throwable {
		utilities.webDriverWait(driver, Search_Cli);
		driver.findElement(Search_Cli).click();
		utilities.MaximumWait(driver);
		
	}
	public void Check_with_Clear_button_perform() throws Throwable {
		utilities.webDriverWait(driver, clear_cli);
		driver.findElement(clear_cli).click();
		utilities.MaximumWait(driver);
		
	}
	public void check_with_Farmer_First_name_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_first_valid);
		driver.findElement(Farmer_first_valid).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Farmer_first_valid).sendKeys("Farmer !@#");
		utilities.MaximumWait(driver);
	}
	public void Check_with_Farmer_Last_name_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_Last_valid);
		driver.findElement(Farmer_Last_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(farmer_lastname_alt);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(Farmer_Last_valid).sendKeys("Padddy user !@#");
		utilities.MaximumWait(driver);
	}
	public void check_with_Farmer_Father_name_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_Father_valid);
		driver.findElement(Farmer_Father_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(farmer_father_alt);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
    	driver.findElement(Farmer_Father_valid).sendKeys("Narayana !@");
		utilities.MaximumWait(driver);
	}
	public void check_with_Farmer_age_validations() throws Throwable {
		utilities.webDriverWait(driver, farmer_age_valid);
		driver.findElement(farmer_age_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(farmer_age_alert);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(farmer_age_valid).sendKeys("27 !@");
		utilities.MaximumWait(driver);
	}
	public void check_with_farmer_address_one_validations() throws Throwable {
		utilities.webDriverWait(driver, farmer_address_one);
		driver.findElement(farmer_address_one).clear();
		utilities.MaximumWait(driver);		
		WebElement message = driver.findElement(farmer_add_one_alt);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(farmer_address_one).sendKeys("Street $ one");
	}
	public void check_with_farmer_address_two_validations() throws Throwable {
		utilities.webDriverWait(driver, farmer_add_two);
		driver.findElement(farmer_add_two).clear();
		utilities.MaximumWait(driver);		
		WebElement message = driver.findElement(farmer_add_two_alt);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(farmer_add_two).sendKeys("Street $ one");
		
	}
	public void Check_with_the_Landmark_validations() throws Throwable {
		utilities.webDriverWait(driver, Landmark_click_val);
		driver.findElement(Landmark_click_val).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Landmark_click_val).sendKeys("Land mark #$one");
	}
	public void Check_with_the_State_modify_validations() throws Throwable {
		utilities.webDriverWait(driver, State_changes_val);
		driver.findElement(State_changes_val).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(State_chg_validation);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(State_changes_val).click();
		utilities.MaximumWait(driver);
        driver.findElement(State_option_modify).click();
	}
	public void Check_with_the_District_modify_validations() throws Throwable {
		utilities.webDriverWait(driver, District_sel_val);
		driver.findElement(District_sel_val).click();
		utilities.MaximumWait(driver);
        driver.findElement(District_opt_modify).click();
		utilities.MaximumWait(driver);
        driver.findElement(District_sel_val).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(District_opt_valid);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_sel_val).click();
		utilities.MaximumWait(driver);
        driver.findElement(District_opt_modify).click();

	}
	public void Check_with_the_Mandal_modify_validations() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_val);
		driver.findElement(Mandal_sel_val).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_opt_modify).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_sel_val).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Mandal_opt_valid);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_sel_val).click();
		utilities.MaximumWait(driver);
        driver.findElement(Mandal_opt_modify).click();
	}
	public void Check_with_the_Village_modify_validations() throws Throwable {
		utilities.webDriverWait(driver, village_sel_val);
		driver.findElement(village_sel_val).click();
		utilities.MaximumWait(driver);
        driver.findElement(village_opt_modify).click();
		utilities.MaximumWait(driver);
		driver.findElement(village_sel_val).clear();
		WebElement message = driver.findElement(village_opt_valid);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(village_sel_val).click();
		utilities.MaximumWait(driver);
        driver.findElement(village_opt_modify).click();

	}
	public void Check_with_the_Mobile_number_Validations() throws Throwable {
		utilities.webDriverWait(driver, Mobile_numb_val);
		driver.findElement(Mobile_numb_val).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Mobile_valid_chk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Mobile_numb_val).sendKeys("9848098481");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Source_of_contact_validations() throws Throwable {
		utilities.webDriverWait(driver, Source_of_con_click);
		driver.findElement(Source_of_con_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Modify_source).click();
		utilities.MaximumWait(driver);

	}
	public void check_with_the_Category_selection_validations() throws Throwable {
		utilities.webDriverWait(driver, Category_check);
		driver.findElement(Category_check).click();
		utilities.MaximumWait(driver);
		driver.findElement(Category_modify_cli).click();
		utilities.MaximumWait(driver);
	}
	public void Check_with_the_Annual_Income_selection_validations() throws Throwable {
		utilities.webDriverWait(driver, Annual_inc_check);
		driver.findElement(Annual_inc_check).click();
		utilities.MaximumWait(driver);
		driver.findElement(Modify_ann_inc).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Education_selection_validations() throws Throwable {
		utilities.webDriverWait(driver, Education_val_chk);
		driver.findElement(Education_val_chk).click();
		utilities.MaximumWait(driver);
		driver.findElement(Edc_val_modify).click();
		utilities.MaximumWait(driver);
	}
	public void user_update_with_farmer_Img_validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_src);
		driver.findElement(Farmer_src).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Save_button_validations() throws Throwable {
		utilities.webDriverWait(driver, Save_Click);
		driver.findElement(Save_Click).click();
		utilities.MaximumWait(driver);
	}
	public void Check_with_the_Add_Identity_proof_validations() throws Throwable {
		utilities.webDriverWait(driver, Identity_click);
		driver.findElement(Identity_click).click();
		utilities.MaximumWait(driver);
	}
	public void Check_with_the_Identity_proof_name_validations() throws Throwable {
		utilities.webDriverWait(driver, click_edit_identity);
		driver.findElement(click_edit_identity).click();
		utilities.MaximumWait(driver);
		driver.findElement(Identity_name_clic).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Identity_name_clic).click();
		utilities.MaximumWait(driver);
		driver.findElement(modify_proof_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(drive_lic_number).click();
		utilities.MaximumWait(driver);
		driver.findElement(drive_lic_number).clear();
		utilities.MaximumWait(driver);
		driver.findElement(drive_lic_number).sendKeys("DL-1420110012365");
		utilities.MaximumWait(driver);
		}
	public void check_with_the_Save_form() throws Throwable {
		utilities.webDriverWait(driver, Update_proof_num);
		driver.findElement(Update_proof_num).click();
		utilities.MaximumWait(driver);
	}
	public void Click_on_the_Bank_info_validations() throws Throwable {
		utilities.webDriverWait(driver, Bank_info_edit);
		driver.findElement(Bank_info_edit).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_the_account_number_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_no_cli);
		driver.findElement(Account_no_cli).click();
		utilities.MaximumWait(driver);
		driver.findElement(Account_no_cli).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Acc_no_valid_alert);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Account_no_cli).sendKeys("99646468468584");
		utilities.MaximumWait(driver);

	}
	public void check_with_the_Account_holder_name_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_name_valid);
		driver.findElement(Account_name_valid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Account_name_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_name_alert);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Account_name_valid).sendKeys("Account Holder new");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Ifsc_code_validations() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_value);
		driver.findElement(Ifsc_code_value).click();
		utilities.MaximumWait(driver);
		driver.findElement(Ifsc_code_value).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(ifsc_code_alert);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(Ifsc_code_value).click();
		utilities.MaximumWait(driver);
        driver.findElement(Change_ifsc_val).click();
		utilities.MaximumWait(driver);


	}
	public void check_with_the_Bank_img_selection() throws Throwable {
		utilities.webDriverWait(driver, Bank_upload_i);
		driver.findElement(Bank_upload_i).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_update_button_click() throws Throwable {
		utilities.webDriverWait(driver, Click_update_bank);
		driver.findElement(Click_update_bank).click();
		utilities.MaximumWait(driver);
	}
}
	
