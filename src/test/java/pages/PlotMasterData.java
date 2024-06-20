package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class PlotMasterData extends DriverFactory{
	Utilities utilities       = new Utilities();
	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                = By.xpath("//a[@class='sidebar-toggle']");
	By snapshot               = By.xpath("//span[text()='Snapshot']");
	By PlotMasterData_click   = By.xpath("//a[@href='#/masterData']");
	By Sel_location           = By.xpath("//md-select[@name='GeoLocations']");
	By Location_sel           = By.xpath("(//div[text()='GeoLocations'])[2]");
	By State_sel_check        = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By State_sel_opt          = By.xpath("//div[text()='AP - Andhra Pradesh']");
	By State_sel_opt_two      = By.xpath("//div[text()='AR - Arunachal Pradesh']");
	By District_sel_check     = By.xpath("(//md-select[@multiple='true'])[2]");
	By District_no_input_sel  = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Dist_sel_opt           = By.xpath("//div[text()='EG - EAST GODAVARI']");
	By Dist_sel_opt_two       = By.xpath("//div[text()='LD - L/Dibang Valley']");
	By Mandal_sel_check       = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandal_no_input_sel    = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mandal_sel_opt         = By.xpath("//div[text()='DA - Devarapalli-II']");
	By Mandal_sel_opt_two     = By.xpath("//div[text()='RN - Roing']");
	By Village_sel_check      = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_no_input_sel   = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By Village_sel_opt        = By.xpath("//div[text()='GO - Gamro']");
	By Village_sel_opt_two    = By.xpath("//div[text()='YG - Yernagudem']");
	By Plot_sel_check         = By.xpath("//md-select[@ng-model='GeoLocation.StatusTypeIds']");
	By Plot_sel_opt           = By.xpath("//div[text()='Approved']");
	By From_date_sel          = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By Invalid_from_date      = By.xpath("//div[@ng-messages='rowForm.FromDate.$error']");
	By Search_btn             = By.xpath("//button[@ng-click='getReport(request)']");
	By Sel_farmer             = By.xpath("//td[@ng-click='showFarmerDetails(row, $event)']");
	By Farmerdetails_Edit     = By.xpath("//button[@ng-click='editFarmerDetails()']");
	By Farmer_first_name_val  = By.xpath("//input[@name='FarmerFirstName']");
	By Farmer_last_name_val   = By.xpath("//input[@name='FarmerLastName']");
	By Farmer_last_name_toast = By.xpath("//div[@ng-messages='farmerForm.FarmerLastName.$error']");
	By Farmer_father_name_ip  = By.xpath("//input[@name='GuardianName']");
	By Farmer_father_toast    = By.xpath("//div[@ng-messages='farmerForm.GuardianName.$error']");
	By Date_of_birth_update   = By.xpath("//input[@class='md-datepicker-input md-input']");
	By Farmer_adddress_one_ip = By.xpath("//input[@name='AddressLine1']");
	By Farmer_address_one_alt = By.xpath("//div[@ng-messages='farmerForm.AddressLine1.$error']");
	By Farmer_address_two_ip  = By.xpath("//input[@name='AddressLine2']");
	By Farmer_address_two_alt = By.xpath("//div[@ng-messages='farmerForm.AddressLine2.$error']");
	By State_selection_check  = By.xpath("//input[@name='StateName']");
	By State_validation_alert = By.xpath("//div[@ng-messages='farmerForm.StateName.$error']");
	By State_sel_filter       = By.xpath("//span[text()='Andhra Pradesh - AP']");
	By District_selection_chk = By.xpath("//input[@name='DistrictName']");
	By District_validation_al = By.xpath("//div[@ng-messages='farmerForm.DistrictName.$error']");
	By District_sel_chng      = By.xpath("//span[text()='EAST GODAVARI - EG']");
	By Mandal_selection_chk   = By.xpath("//input[@name='MandalName']");
	By Mandal_validation_al   = By.xpath("//div[@ng-messages='farmerForm.MandalName.$error']");
	By Mandal_sel_chng        = By.xpath("//span[text()='Devarapalli-II - DA']");
	By Village_selection_chk  = By.xpath("//input[@name='VillageName']");
	By Viilage_validation_al  = By.xpath("//div[@ng-messages='farmerForm.VillageName.$error']");
	By Village_sel_chng       = By.xpath("//span[text()='Chinnaigudem - CG']");
	By Mobile_num_chk         = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");
	By Mobile_num_validation  = By.xpath("//div[@ng-messages='farmerForm.ContactNumber.$error']");
	By Uploaded_image         = By.xpath("//input[@name='fileInputFarmer']");
	By click_save             = By.xpath("//button[@ng-click='updateFarmer(farmerEdit)']");
	By Save_toast_msg         = By.xpath("//div[text()='Farmer Personal Details Updated Successfully']");
	By Identity_details_updt  = By.xpath("//button[@ng-click='editIdentityProof(row)']");
	By Identity_clear         = By.xpath("//div[@ng-messages='rowForm.IdProofNumber.$error']");
	By Identity_number_valid  = By.xpath("(//input[@ng-model='rowEdit.IdProofNumber'])[2]");
	By Proof_Details_update   = By.xpath("//button[@ng-click='updateIdentityProof(rowEdit,rowForm)']");
	By Id_proof_toast_msg     = By.xpath("//div[text()='Farmer Identity proof Details Updated Successfully']");
	By Bank_details_check     = By.xpath("//button[@ng-click='editFarmerBank()']");
	By Account_no_value_click = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
	By Account_no_value_valid = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']");
	By Account_name_value_clk = By.xpath("//input[@ng-model='BankRequest.AccountHolderName']");
	By Account_name_valid     = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
	By Ifsc_code_field_check  = By.xpath("//input[@name='IFSCcode']");
	By Ifsc_code_alert        = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']");
	By Modify_ifsc_code       = By.xpath("//span[text()='SBIN0011663']");
	By upload_bank_img        = By.xpath("//input[@id='fileInput']");
	By Update_button_click    = By.xpath("//button[@ng-disabled='editBankForm.$invalid||!IsValid()']");
	By toastmessage_bank      = By.xpath("//div[text()='Farmer Bank Details Updated Successfully']");
	By Plot_expansion         = By.xpath("//i[@class='fa fa-plus']");


	
	public void First_login_page_with_Respective_user_role() throws Throwable {
			driver.get(prop.getProperty("url"));
			utilities.webDriverWait(driver, Login);
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("admin");
			driver.findElement(password).sendKeys("P@ssw0rd");
			utilities.webDriverWait(driver, Login);
			driver.findElement(Login).click();
			utilities.MinimumWait(driver);
		}
		public void Navigate_to_the_Dashboard_page_screen() throws Throwable {
			utilities.webDriverWait(driver, sidebar);
			driver.findElement(sidebar).click();
			utilities.MinimumWait(driver);
		}
		public void the_user_click_on_the_snapshot_module_screen() throws Throwable {
			utilities.webDriverWait(driver, snapshot);
			driver.findElement(snapshot).click();
			utilities.MinimumWait(driver);
		}
		public void Click_on_the_PlotMasterData_screen() throws Throwable {
			utilities.webDriverWait(driver, PlotMasterData_click);
			driver.findElement(PlotMasterData_click).click();
			utilities.MinimumWait(driver);
		}
		public void check_with_the_Selection_location_Dropdown() throws Throwable {
			utilities.webDriverWait(driver, Sel_location);
			driver.findElement(Sel_location).click();
			utilities.MinimumWait(driver);
			driver.findElement(Location_sel).click();
			utilities.MaximumWait(driver);

		}
		public void Check_with_the_Selection_State_dropdown() throws Throwable {
			utilities.webDriverWait(driver, State_sel_check);
			driver.findElement(State_sel_check).click();
			utilities.MinimumWait(driver);
			driver.findElement(State_sel_opt).click();
			utilities.MinimumWait(driver);
			driver.findElement(State_sel_opt_two).click();
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			utilities.MinimumWait(driver);

		}
		public void check_with_the_District_selection_validations() throws Throwable {
			utilities.webDriverWait(driver, District_sel_check);
			driver.findElement(District_sel_check).click();
			utilities.MinimumWait(driver);
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
		    WebElement message = driver.findElement(District_no_input_sel);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(District_sel_check).click();
			utilities.MinimumWait(driver);
			driver.findElement(Dist_sel_opt).click();
			utilities.MinimumWait(driver);
			driver.findElement(Dist_sel_opt_two).click();
			Robot r1= new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			utilities.MinimumWait(driver);	
		}
		public void check_with_the_Mandal_selection_validations() throws Throwable {
			utilities.webDriverWait(driver, Mandal_sel_check);
			driver.findElement(Mandal_sel_check).click();
			utilities.MinimumWait(driver);
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
		    WebElement message = driver.findElement(Mandal_no_input_sel);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(Mandal_sel_check).click();
			utilities.MinimumWait(driver);
			driver.findElement(Mandal_sel_opt).click();
			utilities.MinimumWait(driver);
			driver.findElement(Mandal_sel_opt_two).click();
			Robot r1= new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			utilities.MinimumWait(driver);
			
		}
		public void Check_with_the_Village_selection_Validations() throws Throwable {
			utilities.webDriverWait(driver, Village_sel_check);
			driver.findElement(Village_sel_check).click();
			utilities.MinimumWait(driver);
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
		    WebElement message = driver.findElement(Village_no_input_sel);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(Village_sel_check).click();
			utilities.MinimumWait(driver);
			driver.findElement(Village_sel_opt).click();
			utilities.MinimumWait(driver);
			driver.findElement(Village_sel_opt_two).click();
			Robot r1= new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			utilities.MinimumWait(driver);
		}
		public void check_with_the_Plot_status_validations() throws Throwable {
			utilities.webDriverWait(driver, Plot_sel_check);
			driver.findElement(Plot_sel_check).click();
			utilities.MinimumWait(driver);
			driver.findElement(Plot_sel_opt).click();
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
			utilities.MaximumWait(driver);
		}
		public void check_with_the_FromDate_selection_Validations() throws Throwable {
			utilities.webDriverWait(driver, From_date_sel);
			driver.findElement(From_date_sel).clear();
			driver.findElement(From_date_sel).sendKeys("01/07/20231");
			utilities.MaximumWait(driver);
			WebElement message = driver.findElement(Invalid_from_date);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(From_date_sel).clear();
			utilities.MaximumWait(driver);
			driver.findElement(From_date_sel).sendKeys("01/07/2023");
			utilities.MaximumWait(driver);
       }
		public void check_with_the_Search_button_click_value() throws Throwable {
			utilities.webDriverWait(driver, Search_btn);
			driver.findElement(Search_btn).click();
			utilities.MaximumWait(driver);
		}
		public void check_with_the_Select_Farmer_from_plotmasterdata_screen() throws Throwable {
			utilities.webDriverWait(driver, Sel_farmer);
		    driver.findElement(Sel_farmer).click();
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
		public void check_with_Farmer_details_screen_Edit_button_action() throws Throwable {
			utilities.webDriverWait(driver, Farmerdetails_Edit);
		    driver.findElement(Farmerdetails_Edit).click();
		    utilities.MaximumWait(driver);
		}
		public void check_with_the_farmer_firstname_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Farmer_first_name_val);
		    driver.findElement(Farmer_first_name_val).clear();
		    utilities.MaximumWait(driver);
		    driver.findElement(Farmer_first_name_val).sendKeys("Farmer !@#");
			utilities.MaximumWait(driver);
		}
		public void check_with_the_farmer_Lastname_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Farmer_last_name_val);
			driver.findElement(Farmer_last_name_val).clear();
			utilities.MaximumWait(driver);
			WebElement message = driver.findElement(Farmer_last_name_toast);
	        String actualMessage = message.getText();
	        System.out.println("Validation message: " + actualMessage);
			driver.findElement(Farmer_last_name_val).sendKeys("Paddy user !@#");
			utilities.MaximumWait(driver);
		}
		public void check_with_the_farmer_fathername_input_validations() throws Throwable {
			utilities.webDriverWait(driver, Farmer_father_name_ip);
			driver.findElement(Farmer_father_name_ip).clear();
			utilities.MaximumWait(driver);
			WebElement message = driver.findElement(Farmer_father_toast);
	        String actualMessage = message.getText();
	        System.out.println("Validation message: " + actualMessage);
			driver.findElement(Farmer_father_name_ip).sendKeys("Rama !@#");
			utilities.MaximumWait(driver);
		}
		public void check_with_the_Dateof_birth_input_validations() throws Throwable {
			utilities.webDriverWait(driver, Date_of_birth_update);
			driver.findElement(Date_of_birth_update).click();
			utilities.MaximumWait(driver);
			driver.findElement(Date_of_birth_update).clear();
			utilities.MaximumWait(driver);
			driver.findElement(Date_of_birth_update).sendKeys("01/01/1998");
			utilities.MaximumWait(driver);

		}
		public void check_with_the_Address_one_input_validations() throws Throwable {
			utilities.webDriverWait(driver, Farmer_adddress_one_ip);
			driver.findElement(Farmer_adddress_one_ip).clear();
			utilities.MaximumWait(driver);		
			WebElement message = driver.findElement(Farmer_address_one_alt);
	        String actualMessage = message.getText();
	        System.out.println("Validation message: " + actualMessage);
	        driver.findElement(Farmer_adddress_one_ip).sendKeys("Street $ one");

		}
		public void check_with_the_Address_two_input_validations() throws Throwable {
			utilities.webDriverWait(driver, Farmer_address_two_ip);
			driver.findElement(Farmer_address_two_ip).clear();
			utilities.MaximumWait(driver);		
			WebElement message = driver.findElement(Farmer_address_two_alt);
	        String actualMessage = message.getText();
	        System.out.println("Validation message: " + actualMessage);
	        driver.findElement(Farmer_address_two_ip).sendKeys("Street $ two");
		}
		public void Check_with_the_State_selection_update_validations() throws Throwable {
			utilities.webDriverWait(driver, State_selection_check);
		    driver.findElement(State_selection_check).clear();
		    utilities.MaximumWait(driver);
		    WebElement message = driver.findElement(State_validation_alert);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(State_selection_check).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(State_sel_filter).click();
		    utilities.MaximumWait(driver);
		}
		public void check_with_the_District_Selection_update_validations() throws Throwable {
			utilities.webDriverWait(driver, District_selection_chk);
		    driver.findElement(District_selection_chk).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(District_sel_chng).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(District_selection_chk).clear();
		    utilities.MaximumWait(driver);
		    WebElement message = driver.findElement(District_validation_al);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(District_selection_chk).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(District_sel_chng).click();
		    utilities.MaximumWait(driver);
			
		}
		public void check_with_the_Mandal_selection_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Mandal_selection_chk);
		    driver.findElement(Mandal_selection_chk).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(Mandal_sel_chng).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(Mandal_selection_chk).clear();
		    utilities.MaximumWait(driver);
		    WebElement message = driver.findElement(Mandal_validation_al);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(Mandal_selection_chk).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(Mandal_sel_chng).click();
		    utilities.MaximumWait(driver);
			
		}
		public void check_with_the_Villages_selection_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Village_selection_chk);
		    driver.findElement(Village_selection_chk).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(Village_sel_chng).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(Village_selection_chk).clear();
		    utilities.MaximumWait(driver);
		    WebElement message = driver.findElement(Viilage_validation_al);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(Village_selection_chk).click();
		    utilities.MaximumWait(driver);
		    driver.findElement(Village_sel_chng).click();
		    utilities.MaximumWait(driver);
		}
		public void check_with_the_Mobile_number_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Mobile_num_chk);
		    driver.findElement(Mobile_num_chk).clear();
		    utilities.MaximumWait(driver);
		    WebElement message = driver.findElement(Mobile_num_validation);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(Mobile_num_chk).sendKeys("3546557870");
		    utilities.MaximumWait(driver);
		}
		public void check_with_the_updated_farmer_image() throws Throwable {
			utilities.webDriverWait(driver, Uploaded_image);
			driver.findElement(Uploaded_image).sendKeys("D:/3f/Img/farmer.jpeg");
			utilities.MaximumWait(driver);
		}
		public void check_with_click_on_the_save_button() throws Throwable {
			utilities.webDriverWait(driver, click_save);
			driver.findElement(click_save).click();
			utilities.MaximumWait(driver);
			WebElement toastmessage = driver.findElement(Save_toast_msg);
			String messageText = toastmessage.getText();
			System.out.println("Toast message: " + messageText);

		}
		public void check_with_the_Identity_proof_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Identity_details_updt);
			driver.findElement(Identity_details_updt).click();
			utilities.MaximumWait(driver);
			driver.findElement(Identity_number_valid).clear();
			WebElement message = driver.findElement(Identity_clear);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			utilities.MaximumWait(driver);
			driver.findElement(Identity_number_valid).sendKeys("266774864566");
			utilities.MaximumWait(driver);
			utilities.webDriverWait(driver, Proof_Details_update);
			driver.findElement(Proof_Details_update).click();
			utilities.MaximumWait(driver);
			WebElement toastmessage = driver.findElement(Id_proof_toast_msg);
			String messageText = toastmessage.getText();
			System.out.println("Toast message: " + messageText);
		}
		public void check_with_Bank_proof_Update_validations() throws Throwable {
			utilities.webDriverWait(driver, Bank_details_check);
			driver.findElement(Bank_details_check).click();
			utilities.MaximumWait(driver);			
		}
		public void check_with_the_Account_num_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Account_no_value_click);
			driver.findElement(Account_no_value_click).clear();
			utilities.MaximumWait(driver);
			WebElement message = driver.findElement(Account_no_value_valid);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(Account_no_value_click).sendKeys("675456789456156");
			utilities.MaximumWait(driver);
		}
		public void check_with_the_Account_name_update_validations() throws Throwable {
			utilities.webDriverWait(driver, Account_name_value_clk);
			driver.findElement(Account_name_value_clk).clear();
			utilities.MaximumWait(driver);
			WebElement message = driver.findElement(Account_name_valid);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(Account_name_value_clk).sendKeys("farmer three");
			utilities.MaximumWait(driver);
		}
		public void check_with_the_Ifsc_code_field_update() throws Throwable {
			utilities.webDriverWait(driver, Ifsc_code_field_check);
			driver.findElement(Ifsc_code_field_check).clear();
			utilities.MaximumWait(driver);
			WebElement message = driver.findElement(Ifsc_code_alert);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(Ifsc_code_field_check).click();
			utilities.MaximumWait(driver);
		    driver.findElement(Modify_ifsc_code).click();
		}
		public void check_with_the_Upload_Image() throws Throwable {
			utilities.webDriverWait(driver, upload_bank_img);
			driver.findElement(upload_bank_img).sendKeys("D:/3f/Img/passbook.jpeg");
			utilities.MaximumWait(driver);	
		}
		public void check_with_the_Bank_Update_button() throws Throwable {
			utilities.webDriverWait(driver, Update_button_click);
			driver.findElement(Update_button_click).click();
			utilities.MaximumWait(driver);		
			WebElement toastmessage = driver.findElement(toastmessage_bank);
			String messageText = toastmessage.getText();
			System.out.println("Toast message: " + messageText);
		}
		public void check_with_the_Plot_details_expansion() throws Throwable {
			utilities.webDriverWait(driver, Plot_expansion);
			driver.findElement(Plot_expansion).click();
			utilities.MaximumWait(driver);	
		}
}
