package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class PalmFarmerDatabase extends DriverFactory {
	Utilities utilities     = new Utilities();
	By username             = By.xpath("//input[@type='text']");
	By password             = By.xpath("//input[@type='password']");
	By Login                = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar              = By.xpath("//a[@class='sidebar-toggle']");
	By snapshot             = By.xpath("//span[text()='Snapshot']");
	By PalmFarm_menu        = By.xpath("//a[@href='#/palmFarmerDatabase']");
	By from_date            = By.xpath("//input[@class='md-datepicker-input md-input'][1]");
	By Search_Result        = By.xpath("(//button[@class='btn btn-sm btn-theme'])[1]");
	By select_grid_farmer   = By.xpath("(//td[@data-title-text='Farmer Id'])[3]");
	By edit_bt              = By.xpath("(//button[@class='btn btn-sm btn-theme'])[2]");
	By First_Name_update    = By.xpath("//input[@ng-model='farmerEdit.FirstName']");
	By Last_Name_Update     = By.xpath("//input[@ng-model='farmerEdit.LastName']");
    By father_Name_Update   = By.xpath("//input[@ng-model='farmerEdit.GuardianName']");
    By Date_birth_Update    = By.xpath("//input[@class='md-datepicker-input md-input']");
	By Address_details      = By.xpath("//input[@ng-model='farmerEdit.AddressLine1']");
	By Address_details_2    = By.xpath("//input[@ng-model='farmerEdit.AddressLine2']");
	By State_opt_select     = By.xpath("//input[@name='StateName']");
	By opt_state_sel        = By.xpath("(//li[@ng-class='{ selected: $index === $mdAutocompleteCtrl.index }'])[1]");
	By District_opt_sel     = By.xpath("//input[@name='DistrictName']");
	By opt_dis_sel          = By.xpath("//span[text()='West Godavari - WG']");
	By Mandal_sel           = By.xpath("//input[@name='MandalName']");
	By opt_mdl_sel          = By.xpath("//span[text()='Bhimavaram - BM']");
	By Village_sel          = By.xpath("//input[@id='fl-input-25']");
	By opt_vil_sel          = By.xpath("(//span[text()='Bhimavaram - BM'])[2]");
	By Mobile_num           = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Source_contact_sel   = By.xpath("(//md-select-value[@class='md-select-value'])[1]");
	By Change_source_sel    = By.xpath("(//md-option[@ng-repeat='contact in sourceOfContact'])[3]");
	By Category_sel         = By.xpath("(//md-select-value[@class='md-select-value'])[2]");
	By Chg_category         = By.xpath("//md-option[@value='42']");
	By Annual_Income_sel    = By.xpath("//md-select[@ng-model='farmerEdit.AnnualIncomeTypeId']");
	By chng_Ann_inc         = By.xpath("//md-option[@id='select_option_55']");
	By Education_sel        = By.xpath("//md-select[@ng-model='farmerEdit.EducationTypeId']");
	By chg_opt_edu          = By.xpath("//md-option[@id='select_option_58']");
	By Farmer_src_sel       = By.xpath("//input[@id='fileInputFarmer']");
	By Save_Click_opt       = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Aadhar_edit_clk      = By.xpath("//button[@ng-click ='editIdentityProof(row)']");
	By Click_eve            = By.xpath("//md-input-container[@class='ng-scope md-input-has-value']");
	By Enter_aadhar_details = By.xpath("(//input[@ng-model='rowEdit.IdProofNumber'])[2]");
	By update_aadhar_input  = By.xpath("//button[@class='btn btn-success btn-xs ng-scope']");
	By Update_bank_details  = By.xpath("//button[@ng-click='editFarmerBank()']");
	By Enter_accountnumber  = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Update_account_name  = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Ifsc_code_clk        = By.xpath("//input[@name='IFSCcode']");
	By Select_Ifsc_list		= By.xpath("(//span[@class='ng-binding'])[6]");
	By Bank_src_d           = By.xpath("//input[@id='fileInput']");
	By updateby_bank_d      = By.xpath("//button[@ng-click='updateFarmerBank(BankRequest)']");
	
	By Select_loc_check     = By.xpath("//md-select[@name='GeoLocations']");
	By State_sel_value_d    = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By select_state_id      = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By District_sel_val     = By.xpath("//md-select[@name='DistrictIds']");
	By District_none_val    = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Select_dist_val      = By.xpath("//div[text()='West Godavari - WG']");
	By Mandal_sel_value     = By.xpath("//md-select[@name='MandalIds']");
	By Mandal_none_val      = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By select_mand_val      = By.xpath("//div[text()='Tadepalligudem - TP']");
	By Village_sel_value    = By.xpath("//md-select[@name='VillageIds']");
	By Village_none_val     = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By select_vil_val       = By.xpath("//div[text()='Dandagarra - DG']");
	By From_date_sel        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By Search_click_val     = By.xpath("//button[@ng-click='getReport(request)']");
	By select_farmer_id     = By.xpath("//td[@tooltip='Farmer Code']");
	By Click_Edit_action    = By.xpath("//button[@ng-click='editFarmerDetails()']");
	By Farmer_details_edit  = By.xpath("//input[@ng-model='farmerEdit.FirstName']");
	By Farmer_last_name_ed  = By.xpath("//input[@ng-model='farmerEdit.LastName']");
	By Last_name_validation = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
	By Father_name_valid    = By.xpath("//input[@ng-model='farmerEdit.GuardianName']");
	By Father_name_alert    = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
    By Age_validat          = By.xpath("//input[@name='Age']");
    By Age_valid_alert      = By.xpath("//div[@ng-messages='farmerForm.Age.$error']");
    By Address_val_valid    = By.xpath("//input[@ng-model='farmerEdit.AddressLine1']");
	By Add_vali_alert       = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
	By Address_two_opt_c    = By.xpath("//input[@ng-model='farmerEdit.AddressLine2']");
	By Address_two_val_alt  = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
	By State_sel_           = By.xpath("//input[@name='StateName']");
	By State_sel_alert      = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
	By State_cng_sel        = By.xpath("//span[text()='Andhra Pradesh - AP']");
	
	By District_sel_        = By.xpath("//input[@id='fl-input-23']");
	By District_val_alert   = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
	By District_cng_sel     = By.xpath("//span[text()='West Godavari - WG']");
	
	By Mandal_sel_valu      = By.xpath("//input[@id='fl-input-24']");
	By mdal_val_alert      = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
	By Mandal_cng_sel       = By.xpath("//span[text()='Tadepalligudem - TP']");
	
	By Village_sel_v        = By.xpath("//input[@name='VillageName']");
	By Village_val_alert    = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
	By Village_cng_Sel      = By.xpath("//span[text()='Dandagarra - DG']");
	
	By Mob_val_click        = By.xpath("//input[@name='ContactNumber']");
	By Mobi_val_alert       = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
	By Source_of_contact    = By.xpath("//md-select[@name='Id']");
	By Cng_source_of_con    = By.xpath("//div[text()='Revenue Department']");
    By Farmer_Img_val       = By.xpath("//input[@name='fileInputFarmer']");
	By Save_click_opti      = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Identity_grid_edit   = By.xpath("//button[@ng-click='editIdentityProof(row)']");
	By Identity_proof_vali  = By.xpath("(//input[@ng-model='rowEdit.IdProofNumber'])[2]");
	By Identity_number_alt  = By.xpath("//div[@ng-messages='rowForm.IdProofNumber.$error']");
	By update_Identity_val  = By.xpath("//button[@ng-click='updateIdentityProof(rowEdit,rowForm)']");
	By Toastmessge_capture  = By.xpath("//div[text()='Farmer Identity proof Details Updated Successfully']");
	By Bank_details_grid_v  = By.xpath("//button[@ng-click='editFarmerBank()']");
	By Account_number_ip_v  = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Acc_num_alert        = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']");
	By Account_name_ip_v    = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Account_name_alert   = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
	By Ifsc_code_drp_val    = By.xpath("//input[@name='IFSCcode']");
	By Ifsc_code_alert      = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']");
	By Ifsc_cd_change       = By.xpath("//span[text()='SBIN0011663']");
	By bank_img_upload      = By.xpath("//input[@id='fileInput']");
	By update_btn_cl        = By.xpath("//button[@ng-disabled='editBankForm.$invalid||!IsValid()']");
	By toastmess_bank       = By.xpath("//div[text()='Farmer Bank Details Updated Successfully']");

	
    public void User_login_with_respective_roles()throws Throwable {
			driver.get(prop.getProperty("url"));
			utilities.webDriverWait(driver, Login);
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("admin");
			driver.findElement(password).sendKeys("P@ssw0rd");
			utilities.webDriverWait(driver, Login);
			driver.findElement(Login).click();
			utilities.MinimumWait(driver);

		}
		public void The_System_Navigate_to_the_Dashboard_screen() throws Throwable {
			utilities.webDriverWait(driver, sidebar);
			driver.findElement(sidebar).click();
			utilities.MinimumWait(driver);
		}

		public void click_on_the_module_of_snapshot() throws Throwable {
			utilities.webDriverWait(driver, snapshot);
			driver.findElement(snapshot).click();
			utilities.MinimumWait(driver);
		}
		public void Click_on_the_PalmFarmerDatabase_screen() throws Throwable {
			utilities.webDriverWait(driver, PalmFarm_menu);
			driver.findElement(PalmFarm_menu).click();
			utilities.MaximumWait(driver);
		}
		public void the_user_update_from_date_format() throws Throwable {
			utilities.webDriverWait(driver, from_date);
			driver.findElement(from_date).clear();
			driver.findElement(from_date).sendKeys("01/07/2023");
			utilities.MaximumWait(driver);
		}
		public void click_on_the_search_action_button() throws Throwable {
			utilities.webDriverWait(driver, Search_Result);
			driver.findElement(Search_Result).click();
			utilities.MinimumWait(driver);
			}
		public void Select_Farmer_from_PalmFarmerDatbase_screen() throws Throwable {
		    utilities.webDriverWait(driver, select_grid_farmer);
		    driver.findElement(select_grid_farmer).click();
		    utilities.MaximumWait(driver);
		    // Get the parent window handle
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

public void Click_on_the_Edit_button_from_the_Grid() throws Throwable {
			utilities.webDriverWait(driver, edit_bt);
		    driver.findElement(edit_bt).click();
		    utilities.MaximumWait(driver);
	}
public void checks_the_FirstName_update() throws Throwable {
	 utilities.webDriverWait(driver, First_Name_update);
     driver.findElement(First_Name_update).clear();
     driver.findElement(First_Name_update).sendKeys("Hare");
     utilities.MaximumWait(driver);
	
}
public void checks_the_LastName_update() throws Throwable {
	 utilities.webDriverWait(driver, Last_Name_Update);
     driver.findElement(Last_Name_Update).clear();
     driver.findElement(Last_Name_Update).sendKeys("krishna");
     utilities.MaximumWait(driver);
	}
public void checks_the_Father_name_update() throws Throwable {
	 utilities.webDriverWait(driver, father_Name_Update);
     driver.findElement(father_Name_Update).clear();
     driver.findElement(father_Name_Update).sendKeys("NandaMaharaju");
     utilities.MaximumWait(driver);
	
}
public void checks_the_Date_of_Birth_update() throws Throwable {
	utilities.webDriverWait(driver, Date_birth_Update);
    driver.findElement(Date_birth_Update).clear();
    driver.findElement(Date_birth_Update).sendKeys("03/01/1998");
    utilities.MaximumWait(driver);
	
}
public void updates_the_address_details() throws Throwable {
	utilities.webDriverWait(driver, Address_details);
    driver.findElement(Address_details).clear();
    driver.findElement(Address_details).sendKeys("Street Number 11");
    utilities.MaximumWait(driver);
}
public void updates_the_address2_details() throws Throwable {
	utilities.webDriverWait(driver, Address_details_2);
    driver.findElement(Address_details_2).clear();
    driver.findElement(Address_details_2).sendKeys("Street Number 2");
    utilities.MaximumWait(driver);
	
}
public void updates_the_State_details() throws Throwable {
	utilities.webDriverWait(driver, State_opt_select);
	driver.findElement(State_opt_select).clear();
	driver.findElement(State_opt_select).click();
	driver.findElement(opt_state_sel).click();
	utilities.MaximumWait(driver);
	
}
public void updates_the_District_selection() throws Throwable {
	utilities.webDriverWait(driver, District_opt_sel);
	driver.findElement(District_opt_sel).clear();
	driver.findElement(District_opt_sel).click();
	driver.findElement(opt_dis_sel).click();
	utilities.MaximumWait(driver);
	
}
public void updates_the_Mandal_selection() throws Throwable {
	utilities.webDriverWait(driver, Mandal_sel);
	driver.findElement(Mandal_sel).clear();
	driver.findElement(Mandal_sel).click();
	driver.findElement(opt_mdl_sel).click();
	utilities.MaximumWait(driver);
	
}
public void updates_the_village_selection() throws Throwable {
	utilities.webDriverWait(driver, Village_sel);
	driver.findElement(Village_sel).clear();
	driver.findElement(Village_sel).click();
	driver.findElement(opt_vil_sel).click();
	utilities.MaximumWait(driver);
}
public void updates_the_mobile_number_selection() throws Throwable {
	utilities.webDriverWait(driver, Mobile_num);
	driver.findElement(Mobile_num).clear();
	driver.findElement(Mobile_num).sendKeys("9876547891");
	utilities.MaximumWait(driver);
}
public void updates_the_Source_of_contact_selection() throws Throwable {
	utilities.webDriverWait(driver, Source_contact_sel);
	driver.findElement(Source_contact_sel).click();
	driver.findElement(Change_source_sel).click();
	utilities.MaximumWait(driver);
	
}
public void updates_the_Category_option_details() throws Throwable {
	utilities.webDriverWait(driver, Category_sel);
	driver.findElement(Category_sel).click();
	driver.findElement(Chg_category).click();
	utilities.MaximumWait(driver);
	
}
public void updates_the_Annual_income_details() throws Throwable {
	utilities.webDriverWait(driver, Annual_Income_sel);
	driver.findElement(Annual_Income_sel).click();
	driver.findElement(chng_Ann_inc).click();
	utilities.MaximumWait(driver);
}
public void updates_the_Education_details() throws Throwable {
	utilities.webDriverWait(driver, Education_sel);
	driver.findElement(Education_sel).click();
	driver.findElement(chg_opt_edu).click();
	utilities.MaximumWait(driver);
	
}
public void updates_the_farmer_Img() throws Throwable {
	utilities.webDriverWait(driver, Farmer_src_sel);
	driver.findElement(Farmer_src_sel).sendKeys("D:/3f/Img/farmer.jpeg");
	utilities.MaximumWait(driver);
	
}
public void clicks_the_Save_button() throws Throwable {
	utilities.webDriverWait(driver, Save_Click_opt);
	driver.findElement(Save_Click_opt).click();
	utilities.MaximumWait(driver);
}
public void User_update_Identity_proof_grid_details() throws Throwable {
	utilities.webDriverWait(driver, Aadhar_edit_clk);
	driver.findElement(Aadhar_edit_clk).click();
	driver.findElement(Click_eve).click();
	utilities.MinimumWait(driver);
	driver.findElement(Enter_aadhar_details).clear();
	driver.findElement(Enter_aadhar_details).click();
	driver.findElement(Enter_aadhar_details).sendKeys("133666343999");
	utilities.MaximumWait(driver);
	utilities.webDriverWait(driver, update_aadhar_input);
	driver.findElement(update_aadhar_input).click();
	utilities.MaximumWait(driver);
	
}
public void User_Update_Account_Details_grid() throws Throwable {
	utilities.webDriverWait(driver, Update_bank_details);
	driver.findElement(Update_bank_details).click();
	utilities.MaximumWait(driver);
	driver.findElement(Enter_accountnumber).clear();
	driver.findElement(Enter_accountnumber).sendKeys("0334443339939");
	utilities.MaximumWait(driver);
	driver.findElement(Update_account_name).clear();
	driver.findElement(Update_account_name).sendKeys("Updated Userthree");
	utilities.MaximumWait(driver);
	driver.findElement(Ifsc_code_clk).clear();
	driver.findElement(Ifsc_code_clk).click();
	driver.findElement(Select_Ifsc_list).click();
	utilities.MaximumWait(driver);
	utilities.webDriverWait(driver, Bank_src_d);
	driver.findElement(Bank_src_d).sendKeys("D:/3f/Img/passbook.jpeg");
	utilities.MaximumWait(driver);
	
}
public void Click_on_the_button_Update() throws Throwable {
	utilities.webDriverWait(driver, updateby_bank_d );
	driver.findElement(updateby_bank_d).click();
	utilities.MaximumWait(driver);
	String child = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	for (String window : windows) {
	    if (!window.equals(child)) {
	        driver.switchTo().window(window);
	        utilities.MediumWait(driver);
	        }
	}
	driver.switchTo().window(child);
	
}
public void Verify_with_the_Select_location_type() throws Throwable {
	utilities.webDriverWait(driver, Select_loc_check );
	driver.findElement(Select_loc_check).click();
	Robot r = new Robot();
    r.keyPress(KeyEvent.VK_TAB);
	utilities.MaximumWait(driver);
    }
public void check_with_the_state_selection_type() throws Throwable {
	utilities.webDriverWait(driver, State_sel_value_d );
	driver.findElement(State_sel_value_d).click();
	utilities.MaximumWait(driver);
	driver.findElement(select_state_id).click();
	 Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	utilities.MaximumWait(driver);

   }
public void check_with_the_District_selection_type() throws Throwable {
	utilities.webDriverWait(driver, District_sel_val );
	driver.findElement(District_sel_val).click();
	utilities.MaximumWait(driver);
	Robot r = new Robot();
    r.keyPress(KeyEvent.VK_TAB);
    WebElement message = driver.findElement(District_none_val);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
	driver.findElement(District_sel_val).click();
	utilities.MaximumWait(driver);
	driver.findElement(Select_dist_val).click();
	Robot r1 = new Robot();
    r1.keyPress(KeyEvent.VK_TAB);
	utilities.MaximumWait(driver);
}
public void check_with_the_Mandal_selection_type() throws Throwable {
	utilities.webDriverWait(driver, Mandal_sel_value );
	driver.findElement(Mandal_sel_value).click();
	utilities.MaximumWait(driver);
	Robot r = new Robot();
    r.keyPress(KeyEvent.VK_TAB);
	utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Mandal_none_val);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
	driver.findElement(Mandal_sel_value).click();
	utilities.MaximumWait(driver);
	driver.findElement(select_mand_val).click();
	Robot r1 = new Robot();
    r1.keyPress(KeyEvent.VK_TAB);
	utilities.MaximumWait(driver);

}
public void check_with_the_Village_selection_type() throws Throwable {
	utilities.webDriverWait(driver, Village_sel_value );
	driver.findElement(Village_sel_value).click();
	utilities.MaximumWait(driver);
	Robot r = new Robot();
    r.keyPress(KeyEvent.VK_TAB);
	utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Village_none_val);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
	driver.findElement(Village_sel_value).click();
	utilities.MaximumWait(driver);
	driver.findElement(select_vil_val).click();
	Robot r1 = new Robot();
    r1.keyPress(KeyEvent.VK_TAB);
	utilities.MaximumWait(driver);
}
public void check_with_the_from_date_validations() throws Throwable {
	utilities.webDriverWait(driver, From_date_sel );
	driver.findElement(From_date_sel).clear();
	utilities.MaximumWait(driver);
	driver.findElement(From_date_sel).sendKeys("01/04/2023");
	utilities.MaximumWait(driver);

}
public void check_with_the_Search_button_click() throws Throwable {
	utilities.webDriverWait(driver, Search_click_val );
	driver.findElement(Search_click_val).click();
	utilities.MaximumLongWait(driver);
}
public void Select_Farmer_from_the_grid_screen() throws Throwable {
	  utilities.webDriverWait(driver, select_farmer_id);
	    driver.findElement(select_farmer_id).click();
	    utilities.MaximumWait(driver);
	    // Get the parent window handle
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				utilities.MaximumLongWait(driver);
			}
		}
		
	}
