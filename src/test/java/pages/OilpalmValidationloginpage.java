package pages;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;


public class OilpalmValidationloginpage extends DriverFactory {
    Utilities utilities = new Utilities();

    By username               = By.xpath("//input[@type='text']");
    By password               = By.xpath("//input[@type='password']");
    By login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
    By validationMessage      = By.xpath("//div[@class='ng-binding alert alert-danger']//self::div");
    By navigation_dashboard   = By.xpath("//section[@class='content-header']");
	By sidebar_cli            = By.xpath("//a[@class='sidebar-toggle']");
    By Snapshot_cli           = By.xpath("//span[text()='Snapshot']");
    By Farmermaster_cli       = By.xpath("//li[@class='ng-scope']/./a[@href='#/farmer']");
    By select_Location_type   = By.xpath("(//div[text()='GeoLocations'])[1]");
	By Side_cli_mouse_over    = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By State_select_cli       = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Option_sel			  = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By Side_clk_mouse_o       = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
    By District_select_cli    = By.xpath("//md-select[@ng-model='GeoLocation.DistrictIds']");
    By Click_mouse_over       = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
    By district_alert         = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']//div");
    By Mandal_select_cli      = By.xpath("(//md-select['@ng-model=GeoLocation.MandalIds'])[4]");
    By Side_clk_mouse         = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
    By Mandal_alert           = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']//div");    
    By village_select_cli     = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
    By side_cl_mouse          = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
    By Village_alert          = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']/div");
  
    
    By State_unselect         = By.xpath("//md-select[@ng-change='onStateChange(GeoLocation.StateIds)']");
    By unselect_check         = By.xpath("(//div[text()='Andhra Pradesh - AP'])[2]");
    By Side_nav_click         = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
    
    By Select_frm_date        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
    By search_btn_cli         = By.xpath("//button[@ng-click='getReport(request)']");
    By Select_Farmer_cl       = By.xpath("(//td[@ng-click='showFarmerDetails(row, $event)'])[3]");
    By Edit_btn               = By.xpath("//button[@ng-click='editFarmerDetails()']");
    By Farmer_Last_name       = By.xpath("//input[@name='FarmerLastName']");
    By Last_name_alert        = By.xpath("(//div[@ng-message='required'])[1]"); 
    By Father_selec           = By.xpath("//input[@ng-model='farmerEdit.GuardianName']");
    By Father_name_alert      = By.xpath("(//div[@ng-message='required'])[2]");
    By Age_click              = By.xpath("//input[@name='Age']");
    By Age_alert              = By.xpath("(//div[@ng-message='required'])[3]");
    By address_check          = By.xpath("//input[@ng-model='farmerEdit.AddressLine1']");
    By address_alert          = By.xpath("(//div[@ng-message='required'])[4]");
    By address_t_check        = By.xpath("//input[@ng-model='farmerEdit.AddressLine2']");
    By address2_alert         = By.xpath("(//div[@ng-message='required'])[5]");
    By State_validation       = By.xpath("//input[@name='StateName']");
    By State_alert_check      = By.xpath("(//div[@ng-message='required'])[6]");
    By District_validation    = By.xpath("//input[@name='DistrictName']");
    By District_alert         = By.xpath("(//div[text()='Required'])[7]");
    By Mandal_validation      = By.xpath("//input[@name='MandalName']");
    By Mandal_alert_c         = By.xpath("(//div[text()='Required'])[8]");
    By Village_validation     = By.xpath("//input[@name='VillageName']");
    By Village_alert_click    = By.xpath("(//div[text()='Required'])[9]");
    By Mobile_no_c            = By.xpath("//input[@ng-model='farmerEdit.ContactNumber']");      
    By mobile_validation      = By.xpath("(//div[@ng-message='required'])[10]");
    By Click_edit_identityp   = By.xpath("//button[@ng-click='editIdentityProof(row)']");
    By update_number_proof    = By.xpath("(//input[@name='IdProofNumber'])[3]");
    By identity_alert         = By.xpath("(//div[@ng-message='required'])[12]");
    By Cancel_btn_c           = By.xpath("//button[@ng-click='cancelIdentityProofEdit(row,rowForm)']");
    By Bank_details_click     = By.xpath("//button[@ng-click='editFarmerBank()']");
    By Bank_account_validate  = By.xpath("//input[@ng-model='BankRequest.AccountNumber']");
    By Bank_acc_alert         = By.xpath("//div[@ng-messages='editBankForm.AccountNumber.$error']//div[1]");
    By Account_hlder_check    = By.xpath("//input[@name='AccountHolderName']");
    By Acc_holder_validate    = By.xpath("//div[@ng-messages='editBankForm.AccountHolderName.$error']");
    By Ifsc_code_check        = By.xpath("//input[@name='IFSCcode']");
    By Ifsc_code_alert        = By.xpath("//div[@ng-messages='editBankForm.IFSCcode.$error']//div");
    By click_cancel_btn       = By.xpath("//button[@ng-click='cancelEditFarmerBank()']");
    
    
    
