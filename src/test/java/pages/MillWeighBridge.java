package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class MillWeighBridge extends DriverFactory{
	Utilities utilities        =   new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard               = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat          = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module         = By.xpath("//span[text()='Settings']");
	By User_menu               = By.xpath("//span[text()='User']");
	By Mill_weighbridge        = By.xpath("//a[@href='#/millWeighbridge']");
	By Add_mill_weighbridge    = By.xpath("//button[@ng-click='addMillWeighBridge()']");
	By Name_input              = By.xpath("//input[@ng-model='AddMillWB.Name']");
	By Name_toast              = By.xpath("//div[@ng-messages='addForm.Name.$error']");
	By Users_input             = By.xpath("//md-select[@ng-model='AddMillWB.User']");
	By User_toast              = By.xpath("//div[@ng-messages='addForm.User.$error']");
	By User_opt_one            = By.xpath("//div[text()='155- Adinarayana Toleti']");
	By User_opt_two            = By.xpath("//div[text()='1- admin admin']");
	By Location_click          = By.xpath("//md-select[@ng-model='AddMillWB.Location']");
	By Save_button             = By.xpath("//button[@ng-click='addNewMillWeighBridge(addForm)']");
	By Edit_button             = By.xpath("(//button[@ng-click='editMillWeighBridge(row)'])[1]");
	By Is_automatic_check      = By.xpath("//md-checkbox[@ng-model='allData.IsAutomatic']");
	By Click_update_btn        = By.xpath("//button[@ng-click='editMillWeigh(allData)']");
	
	public void User_is_on_login_page_with_oilpalm_project_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.MaximumWait(driver);	
	}

	public void The_Users_enters_with_the_valid_username_and_password_inputs_data() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);	
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_menu() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void verify_with_the_click_on_the_Settings_module_from_the_Dashboard() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(User_menu).click();
		utilities.MaximumWait(driver);
	}

	public void verify_with_the_click_on_the_Mill_weighbridge_screen() throws Throwable {
		utilities.webDriverWait(driver, Mill_weighbridge);
		driver.findElement(Mill_weighbridge).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_Add_Mill_weighbridge_action_button() throws Throwable {
		utilities.webDriverWait(driver, Add_mill_weighbridge);
		driver.findElement(Add_mill_weighbridge).click();
		utilities.MaximumWait(driver);
	}

	public void validate_with_the_Name_input_field_from_the_popup_screen() throws Throwable {
		utilities.webDriverWait(driver, Name_input);
		driver.findElement(Name_input).sendKeys("Ram sr");
		utilities.MaximumWait(driver);
		driver.findElement(Name_input).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Name_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "Character Counter is a 100% free online character c";
		driver.findElement(Name_input).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(Name_input).getAttribute("value");
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
		driver.findElement(Name_input).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Name_input).sendKeys("Rama wb-t");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_User_Dropdown_field_from_the_popup_screen() throws Throwable {
		utilities.webDriverWait(driver, Users_input);
		driver.findElement(Users_input).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(User_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
        driver.findElement(Users_input).click();
		utilities.MaximumWait(driver);
		driver.findElement(User_opt_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(User_opt_two).click();
		Robot l = new Robot();
	    l.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);	
	}

	public void check_with_the_location_dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, Location_click);
		driver.findElement(Location_click).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		Robot k = new Robot();
	    k.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Click_on_the_save_action_button() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Click_on_the_active_grid_Edit_action_button() throws Throwable {
		utilities.webDriverWait(driver, Edit_button);
		driver.findElement(Edit_button).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Is_Automatic_check_box_selection_input() throws Throwable {
		utilities.webDriverWait(driver, Is_automatic_check);
		driver.findElement(Is_automatic_check).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_update_action_button() throws Throwable {
		utilities.webDriverWait(driver, Click_update_btn);
		driver.findElement(Click_update_btn).click();
		utilities.MaximumWait(driver);
	}

}
