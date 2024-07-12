package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Grader extends DriverFactory{
	Utilities utilities        =   new Utilities();
	By username            = By.xpath("//input[@type='text']");
	By password            = By.xpath("//input[@type='password']");
	By Login               = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard           = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat      = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module     = By.xpath("//span[text()='Settings']");
	By User_menu           = By.xpath("//span[text()='User']");
	By Grader_menu         = By.xpath("//a[@href='#/Grader']");
    By Add_grader_button   = By.xpath("//button[@ng-click='addGrader()']"); 
    By Name_input_click    = By.xpath("//input[@id='Name']");
    By Name_ip_toast       = By.xpath("//div[@ng-messages='addForm.Name.$error']");
    By mobile_number_ip    = By.xpath("//input[@ng-model='AddG.MobileNumber']");
    By mobile_no_toast     = By.xpath("//div[@ng-messages='addForm.MobileNumber.$error']");
    By Villages_click      = By.xpath("//md-select[@ng-model='AddG.VillageId']");
    By Villages_toast      = By.xpath("//div[@ng-messages='addForm.VillageId.$error']");
    By village_option_sel  = By.xpath("//div[text()='AB- Amberpeta']");
    By Collectioncenter_c  = By.xpath("//md-select[@name='CollectionCenterCode']");
    By Without_collec_ip   = By.xpath("//div[@ng-messages='addForm.CollectionCenterCode.$error']");
    By Select_collec_cen_o = By.xpath("//div[text()='CCAPNLJ- AGRI-CC-AP-WG-Nallajerla ']");
    By Select_collec_cen_t = By.xpath("//div[text()='CCAPAYV- AGRI-CC-AP-WG-Ayyavaram']");
    By Save_button_click   = By.xpath("//button[@ng-click='addNewGrader()']");
    By Edit_button_click   = By.xpath("(//button[@ng-click='editGrader(row)'])[1]");
    By Update_click        = By.xpath("//button[@ng-click='updateGrader(allData)']");
    By pagination_check    = By.xpath("//span[text()='4']");
    By delete_button       = By.xpath("(//button[@aria-label='Delete'])[10]");
    By Del_confirmation    = By.xpath("//button[@ng-click='dialog.hide()']");
    
	public void User_is_on_login_page_screen_of_oilpalm_link_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		utilities.MaximumWait(driver);
	}

	public void The_User_enters_with_the_valid_username_and_password_inputs_data_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);		
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_home_menus_details() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void check_with_the_click_on_the_Settings_modules_name() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);		
	}

	public void check_with_the_Click_on_the_Users_module_name() throws Throwable {
		utilities.webDriverWait(driver, User_menu);
		driver.findElement(User_menu).click();
		utilities.MaximumWait(driver);	
	}

	public void check_with_the_Click_on_the_Grader_module_screen() throws Throwable {
		utilities.webDriverWait(driver, Grader_menu);
		driver.findElement(Grader_menu).click();
		utilities.MaximumWait(driver);	
	}

	public void check_with_the_click_on_the_Add_grader_action_button() throws Throwable {
		utilities.webDriverWait(driver, Add_grader_button);
		driver.findElement(Add_grader_button).click();
		utilities.MaximumWait(driver);	
		utilities.webDriverWait(driver, Name_input_click);
		driver.findElement(Name_input_click).sendKeys("Ram sr");
		utilities.MaximumWait(driver);
		driver.findElement(Name_input_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Name_ip_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "A while back I needed to count the amount of letters";
		driver.findElement(Name_input_click).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(Name_input_click).getAttribute("value");
		int actualLength = inputValue.length();
		int expectedMaxLength = 50;
		System.out.println("Input value length: " + actualLength);
		System.out.println("Input value: " + inputValue);

		if (actualLength == expectedMaxLength) {
			System.out.println("Maximum length validation passed.");
		} else {
			System.out.println(
					"Maximum length validation failed. Expected: " + expectedMaxLength + ", Actual: " + actualLength);
		}
		driver.findElement(Name_input_click).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Name_input_click).sendKeys("Srihanuman");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Mobile_number_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, mobile_number_ip);
		driver.findElement(mobile_number_ip).sendKeys("Ram 11 sr");
		utilities.MaximumWait(driver);
		driver.findElement(mobile_number_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(mobile_no_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "1234567892138";
		driver.findElement(mobile_number_ip).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(mobile_number_ip).getAttribute("value");
		int actualLength = inputValue.length();
		int expectedMaxLength = 12;
		System.out.println("Input value length: " + actualLength);
		System.out.println("Input value: " + inputValue);

		if (actualLength == expectedMaxLength) {
			System.out.println("Maximum length validation passed.");
		} else {
			System.out.println(
					"Maximum length validation failed. Expected: " + expectedMaxLength + ", Actual: " + actualLength);
		}
		driver.findElement(mobile_number_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(mobile_number_ip).sendKeys("4965448817");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_select_village_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Villages_click);
		driver.findElement(Villages_click).click();
		utilities.MaximumWait(driver);	
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);	
	    WebElement message = driver.findElement(Villages_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);	
        driver.findElement(Villages_click).click();
		utilities.MaximumWait(driver);	
        driver.findElement(village_option_sel).click();
		utilities.MaximumWait(driver);		
	}
	public void check_with_the_collection_center_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Collectioncenter_c);
		driver.findElement(Collectioncenter_c).click();
		utilities.MaximumWait(driver);	
        driver.findElement(Select_collec_cen_o).click();
		utilities.MaximumWait(driver);	
		driver.findElement(Select_collec_cen_t).click();
		utilities.MaximumWait(driver);	
		Robot k = new Robot();
	    k.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);	

	}

	public void check_with_the_click_on_the_save_button_input_details() throws Throwable {
		utilities.webDriverWait(driver, Save_button_click);
		driver.findElement(Save_button_click).click();
		utilities.MaximumWait(driver);	

	}

	public void check_with_the_Click_on_the_Edit_button_from_the_active_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Edit_button_click);
		driver.findElement(Edit_button_click).click();
		utilities.MaximumWait(driver);	
		driver.findElement(Name_input_click).clear();
		utilities.MaximumWait(driver);	
		driver.findElement(Name_input_click).sendKeys("Grader New auto three");
		utilities.MaximumWait(driver);	
		
	}

	public void check_with_the_update_details_and_click_on_the_Update_button() throws Throwable {
		utilities.webDriverWait(driver, Update_click);
		driver.findElement(Update_click).click();
		utilities.MaximumWait(driver);	
	}

	public void check_with_the_delete_action_button_from_the_grid_details() throws Throwable {
		utilities.webDriverWait(driver, pagination_check);
		driver.findElement(pagination_check).click();
		utilities.MaximumWait(driver);	
		driver.findElement(delete_button).click();
		utilities.MaximumWait(driver);	
		driver.findElement(Del_confirmation).click();
		utilities.MaximumWait(driver);	
	}
}