    public void User_is_login_page() throws Throwable {
        driver.get(prop.getProperty("url"));
        utilities.webDriverWait(driver, login);
        driver.findElement(login).click();
        utilities.MinimumWait(driver);
    }
  public void Check_with_Invalid_Username_and_valid_password() throws Throwable {
        utilities.webDriverWait(driver, username);
        driver.findElement(username).sendKeys("admi");
        driver.findElement(password).sendKeys("P@ssw0rd");
        driver.findElement(login).click();
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(validationMessage);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
    }
 
  
    public void Clicks_on_the_login_button() throws Throwable {
        utilities.webDriverWait(driver, login);
        driver.findElement(login).click();
        driver.findElement(username).clear();
        driver.findElement(password).clear();
        utilities.MaximumWait(driver);
    }

    public void login_with_Valid_credentials() throws Throwable {
        utilities.webDriverWait(driver, username);
        driver.findElement(username).sendKeys("admin");
        driver.findElement(password).sendKeys("P@ssw0rd");
        driver.findElement(login).click();
        utilities.MinimumWait(driver);
        WebElement message = driver.findElement(navigation_dashboard);
        String actualMessage = message.getText().trim(); // Use trim() to remove any leading/trailing spaces
        String expectedMessage = "Dashboard";
        if (expectedMessage.equals(actualMessage)) {
            System.out.println("Screen is navigated to Dashboard :: " + actualMessage);
        } else {
            System.out.println("Screen is not Navigated to Dashboard::" + actualMessage);
        }
    }
	public void Navigate_to_the_Dashboard_page() throws Throwable {
		utilities.webDriverWait(driver, sidebar_cli);
		driver.findElement(sidebar_cli).click();
		utilities.MinimumWait(driver);
	}

