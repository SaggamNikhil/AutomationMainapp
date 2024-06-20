package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ListofPreprospective extends DriverFactory{
	Utilities utilities       = new Utilities();
	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                = By.xpath("//a[@class='sidebar-toggle']");
	By AreaExtension          = By.xpath("//span[text()='Area Extension/Conversion']");
	By Listofpreprospec_nav   = By.xpath("//a[@href='#/preProsPlots']");
	By Select_geo_loc_field   = By.xpath("//md-select[@name='GeoLocations']");
	By State_sel_field        = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Select_state_opt       = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By Select_state_opt_two   = By.xpath("//div[text()='Arunachal Pradesh - AR']");
	By District_sel_field     = By.xpath("//md-select[@ng-model='GeoLocation.DistrictIds']");
	By District_toast         = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Select_District_opt    = By.xpath("//div[text()='EAST GODAVARI - EG']");
	By Select_district_two    = By.xpath("//	div[text()='L/Dibang Valley - LD']");
	By Mandal_sel_field       = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandal_toast           = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Select_Mandal_opt      = By.xpath("//div[text()='Devarapalli-II - DA']");
	By select_Mandal_two      = By.xpath("//div[text()='Roing - RN']");
	By Village_sel_field      = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_toast          = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By select_village_opt     = By.xpath("//div[text()='Alumo - AL']");
	By select_village_two     = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
	By From_date_validation   = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By From_date_toast        = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_btn_click       = By.xpath("//button[@ng-click='initPreProspectivePlots(request)']");
	By Plot_farmer_code_clk   = By.xpath("(//a[@ng-click='showFarmerDetails(row, $event)'])[1]");
	By Contact_history_click  = By.xpath("//button[@ng-click='viewFarmerContctHistory()']");
	By Contact_pop_up_close   = By.xpath("//md-icon[@aria-label='Close dialog']");
	By Edit_action_button     = By.xpath("//button[@ng-click='editFarmerDetails()']");
	By Farmer_last_name       = By.xpath("//input[@ng-model='farmerEdit.LastName']");
	By Farmer_toast_alert     = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
	By Father_name_ip         = By.xpath("//input[@ng-model='farmerEdit.GuardianName']");
	By Father_name_toast_alt  = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
	By Age_ip_click           = By.xpath("//input[@name='Age']");
	By Age_ip_toast           = By.xpath("//div[@ng-messages='farmerForm.Age.$error']");
	By Address_one_valid      = By.xpath("//input[@name='AddressLine1']");
	By Address_one_toast      = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
	By Address_two_valid      = By.xpath("//input[@name='AddressLine2']");
	By Address_two_toast      = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
	By State_selc_ip          = By.xpath("//input[@name='StateName']");
	By State_none_sel         = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
	By State_sel_option       = By.xpath("//span[text()='Andhra Pradesh - AP']");
	By District_selec_ip      = By.xpath("//input[@name='DistrictName']");
	By District_validation_al = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
	By District_sel_option    = By.xpath("//span[text()='EAST GODAVARI - EG']");
	By Mandal_sel_option      = By.xpath("//input[@name='MandalName']");
	By Mandal_validation_alt  = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
	By Mandal_chng_sel        = By.xpath("//span[text()='Devarapalli-II - DA']");
	By Village_sel_option     = By.xpath("//input[@name='VillageName']");
	By Village_validation_alt = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
	By Village_chng_sel       = By.xpath("//span[text()='Chinnaigudem - CG']");
	By Mobile_num_ip_clk      = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Mobile_num_valid       = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
	By upload_image_farmer    = By.xpath("//input[@name='fileInputFarmer']");
	By Click_save_btn         = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Save_toast_message     = By.xpath("//div[text()='Farmer Personal Details Updated Successfully']");
	
	By Identity_details_upt   = By.xpath("//button[@ng-click='addNewIdentityProof()']");
	By select_proof_type      = By.xpath("//input[@name='autocompleteField']");
	By select_id_type         = By.xpath("//span[text()='Aadhar Card']");
	By Identity_clr           = By.xpath("//div[@ng-messages='addForm.IdProofNumber.$error']");
	By Identity_num_valid     = By.xpath("(//input[@ng-model='proof.IdProofNumber'])[1]");
	By Proof_Details_uptd     = By.xpath("//button[@data-ng-click='addIdentityProof(proof)']");
	By Id_proof_toast_message = By.xpath("//div[text()='Farmer Identity proof Details Added Successfully']");
	By Bank_details_clk       = By.xpath("//button[@ng-click='editFarmerBank()']");
	By Account_no_value_clk   = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Account_no_value_val   = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']");
	By Account_name_val_clk   = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Account_name_val       = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
	By Ifsc_code_field_chk    = By.xpath("//input[@name='IFSCcode']");
	By Ifsc_code_alt          = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']");
	By chng_ifsc_code         = By.xpath("//span[text()='SBIN0011663']");
	By upload_bank_image      = By.xpath("//input[@id='fileInput']");
	By Update_button_clk      = By.xpath("//button[@ng-disabled='editBankForm.$invalid||!IsValid()']");
	By toastmessage_bank_c    = By.xpath("//div[text()='Farmer Bank Details Updated Successfully']");
	By Actions_perform        = By.xpath("(//button[@aria-label='Approve'])[1]");
	By Approval_confirm       = By.xpath("//button[@ng-click='dialog.hide()']");        

	

	public void First_login_page_with_Respective_user_role_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}


	public void the_page_is_Navigate_to_the_Dashboard_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MinimumWait(driver);
	}


	public void Click_on_the_Areaextension_module_name() throws Throwable {
		utilities.webDriverWait(driver, AreaExtension);
		driver.findElement(AreaExtension).click();
		utilities.MinimumWait(driver);	
	}


	public void click_on_the_ListofPreprospective_screen() throws Throwable {
		utilities.webDriverWait(driver, Listofpreprospec_nav);
		driver.findElement(Listofpreprospec_nav).click();
		utilities.MaximumWait(driver);	
	}


	public void click_on_the_Geo_location_sel_type() throws Throwable {
		utilities.webDriverWait(driver, Select_geo_loc_field);
		driver.findElement(Select_geo_loc_field).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_State_sel_details() throws Throwable {
		utilities.webDriverWait(driver, State_sel_field);
		driver.findElement(State_sel_field).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_state_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_state_opt_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}


	public void Check_with_the_District_sel_details() throws Throwable {
		utilities.webDriverWait(driver, District_sel_field);
		driver.findElement(District_sel_field).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_sel_field).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_District_opt).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_district_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);		
	}


	public void check_with_the_Mandal_sel_details() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_field);
		driver.findElement(Mandal_sel_field).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Mandal_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_sel_field).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_Mandal_opt).click();
		utilities.MinimumWait(driver);
		driver.findElement(select_Mandal_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);	
	}


	public void check_with_the_villages_sel_details() throws Throwable {
		utilities.webDriverWait(driver, Village_sel_field);
		driver.findElement(Village_sel_field).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Village_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_sel_field).click();
		utilities.MinimumWait(driver);
		driver.findElement(select_village_opt).click();
		utilities.MinimumWait(driver);
		driver.findElement(select_village_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_From_date_sel_details() throws Throwable {
		utilities.webDriverWait(driver, From_date_validation);
		driver.findElement(From_date_validation).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_validation).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(From_date_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_validation).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_validation).sendKeys("01/01/2022");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Search_sel_details() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Farmer_details_expansion() throws Throwable {
		utilities.webDriverWait(driver, Plot_farmer_code_clk);
		driver.findElement(Plot_farmer_code_clk).click();
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


	public void check_with_selected_farmer_contact_history_details() throws Throwable {
		utilities.webDriverWait(driver, Contact_history_click);
		driver.findElement(Contact_history_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Contact_pop_up_close).click();
		utilities.MaximumWait(driver);

		
	}


	public void check_with_edit_action_button_click() throws Throwable {
		utilities.webDriverWait(driver, Edit_action_button);
		driver.findElement(Edit_action_button).click();
		utilities.MaximumWait(driver);
	
	}


	public void check_with_FarmerLast_name_input_validation() throws Throwable {
		utilities.webDriverWait(driver, Farmer_last_name);
		driver.findElement(Farmer_last_name).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Farmer_toast_alert);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
		driver.findElement(Farmer_last_name).sendKeys("Raithu Farmer");
		utilities.MaximumWait(driver);

	}


	public void check_with_Farmer_Father_name_input_validation() throws Throwable {
		utilities.webDriverWait(driver, Father_name_ip);
		driver.findElement(Father_name_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Father_name_toast_alt);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Father_name_ip).sendKeys("Sriraja");
	}


	public void check_with_Farmer_Age_details_input_validation() throws Throwable {
		utilities.webDriverWait(driver, Age_ip_click);
		driver.findElement(Age_ip_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Age_ip_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Age_ip_click).sendKeys("30");
		utilities.MaximumWait(driver);

	}


	public void check_with_farmer_address_details_input_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_one_valid);
		driver.findElement(Address_one_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Address_one_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Address_one_valid).sendKeys("Street $ one");
		utilities.MaximumWait(driver);

	}


	public void check_with_farmer_adddress_two_input_validations() throws Throwable {
		utilities.webDriverWait(driver, Address_two_valid);
		driver.findElement(Address_two_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Address_two_toast);
        String actualMessage = message.getText();
        System.out.println("Validation message: " + actualMessage);
        driver.findElement(Address_two_valid).sendKeys("Street $ one");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_State_sel_dropdown_field_validations() throws Throwable {
		utilities.webDriverWait(driver, State_selc_ip);
	    driver.findElement(State_selc_ip).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(State_none_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(State_selc_ip).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(State_sel_option).click();
	    utilities.MaximumWait(driver);
	}


	public void check_with_the_District_sel_dropdown_field_validation() throws Throwable {
		utilities.webDriverWait(driver, District_selec_ip);
	    driver.findElement(District_selec_ip).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_selec_ip).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(District_validation_al);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(District_selec_ip).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(District_sel_option).click();
	    utilities.MaximumWait(driver);
		
	}


	public void check_with_the_Mandal_sel_dropdowm_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_option);
	    driver.findElement(Mandal_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_chng_sel).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_sel_option).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mandal_validation_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mandal_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Mandal_chng_sel).click();
	    utilities.MaximumWait(driver);
	}


	public void check_with_the_Village_sel_dropdown_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Village_sel_option);
	    driver.findElement(Village_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_chng_sel).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_sel_option).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Village_validation_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Village_sel_option).click();
	    utilities.MaximumWait(driver);
	    driver.findElement(Village_chng_sel).click();
	    utilities.MaximumWait(driver);
	}


	public void check_with_the_Mobile_Num_ip_field_validation() throws Throwable {
		utilities.webDriverWait(driver, Mobile_num_ip_clk);
	    driver.findElement(Mobile_num_ip_clk).clear();
	    utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Mobile_num_valid);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Mobile_num_ip_clk).sendKeys("6946557870");
	    utilities.MaximumWait(driver);
	}


	public void check_with_the_updated_farmer_img() throws Throwable {
		utilities.webDriverWait(driver, upload_image_farmer);
		driver.findElement(upload_image_farmer).sendKeys("D:/3f/Img/farmer.jpeg");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Farmer_details_save() throws Throwable {
		utilities.webDriverWait(driver, Click_save_btn);
		driver.findElement(Click_save_btn).click();
		utilities.MaximumWait(driver);
		WebElement toastmessage = driver.findElement(Save_toast_message);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}


	public void check_with_the_Identityproof_validations() throws Throwable {
		utilities.webDriverWait(driver, Identity_details_upt);
		driver.findElement(Identity_details_upt).click();
		utilities.MaximumWait(driver);
		driver.findElement(select_proof_type).click();
		utilities.MaximumWait(driver);
        driver.findElement(select_id_type).click();
        Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}
public void check_with_the_Add_id_details() throws Throwable {
		driver.findElement(Identity_num_valid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Identity_num_valid).sendKeys("658963147852");
		driver.findElement(Identity_num_valid).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Identity_clr);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Identity_num_valid).sendKeys("366674864566");
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Proof_Details_uptd);
		driver.findElement(Proof_Details_uptd).click();
		utilities.MaximumWait(driver);
		WebElement toastmessage = driver.findElement(Id_proof_toast_message);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}


	public void check_with_the_Bank_proof_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Bank_details_clk);
		driver.findElement(Bank_details_clk).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Account_no_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Account_no_value_clk);
		driver.findElement(Account_no_value_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_no_value_val);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_no_value_clk).sendKeys("765456789456156");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Account_name_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Account_name_val_clk);
		driver.findElement(Account_name_val_clk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Account_name_val);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Account_name_val_clk).sendKeys("farmer Account holder$");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_IFSC_code_sel_validations() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_field_chk);
		driver.findElement(Ifsc_code_field_chk).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Ifsc_code_alt);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	    driver.findElement(Ifsc_code_field_chk).click();
		utilities.MaximumWait(driver);
	    driver.findElement(chng_ifsc_code).click();
	}


	public void check_with_the_Farmer_bank_img_update() throws Throwable {
		utilities.webDriverWait(driver, upload_bank_image);
		driver.findElement(upload_bank_image).sendKeys("D:/3f/Img/passbook.jpeg");
		utilities.MaximumWait(driver);	
	}


	public void check_with_the_Update_bank_details() throws Throwable {
		utilities.webDriverWait(driver, Update_button_clk);
		driver.findElement(Update_button_clk).click();
		utilities.MaximumWait(driver);		
		WebElement toastmessage = driver.findElement(toastmessage_bank_c);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
	}


	public void check_with_the_Actions_by_Approval() throws Throwable {
		utilities.webDriverWait(driver, Actions_perform);
		driver.findElement(Actions_perform).click();
		utilities.MaximumWait(driver);
		driver.findElement(Approval_confirm).click();
		utilities.MaximumWait(driver);

	}



   
}
