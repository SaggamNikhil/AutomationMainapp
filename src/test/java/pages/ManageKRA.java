package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ManageKRA extends DriverFactory{
	Utilities utilities    = new Utilities();
	By username            = By.xpath("//input[@type='text']");
	By password            = By.xpath("//input[@type='password']");
	By Login               = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard           = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat      = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module     = By.xpath("//span[text()='Settings']");
    By KRA_menu            = By.xpath("(//i[@class='fa fa-user']/../span)[3]");
    By Mange_kra_menu      = By.xpath("//a[@href='#/kra']");
    By Tabel_headers       = By.xpath("(//thead//tr)[1]");
    By Edit_button_click   = By.xpath("(//button[@ng-click='editKra(row)'])[1]");
	
	public void User_first_login_page_of_oilpalm_project_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		utilities.MaximumWait(driver);
	}

	public void The_Users_enters_the_valid_inputs_for_username_and_password() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_main_menu_screens() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void verify_with_the_click_on_the_Settings_menu_module() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(KRA_menu).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_Manage_KRA_menu_screen() throws Throwable {
		utilities.webDriverWait(driver, Mange_kra_menu);
		driver.findElement(Mange_kra_menu).click();
		utilities.MaximumWait(driver);
		driver.findElement(Tabel_headers).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Tabel_headers);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);

	}

	public void verify_with_the_click_on_the_Edit_action_button() throws Throwable {
		utilities.webDriverWait(driver, Edit_button_click);
		driver.findElement(Edit_button_click).click();
		utilities.MaximumWait(driver);
	}
}