	public void user_click_on_the_module_snapshot() throws Throwable {
		utilities.webDriverWait(driver, Snapshot_cli);
		driver.findElement(Snapshot_cli).click();
		utilities.MaximumWait(driver);
		
	}
	public void Click_on_the_Farmermaster_submodule() throws Throwable {
		utilities.webDriverWait(driver, Farmermaster_cli);
		driver.findElement(Farmermaster_cli).click();
		utilities.MaximumWait(driver);
	}
	public void user_select_location_from_the_grid_page() throws Throwable {
		utilities.webDriverWait(driver, select_Location_type );
		driver.findElement(select_Location_type).click();
		utilities.MaximumWait(driver);
		driver.findElement(Side_cli_mouse_over).click();
		utilities.MaximumWait(driver);
	}
	public void select_State_from_Dropdown_option() throws Throwable {
		utilities.webDriverWait(driver, State_select_cli );
		driver.findElement(State_select_cli).click();
		utilities.MaximumWait(driver);
		driver.findElement(Option_sel).click();
		driver.findElement(Side_clk_mouse_o).click();
		utilities.MaximumWait(driver);
		
	}
	public void click_on_the_District_Select_option() throws Throwable {
		utilities.webDriverWait(driver, District_select_cli );
		driver.findElement(District_select_cli).click();
		utilities.MaximumWait(driver);
		driver.findElement(Click_mouse_over).click();
		utilities.MaximumWait(driver);
		   WebElement message = driver.findElement(district_alert);
	        String actualMessage = message.getText();

	        // Print the validation message
	        System.out.println("Validation message: " + actualMessage);
	}
	public void check_with_the_Mandal_select() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_cli );
		driver.findElement(Mandal_select_cli).click();
		utilities.MaximumWait(driver);
		driver.findElement(Side_clk_mouse).click();
		utilities.MaximumWait(driver);
		  WebElement message = driver.findElement(Mandal_alert);
	        String actualMessage = message.getText();

	        // Print the validation message
	        System.out.println("Validation message: " + actualMessage);
	}
	public void check_with_the_Village_select() throws Throwable {
		utilities.webDriverWait(driver, village_select_cli );
		driver.findElement(village_select_cli).click();
		utilities.MaximumWait(driver);
		driver.findElement(side_cl_mouse).click();
		utilities.MaximumWait(driver);
		  WebElement message = driver.findElement(Village_alert);
	        String actualMessage = message.getText();

	        // Print the validation message
	        System.out.println("Validation message: " + actualMessage);
		
	}
	public void Check_with_the_fromdate_update() throws Throwable {
		utilities.webDriverWait(driver, Select_frm_date );
		driver.findElement(Select_frm_date).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Select_frm_date).sendKeys("01/03/2023");
		utilities.MaximumWait(driver);
	driver.findElement(State_unselect).click();
		utilities.MaximumWait(driver);
        driver.findElement(unselect_check).click();
		utilities.MaximumWait(driver);
       driver.findElement(Side_nav_click).click();
		utilities.MaximumWait(driver);


	}
	public void Select_Date_from_the_Calender_view() throws Throwable {
		utilities.webDriverWait(driver, Select_frm_date );
		driver.findElement(Select_frm_date).clear();
		driver.findElement(Select_frm_date).sendKeys("01/03/2023");
		utilities.MaximumWait(driver);
		
	}
	public void Select_farmer_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, search_btn_cli );
		driver.findElement(search_btn_cli).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Select_Farmer_cl );
		driver.findElement(Select_Farmer_cl).click();
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
	public void click_on_the_Edit_action_button() throws Throwable {
		utilities.webDriverWait(driver, Edit_btn );
		driver.findElement(Edit_btn).click();
		utilities.MaximumWait(driver);
	}
	public void check_personal_details_with_Validations() throws Throwable {
		utilities.webDriverWait(driver, Farmer_Last_name );
		driver.findElement(Farmer_Last_name).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Last_name_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void check_with_Father_name_validations() throws Throwable {
		utilities.webDriverWait(driver, Father_selec );
		driver.findElement(Father_selec).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Father_name_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void check_with_Age_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Age_click );
		driver.findElement(Age_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Age_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void Check_with_address_details_Validations() throws Throwable {
		utilities.webDriverWait(driver, address_check );
		driver.findElement(address_check).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(address_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void Check_with_Address2_details_Validations() throws Throwable {
		utilities.webDriverWait(driver, address_t_check );
		driver.findElement(address_t_check).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(address2_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void check_with_State_details_validations() throws Throwable {
		utilities.webDriverWait(driver, State_validation );
		driver.findElement(State_validation).clear();
		  Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(State_alert_check);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void check_with_District_details_validations() throws Throwable {
	    utilities.webDriverWait(driver, District_validation );
	    driver.findElement(District_validation).clear();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(District_alert);
	    String actualMessage = message.getText();
	    // Print the validation message
	    System.out.println("Validation message: " + actualMessage);
	}

	public void check_with_Mandal_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Mandal_validation );
		driver.findElement(Mandal_validation).clear();
	    Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Mandal_alert_c);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void check_with_Village_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Village_validation );
		driver.findElement(Village_validation).clear();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Village_alert_click);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);

	}
	public void check_with_Mobileno_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Mobile_no_c );
		driver.findElement(Mobile_no_c).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mobile_no_c).clear();
		WebElement message = driver.findElement(mobile_validation);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);

	}
	public void check_with_Identityproof_Validations() throws Throwable {
		utilities.webDriverWait(driver, Click_edit_identityp );
		driver.findElement(Click_edit_identityp).click();
		utilities.MaximumWait(driver);
		driver.findElement(update_number_proof).clear();
		WebElement message = driver.findElement(identity_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);

	}
	public void click_on_the_Cancel_action_button() throws Throwable {
		utilities.webDriverWait(driver, Cancel_btn_c );
		driver.findElement(Cancel_btn_c).click();
		utilities.MaximumWait(driver);
		
	}
	public void check_with_the_Bank_update_validations() throws Throwable {
		utilities.webDriverWait(driver, Bank_details_click );
		driver.findElement(Bank_details_click).click();
		utilities.MaximumWait(driver);
	}
	public void check_with_account_no_validations() throws Throwable {
		utilities.webDriverWait(driver, Bank_account_validate );
		driver.findElement(Bank_account_validate).click();
		utilities.MaximumWait(driver);		
		driver.findElement(Bank_account_validate).clear();
		utilities.MaximumWait(driver);		
		WebElement message = driver.findElement(Bank_acc_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);


	}
	public void check_with_Accountholder_name_validations() throws Throwable {
		utilities.webDriverWait(driver, Account_hlder_check );
		driver.findElement(Account_hlder_check).clear();
		utilities.MaximumWait(driver);	
		WebElement message = driver.findElement(Acc_holder_validate);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);

	}
	public void check_with_Ifsc_code_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Ifsc_code_check );
		driver.findElement(Ifsc_code_check).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Ifsc_code_alert);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}
	public void click_on_the_cancel_button_from_updatedetails() throws Throwable {
		utilities.webDriverWait(driver, click_cancel_btn );
		driver.findElement(click_cancel_btn).click();
		utilities.MaximumWait(driver);
	}
	}