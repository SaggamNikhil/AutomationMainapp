package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Plotswillingtoconvert extends DriverFactory {
	Utilities utilities       = new Utilities();
	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Otpafter_subm          = By.xpath("//button[@ng-click='submit(login)']");
	By sidebar_Nav            = By.xpath("//a[@class='sidebar-toggle']");
	By AreaExtension_module   = By.xpath("//span[text()='Area Extension/Conversion']");
	By willing_to_convert     = By.xpath("//a[@href='#/plotsWillingtoConvert']");
	
	By Select_location_grid   = By.xpath("//md-select[@name='GeoLocations']");
	By State_select_grid      = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Sel_state_grid         = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By Sel_state_sel_two      = By.xpath("//div[text()='Arunachal Pradesh - AR']");
	By District_select_grid   = By.xpath("//md-select[@name='DistrictIds']");
	By District_toast_msg     = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Sel_District_one       = By.xpath("//div[text()='EAST GODAVARI - EG']");
	By Sel_district_two       = By.xpath("//div[text()='L/Dibang Valley - LD']");
	By Mandal_select_grid     = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandal_toast_msg       = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mandal_select_one      = By.xpath("//div[text()='Devarapalli-II - DA']");
	By Mandal_select_two      = By.xpath("//div[text()='Roing - RN']");
	By Village_select_grid    = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_toast_msg      = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By village_select_one     = By.xpath("//div[text()='Alumo - AL']");
	By village_select_two     = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
	By From_date_select       = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_toast_msg    = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_button_click    = By.xpath("//button[@ng-click='initWillingPlots(request)']");
	
	By Sel_farmer_click       = By.xpath("(//tr[@ng-click='showFarmerDetails(row, $event)'])[1]");
	By Contact_history_click  = By.xpath("//button[@ng-click='viewFarmerContctHistory()']");
	By contact_popup_cls      = By.xpath("//md-icon[@aria-label='Close dialog']");
	By Click_edit_btn         = By.xpath("//button[@ng-click='editFarmerDetails()']");
	
	By Farmer_last_name_click = By.xpath("//input[@ng-model='farmerEdit.LastName']");
	By Farmer_tst_alrt        = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
	By Father_name_click      = By.xpath("//input[@ng-model='farmerEdit.GuardianName']");
	By Father_name_tst_chk    = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
	By Age_ip_chck            = By.xpath("//input[@name='Age']");
	By Age_ip_toast_click     = By.xpath("//div[@ng-messages='farmerForm.Age.$error']");
	By Address_one_val_clk    = By.xpath("//input[@name='AddressLine1']");
	By Address_one_tst_chk    = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
	By Address_two_val_clk    = By.xpath("//input[@name='AddressLine2']");
	By Address_two_tst_chk    = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
	By State_sel              = By.xpath("//input[@name='StateName']");
	By State_sel_none         = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
	By State_opt_select       = By.xpath("//span[text()='Andhra Pradesh - AP']");
	By District_sel_input     = By.xpath("//input[@name='DistrictName']");
	By District_validations   = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
	By District_sele_option   = By.xpath("//span[text()='EAST GODAVARI - EG']");
	By Mandal_sel_op          = By.xpath("//input[@name='MandalName']");
	By Mandal_validate_alt    = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
	By Mandal_chng_sele       = By.xpath("//span[text()='Devarapalli-II - DA']");
	By Village_sel_option_t   = By.xpath("//input[@name='VillageName']");
	By Village_validate_alt   = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
	By Village_chng_sele      = By.xpath("//span[text()='Chinnaigudem - CG']");
	By Mobile_num_ip_check    = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Mobile_num_validate    = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
	By upload_image_by        = By.xpath("//input[@name='fileInputFarmer']");
	By Submit_farmer_details  = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Save_toast_msgs        = By.xpath("//div[text()='Farmer Personal Details Updated Successfully']");
	By Farmer_Id_proof_edit   = By.xpath("//button[@ng-click='editIdentityProof(row)']");
	By bank_his               = By.xpath("//button[@ng-click='viewFarmerBankHis()']");
	By Bank_his_close         = By.xpath("//md-icon[@aria-label='Close dialog']");
	By Edit_click_bankinfo    = By.xpath("//button[@ng-click='editFarmerBank()']");
	
	By Account_no_value_click = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Account_no_value_upt   = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']");
	By Account_name_val_click = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Account_name_val_c     = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
	By Ifsc_code_field_chec   = By.xpath("//input[@name='IFSCcode']");
	By Ifsc_code_alert        = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']");
	By chang_ifsc_code        = By.xpath("//span[text()='SBIN0011663']");
	By upload_bank_imag       = By.xpath("//input[@id='fileInput']");
	By Update_button_clck     = By.xpath("//button[@ng-disabled='editBankForm.$invalid||!IsValid()']");
	By toastmessage_bank_clk  = By.xpath("//div[text()='Farmer Bank Details Updated Successfully']");
	By Click_Add_Advance      = By.xpath("(//button[@ng-click='editAdvanceDetails(row)'])[1]");
	By Enter_survey_ip        = By.xpath("//input[@ng-model='Request.AdvancedDetailsSurveyNumber']");
	By Without_survey_ip      = By.xpath("//div[@ng-messages='advanceForm.AdvancedDetailsSurveyNumber.$error']");
	By Advance_Date_sel       = By.xpath("(//input[@ng-focus='ctrl.setFocused(true)'])[4]");
	By without_date_sel       = By.xpath("//div[@ng-messages='advanceForm.DateOfAdvanceReceived.$error']");
	By Advance_area           = By.xpath("//input[@ng-model='Request.AdvanceReceivedArea']");
	By with_out_area_ip       = By.xpath("//div[@ng-messages='advanceForm.AdvanceReceivedArea.$error']");
	By Mode_of_payment        = By.xpath("//md-select[@name='SelectModeOfPayment']");
	By Select_payment         = By.xpath("(//md-option[@value='180'])[6]");
	By No_of_imp_input        = By.xpath("//input[@ng-model='Request.NoOfImportedSaplingsToBeIssued']");
	By No_of_ind_input        = By.xpath("//input[@ng-model='Request.NoOfIndigenousSaplingsToBeIssued']");
	By Add_print_click        = By.xpath("//button[@ng-click='updateAdvanceDetails(Request, advanceForm,1)']");
	By Click_approve_btn      = By.xpath("//button[@aria-label='Approve']");
	By Plot_approve_cmt       = By.xpath("//textarea[@ng-model='Comments']");
	By Plot_Appove_click      = By.xpath("//button[@ng-click='approveOrDecline()']");
	

	public void First_login_with_the_Respective_user_role_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);	
	}
	public void Click_on_the_submit_button() throws Throwable {
		   utilities.webDriverWait(driver,Otpafter_subm);
		   driver.findElement(Otpafter_subm).click();
		   utilities.MaximumWait(driver);
			
		}

	public void the_page_is_Navigate_to_the_Dashboard_of_the_oilpalm_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Nav);
		driver.findElement(sidebar_Nav).click();
		utilities.MinimumWait(driver);		
	}


	public void Click_on_the_Areaextension_module_screen_name() throws Throwable {
		utilities.webDriverWait(driver, AreaExtension_module);
		driver.findElement(AreaExtension_module).click();
		utilities.MaximumWait(driver);	
	}


	public void click_on_the_Plotswilling_to_convert_screen() throws Throwable {
		utilities.webDriverWait(driver, willing_to_convert);
		driver.findElement(willing_to_convert).click();
		utilities.MaximumWait(driver);
	}


	public void Select_Location_type_from_the_grids() throws Throwable {
		utilities.webDriverWait(driver, Select_location_grid);
		driver.findElement(Select_location_grid).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}
	public void select_state_from_the_grid_details() throws Throwable {
		utilities.webDriverWait(driver, State_select_grid);
		driver.findElement(State_select_grid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_grid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_sel_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}
	public void select_District_from_the_grid_details() throws Throwable {
		utilities.webDriverWait(driver, District_select_grid);
		driver.findElement(District_select_grid).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_toast_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_select_grid).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_District_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_district_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}
	public void select_mandal_from_the_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_grid);
		driver.findElement(Mandal_select_grid).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Mandal_toast_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_select_grid).click();
		utilities.MinimumWait(driver);
		driver.findElement(Mandal_select_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Mandal_select_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}
	public void select_Villages_from_the_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Village_select_grid);
		driver.findElement(Village_select_grid).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Village_toast_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_select_grid).click();
		utilities.MinimumWait(driver);
		driver.findElement(village_select_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(village_select_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}
	public void select_from_date_sele_validation() throws Throwable {
		utilities.webDriverWait(driver, From_date_select);
		driver.findElement(From_date_select).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_select).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_toast_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_select).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_select).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}
	public void click_on_the_search_button_from_the_screen() throws Throwable {
		utilities.webDriverWait(driver, Search_button_click);
		driver.findElement(Search_button_click).click();
		utilities.MaximumWait(driver);
	}


	public void select_farmer_code_from_the_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Sel_farmer_click);
		driver.findElement(Sel_farmer_click).click();
		utilities.MaximumWait(driver);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				utilities.MaximumWait(driver);
			}
		}
	}


	public void click_on_the_Contact_history_details_button() throws Throwable {
		utilities.webDriverWait(driver, Contact_history_click);
		driver.findElement(Contact_history_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(contact_popup_cls).click();
		utilities.MaximumWait(driver);
	}


	public void Click_the_Edit_action_details_button() throws Throwable {
		utilities.webDriverWait(driver, Click_edit_btn);
		driver.findElement(Click_edit_btn).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_FarmerLast_name_ip_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Farmer_last_name_click);
		driver.findElement(Farmer_last_name_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Farmer_tst_alrt);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(Farmer_last_name_click).sendKeys("Raithu two");
		utilities.MaximumWait(driver);
	}


	public void check_with_Farmer_Father_name_ip_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Father_name_click);
		driver.findElement(Father_name_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Father_name_tst_chk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Father_name_click).sendKeys("Sriram");
	}
	public void check_with_Farmer_Age_details_ip_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Age_ip_chck);
		driver.findElement(Age_ip_chck).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Age_ip_toast_click);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Age_ip_chck).sendKeys("28");
		utilities.MaximumWait(driver);
	}
	public void check_with_farmer_address_ip_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_one_val_clk);
		driver.findElement(Address_one_val_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Address_one_tst_chk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Address_one_val_clk).sendKeys("Street $ one");
		utilities.MaximumWait(driver);		
	}
	public void check_with_farmer_adddress_two_ip_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_two_val_clk);
		driver.findElement(Address_two_val_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Address_two_tst_chk);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Address_two_val_clk).sendKeys("Street $ one");
		utilities.MaximumWait(driver);
	}
	public void Check_with_farmer_State_update_validations() throws Throwable {
		utilities.webDriverWait(driver, State_sel);
	    driver.findElement(State_sel).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(State_sel_none);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(State_sel).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(State_opt_select).click();
	    utilities.MaximumWait(driver);
	}
	public void check_with_farmer_District_update_validations() throws Throwable {
		utilities.webDriverWait(driver, District_sel_input);
	    driver.findElement(District_sel_input).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sele_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sel_input).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(District_validations);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(District_sel_input).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sele_option).click();
	    utilities.MaximumWait(driver);
	}
	public void check_with_farmer_mandal_update_validations() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_op);
	    driver.findElement(Mandal_sel_op).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_chng_sele).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_sel_op).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mandal_validate_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mandal_sel_op).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_chng_sele).click();
	    utilities.MaximumWait(driver);
	}
	public void check_with_farmer_Vilage_update_validations() throws Throwable {
		utilities.webDriverWait(driver, Village_sel_option_t);
	    driver.findElement(Village_sel_option_t).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_chng_sele).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_sel_option_t).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Village_validate_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Village_sel_option_t).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_chng_sele).click();
	    utilities.MaximumWait(driver);
	}
	public void check_with_farmer_Mobile_number_update_validations() throws Throwable {
		utilities.webDriverWait(driver, Mobile_num_ip_check);
	    driver.findElement(Mobile_num_ip_check).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mobile_num_validate);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mobile_num_ip_check).sendKeys("6946557870");
	    utilities.MaximumWait(driver);
		
	}
	public void check_with_Farmer_Image_upload_details() throws Throwable {
		utilities.webDriverWait(driver, upload_image_by);
		driver.findElement(upload_image_by).sendKeys("D:/images/sample farmer.jpg");
		utilities.MaximumWait(driver);
	}
	public void check_with_Save_Farmer_details() throws Throwable {
		utilities.webDriverWait(driver, Submit_farmer_details);
	    driver.findElement(Submit_farmer_details).click();
	    utilities.MaximumWait(driver);
	    WebElement toastmessage = driver.findElement(Save_toast_msgs);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
		
	}
	public void check_with_the_Farmer_Identity_details_update() throws Throwable {
		utilities.webDriverWait(driver, Farmer_Id_proof_edit);
		driver.findElement(Farmer_Id_proof_edit).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_the_bank_history_details_update() throws Throwable {
		utilities.webDriverWait(driver, bank_his);
		driver.findElement(bank_his).click();
		utilities.MaximumWait(driver);
		driver.findElement(Bank_his_close).click();
		utilities.MaximumWait(driver);

	}
	public void check_with_the_Bank_Edit_details() throws Throwable {
		utilities.webDriverWait(driver, Edit_click_bankinfo);
		driver.findElement(Edit_click_bankinfo).click();
		utilities.MaximumWait(driver);
		
	}
	public void check_with_the_Bank_Id_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Account_no_value_click);
		driver.findElement(Account_no_value_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_no_value_upt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_no_value_click).sendKeys("765456789456156");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Account_name_inputs_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Account_name_val_click);
		driver.findElement(Account_name_val_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_name_val_c);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_name_val_click).sendKeys("farmer Account holder$");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_IFSC_code_select_validations() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_field_chec);
		driver.findElement(Ifsc_code_field_chec).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Ifsc_code_alert);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Ifsc_code_field_chec).click();
		utilities.MaximumWait(driver);
	    driver.findElement(chang_ifsc_code).click();
	}
	public void check_with_the_Farmer_bank_images_update() throws Throwable {
		utilities.webDriverWait(driver, upload_bank_imag);
		driver.findElement(upload_bank_imag).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);	
	}
	public void click_with_the_Update_bank_details() throws Throwable {
		utilities.webDriverWait(driver, Update_button_clck);
		driver.findElement(Update_button_clck).click();
		utilities.MaximumWait(driver);		
		WebElement toastmessage = driver.findElement(toastmessage_bank_clk);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}
	public void click_on_the_Add_Advance_Details_action_button() throws Throwable {
		utilities.webDriverWait(driver, Click_Add_Advance);
		driver.findElement(Click_Add_Advance).click();
		utilities.MaximumWait(driver);	
	}
	public void Enter_with_Surveynumber_input_details() throws Throwable {
		utilities.webDriverWait(driver, Enter_survey_ip);
		driver.findElement(Enter_survey_ip).clear();
		utilities.MaximumWait(driver);
		WebElement toastmessage = driver.findElement(Without_survey_ip);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
		utilities.MaximumWait(driver);
		driver.findElement(Enter_survey_ip).sendKeys("Survey123@");
		utilities.MaximumWait(driver);
    }
	public void select_Advance_Received_date_details() throws Throwable {
		utilities.webDriverWait(driver, Advance_Date_sel);
		driver.findElement(Advance_Date_sel).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Advance_Date_sel).sendKeys("01/06/2024");
		utilities.MaximumWait(driver);
	}
	public void Enter_advance_received_area_input() throws Throwable {
		utilities.webDriverWait(driver, Advance_area);
		driver.findElement(Advance_area).clear();
		utilities.MaximumWait(driver);
        WebElement toastmessage = driver.findElement(with_out_area_ip);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
		driver.findElement(Advance_area).sendKeys("1");
		utilities.MaximumWait(driver);

	}
	public void select_mode_of_payment_details() throws Throwable {
		utilities.webDriverWait(driver, Mode_of_payment);
		driver.findElement(Mode_of_payment).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_payment).click();
		Thread.sleep(1000);
		utilities.MaximumWait(driver);

	}
	public void Enter_with_No_of_imported_saplings_input() throws Throwable {
		utilities.webDriverWait(driver, No_of_imp_input);
		driver.findElement(No_of_imp_input).sendKeys("5");
		utilities.MaximumWait(driver);
	}
	public void Enter_with_No_of_Indigenous_saplings_input() throws Throwable {
		utilities.webDriverWait(driver, No_of_ind_input);
		driver.findElement(No_of_ind_input).sendKeys("5");
		utilities.MaximumWait(driver);
	}
	public void click_on_the_Add_and_print_button() throws Throwable {
		utilities.webDriverWait(driver, Add_print_click);
		driver.findElement(Add_print_click).click();
		utilities.MaximumWait(driver);
	}
	public void click_on_the_grid_Approve_button() throws Throwable {
		utilities.webDriverWait(driver, Click_approve_btn);
		driver.findElement(Click_approve_btn).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_the_plot_approved_comments() throws Throwable {
		utilities.webDriverWait(driver, Plot_approve_cmt);
		driver.findElement(Plot_approve_cmt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Plot_approve_cmt).sendKeys("Approved by admin");
		utilities.MaximumWait(driver);

	}
	public void click_on_the_Approve_button() throws Throwable {
		utilities.webDriverWait(driver, Plot_Appove_click);
		driver.findElement(Plot_Appove_click).click();
		utilities.MaximumWait(driver);
	}
	
}