public void Click_on_the_Edit_details_action_button() throws Throwable {
	utilities.webDriverWait(driver, Click_Edit_action);
    driver.findElement(Click_Edit_action).click();
    utilities.MaximumWait(driver);
}
public void Check_with_the_Farmer_First_name_Validations() throws Throwable {
	utilities.webDriverWait(driver, Farmer_details_edit);
    driver.findElement(Farmer_details_edit).clear();
    utilities.MaximumWait(driver);
    driver.findElement(Farmer_details_edit).sendKeys("Farmer one");
}
public void check_with_the_farmer_Last_name_validations() throws Throwable {
	utilities.webDriverWait(driver, Farmer_last_name_ed);
    driver.findElement(Farmer_last_name_ed).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Last_name_validation);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Farmer_last_name_ed).sendKeys("Farmer New");
}
public void check_with_the_Farmer_Father_name_Validations() throws Throwable {
	utilities.webDriverWait(driver, Father_name_valid);
    driver.findElement(Father_name_valid).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Father_name_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Father_name_valid).sendKeys("Deva");

}
public void check_with_the_Age_validations() throws Throwable {
	utilities.webDriverWait(driver, Age_validat);
    driver.findElement(Age_validat).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Age_valid_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Age_validat).sendKeys("25");

}
public void check_with_the_Address_validations() throws Throwable {
	utilities.webDriverWait(driver, Address_val_valid);
    driver.findElement(Address_val_valid).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Add_vali_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Address_val_valid).sendKeys("Street number one");
}
public void check_with_the_Address_two_validations() throws Throwable {
	utilities.webDriverWait(driver, Address_two_opt_c);
    driver.findElement(Address_two_opt_c).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Address_two_val_alt);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Address_two_opt_c).sendKeys("Abc Colony");

}
public void Check_with_the_State_dropdown_validations() throws Throwable {
	utilities.webDriverWait(driver, State_sel_);
    driver.findElement(State_sel_).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(State_sel_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(State_sel_).click();
    utilities.MaximumWait(driver);
    driver.findElement(State_cng_sel).click();
    utilities.MaximumWait(driver);
}
public void Check_with_the_District_dropdown_validations() throws Throwable {
	utilities.webDriverWait(driver, District_sel_);
    driver.findElement(District_sel_).click();
    utilities.MaximumWait(driver);
    driver.findElement(District_cng_sel).click();
    utilities.MaximumWait(driver);
    driver.findElement(District_sel_).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(District_val_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(District_sel_).click();
    utilities.MaximumWait(driver);
    driver.findElement(District_cng_sel).click();
    utilities.MaximumWait(driver);
}
public void Check_with_the_Mandal_dropdown_validations() throws Throwable {
	utilities.webDriverWait(driver, Mandal_sel_valu);
    driver.findElement(Mandal_sel_valu).click();
    utilities.MaximumWait(driver);
    driver.findElement(Mandal_cng_sel).click();
    utilities.MaximumWait(driver);
    driver.findElement(Mandal_sel_valu).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(mdal_val_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Mandal_sel_valu).click();
    utilities.MaximumWait(driver);
    driver.findElement(Mandal_cng_sel).click();
    utilities.MaximumWait(driver);
}
public void Check_with_the_Village_dropdown_validations() throws Throwable {
	utilities.webDriverWait(driver, Village_sel_v);
    driver.findElement(Village_sel_v).click();
    utilities.MaximumWait(driver);
    driver.findElement(Village_cng_Sel).click();
    utilities.MaximumWait(driver);
    driver.findElement(Village_sel_v).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(mdal_val_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Village_sel_v).click();
    utilities.MaximumWait(driver);
    driver.findElement(Village_cng_Sel).click();
    utilities.MaximumWait(driver);
}
public void check_with_the_Mobile_number_input_validations() throws Throwable {
	utilities.webDriverWait(driver, Mob_val_click);
    driver.findElement(Mob_val_click).clear();
    utilities.MaximumWait(driver);
    WebElement message = driver.findElement(Mobi_val_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Mob_val_click).sendKeys("3345557870");
    utilities.MaximumWait(driver);

}
public void check_with_the_Source_of_contact_dropdown_validations() throws Throwable {
	utilities.webDriverWait(driver, Source_of_contact);
    driver.findElement(Source_of_contact).click();
    utilities.MaximumWait(driver);
    driver.findElement(Cng_source_of_con).click();
    utilities.MaximumWait(driver);

    
}
public void check_with_the_Image_validations() throws Throwable {
	utilities.webDriverWait(driver, Farmer_Img_val);
	driver.findElement(Farmer_Img_val).sendKeys("D:/3f/Img/farmer.jpeg");
	utilities.MaximumWait(driver);
}
public void check_with_the_save_button() throws Throwable {
	utilities.webDriverWait(driver, Save_click_opti);
	driver.findElement(Save_click_opti).click();
	utilities.MaximumWait(driver);
}
public void check_with_Identity_proof_Edit_validations() throws Throwable {
	utilities.webDriverWait(driver, Identity_grid_edit);
	driver.findElement(Identity_grid_edit).click();
	utilities.MaximumWait(driver);
	driver.findElement(Identity_proof_vali).clear();
	WebElement message = driver.findElement(Identity_number_alt);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
	utilities.MaximumWait(driver);
	driver.findElement(Identity_proof_vali).sendKeys("166774864566");
	utilities.MaximumWait(driver);
 
}
public void check_with_the_Identity_details_Update() throws Throwable {
	utilities.webDriverWait(driver, update_Identity_val);
	driver.findElement(update_Identity_val).click();
	utilities.MaximumWait(driver);
	WebElement toastmessage = driver.findElement(Toastmessge_capture);
	String messageText = toastmessage.getText();
	System.out.println("Toast message: " + messageText);
}
public void check_with_the_Bank_details_validations() throws Throwable {
	utilities.webDriverWait(driver, Bank_details_grid_v);
	driver.findElement(Bank_details_grid_v).click();
	utilities.MaximumWait(driver);
}
public void check_with_the_Account_Number_input_validations() throws Throwable {
	utilities.webDriverWait(driver, Account_number_ip_v);
	driver.findElement(Account_number_ip_v).clear();
	utilities.MaximumWait(driver);
	WebElement message = driver.findElement(Acc_num_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
	driver.findElement(Account_number_ip_v).sendKeys("675456789456156");
	utilities.MaximumWait(driver);

}
public void check_with_the_Account_Name_input_validations() throws Throwable {
	utilities.webDriverWait(driver, Account_name_ip_v);
	driver.findElement(Account_name_ip_v).clear();
	utilities.MaximumWait(driver);
	WebElement message = driver.findElement(Account_name_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
	driver.findElement(Account_name_ip_v).sendKeys("farmer three");
	utilities.MaximumWait(driver);
}
public void check_with_the_Ifsc_code_dropdown_sel_validations() throws Throwable {
	utilities.webDriverWait(driver, Ifsc_code_drp_val);
	driver.findElement(Ifsc_code_drp_val).clear();
	utilities.MaximumWait(driver);
	WebElement message = driver.findElement(Ifsc_code_alert);
    String actualMessage = message.getText();
    System.out.println("Validation message: " + actualMessage);
    driver.findElement(Ifsc_code_drp_val).click();
	utilities.MaximumWait(driver);
    driver.findElement(Ifsc_cd_change).click();

}
public void check_with_the_Bank_upload_image_update() throws Throwable {
	utilities.webDriverWait(driver, bank_img_upload);
	driver.findElement(bank_img_upload).sendKeys("D:/3f/Img/passbook.jpeg");
	utilities.MaximumWait(driver);	
}
public void check_with_click_on_the_update_button() throws Throwable {
	utilities.webDriverWait(driver, update_btn_cl);
	driver.findElement(update_btn_cl).click();
	utilities.MaximumWait(driver);	
	WebElement toastmessage = driver.findElement(toastmess_bank);
	String messageText = toastmessage.getText();
	System.out.println("Toast message: " + messageText);
}

}

	


		
				