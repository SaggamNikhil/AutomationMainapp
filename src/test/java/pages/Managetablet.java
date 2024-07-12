package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Managetablet extends DriverFactory{
	Utilities utilities        =   new Utilities();
	By username            = By.xpath("//input[@type='text']");
	By password            = By.xpath("//input[@type='password']");
	By Login               = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard           = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat      = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module     = By.xpath("//span[text()='Settings']");
	By User_menu           = By.xpath("//span[text()='User']");
	By Manage_tablet_nav   = By.xpath("//a[@href='#/tablet']");
	By Add_tablet_btn      = By.xpath("//button[@ng-click='addNewTablet()']");
	By Imei_number_ip      = By.xpath("//input[@ng-model='tablet.IMEINumber']");
	By Imei_toast_msg      = By.xpath("//div[@ng-messages='addForm.IMEINumber.$error']");
	By Imei_number_two_ip  = By.xpath("//input[@ng-model='tablet.IMEINumber2']");
	By Brand_name_ip       = By.xpath("//input[@ng-model='tablet.BrandName']");
	By Brand_name_toast    = By.xpath("//div[@ng-messages='addForm.BrandName.$error']");
	By Save_button_click   = By.xpath("//button[@aria-label='Save']");
	By Pagination_click    = By.xpath("//span[text()='32']");
    By Edit_button_click   = By.xpath("(//button[@ng-click='editTablet(row)'])[1]");
    By Brand_name_edit     = By.xpath("//input[@ng-model='rowEdit.BrandName']");
    By Update_button_click = By.xpath("//button[@aria-label='Update']");
	
	public void User_is_on_login_page_of_oilpalm_projects() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		utilities.MaximumWait(driver);
	}

	public void The_User_enter_with_the_valid_username_and_password_inputs_data_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);		
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_home_main_menu_pages_details() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void verfiy_with_the_click_on_the_Settings_modules() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(User_menu).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_click_on_the_Manage_tablet_screen() throws Throwable {
		utilities.webDriverWait(driver, Manage_tablet_nav);
		driver.findElement(Manage_tablet_nav).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_clicking_on_the_Add_tablet_action_button() throws Throwable {
		utilities.webDriverWait(driver, Add_tablet_btn);
		driver.findElement(Add_tablet_btn).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_IMEI_number_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Imei_number_ip);
		driver.findElement(Imei_number_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Imei_number_ip).sendKeys("There were a couple of tools123");
		utilities.MaximumWait(driver);
		driver.findElement(Imei_number_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Imei_toast_msg);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "There were a couple of tools123";
		driver.findElement(Imei_number_ip).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(Imei_number_ip).getAttribute("value");
		int actualLength = inputValue.length();
		int expectedMaxLength = 30;
		System.out.println("Input value length: " + actualLength);
		System.out.println("Input value: " + inputValue);

		if (actualLength == expectedMaxLength) {
			System.out.println("Maximum length validation passed.");
		} else {
			System.out.println(
					"Maximum length validation failed. Expected: " + expectedMaxLength + ", Actual: " + actualLength);
		}
		driver.findElement(Imei_number_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Imei_number_ip).sendKeys("Sss534121341345");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_IMEI_number_two_input_details_validations() throws Throwable {
		utilities.webDriverWait(driver, Imei_number_two_ip);
		driver.findElement(Imei_number_two_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Imei_number_two_ip).sendKeys("There were a couple of tools123");
		utilities.MaximumWait(driver);
		String maxLengthInput = "There were a couple of tools123";
		driver.findElement(Imei_number_two_ip).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(Imei_number_two_ip).getAttribute("value");
		int actualLength = inputValue.length();
		int expectedMaxLength = 30;
		System.out.println("Input value length: " + actualLength);
		System.out.println("Input value: " + inputValue);

		if (actualLength == expectedMaxLength) {
			System.out.println("Maximum length validation passed.");
		} else {
			System.out.println(
					"Maximum length validation failed. Expected: " + expectedMaxLength + ", Actual: " + actualLength);
		}
		driver.findElement(Imei_number_two_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Imei_number_two_ip).sendKeys("73112312312312");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Brand_name_input_details() throws Throwable {
		utilities.webDriverWait(driver, Brand_name_ip);
		driver.findElement(Brand_name_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Brand_name_ip).sendKeys("There were a couple of tools out there, but none of them met ");
		utilities.MaximumWait(driver);
		driver.findElement(Brand_name_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Brand_name_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		String maxLengthInput = "There were a couple of tools out there, but none of";
		driver.findElement(Brand_name_ip).sendKeys(maxLengthInput);
		utilities.MaximumWait(driver);
		String inputValue = driver.findElement(Brand_name_ip).getAttribute("value");
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
		driver.findElement(Brand_name_ip).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Brand_name_ip).sendKeys("Samsungs automatio");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Save_action_button_input_details() throws Throwable {
		utilities.webDriverWait(driver, Save_button_click);
		driver.findElement(Save_button_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Click_on_the_Edit_action_button() throws Throwable {
		utilities.webDriverWait(driver, Pagination_click);
		driver.findElement(Pagination_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Edit_button_click).click();
		utilities.MaximumWait(driver);
        driver.findElement(Brand_name_edit).click();
		utilities.MaximumWait(driver);
        driver.findElement(Brand_name_edit).sendKeys("on");
		utilities.MaximumWait(driver);
		driver.findElement(Update_button_click).click();
		utilities.MaximumWait(driver);


	}

	}
	

