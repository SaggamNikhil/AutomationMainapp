package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class ClusterTarget extends DriverFactory {
	Utilities utilities                 = new Utilities();
	By username                         = By.xpath("//input[@type='text']");
	By password                         = By.xpath("//input[@type='password']");
	By Login                            = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard                        = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat                   = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module                  = By.xpath("//span[text()='Settings']");
	By KRA_menu_click                   = By.xpath("(//i[@class='fa fa-user']/../span)[3]");
	By Cluster_KRA_navigation           = By.xpath("//a[@href='#/setTarget']");
	By Search_Cluster_click             = By.xpath("//input[@aria-label='Search  Cluster']");
	By Auto_suggestions                 = By.xpath("(//ul[@class='md-autocomplete-suggestions autocomplete-custom-template']/li)[1]");
	By Edit_action_button               = By.xpath("//button[@ng-click='monthlyTarget(row)']");
	By update_month_details             = By.xpath("//input[@ng-model='userMonthlyTargets[7].MonthlyTarget']");
	By Save_updated_details             = By.xpath("//button[@ng-click='addMonthlyTarget(userMonthlyTargets)']");
	By View_monthly_target              = By.xpath("//button[@ng-click='ViewmonthlyTarget(row)']");
	By Cancel_window                    = By.xpath("//button[@ng-click='cancel()']");
	
	
	public void User_is_login_page_of_oilpalm_project_screens() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.MaximumWait(driver);
	}

	public void The_Users_enters_with_the_verify_username_and_password_inputs_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_Main_menu_details_screens() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void verify_with_the_click_on_the_Settings_modules_navigate_menu() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(KRA_menu_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_navigated_to_the_Cluster_KRA_screen() throws Throwable {
		utilities.webDriverWait(driver, Cluster_KRA_navigation);
		driver.findElement(Cluster_KRA_navigation).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Search_cluster_criteria() throws Throwable {
		utilities.webDriverWait(driver, Search_Cluster_click);
        WebElement searchField = driver.findElement(Search_Cluster_click);
        searchField.sendKeys("Cha");
        utilities.MaximumWait(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
            System.out.println("Number of suggestions found: " + suggestions.size());
            for (WebElement suggestion : suggestions) {
                System.out.println("Suggestion text: " + suggestion.getText());
                if (suggestion.getText().contains("Cha")) {
                    suggestion.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception while waiting for suggestions: " + e.getMessage());
        }
        utilities.MaximumWait(driver);


	}

	public void verify_with_actions_by_Edit_button_click() throws Throwable {
		utilities.webDriverWait(driver, Edit_action_button);
		driver.findElement(Edit_action_button).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_update_Monthly_target_popup_details() throws Throwable {
		utilities.webDriverWait(driver, update_month_details);
		driver.findElement(update_month_details).click();
		utilities.MaximumWait(driver);
		driver.findElement(update_month_details).clear();
		utilities.MaximumWait(driver);
		driver.findElement(update_month_details).sendKeys("95.00");
		utilities.MaximumWait(driver);
		driver.findElement(Save_updated_details).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_View_monthly_target_details() throws Throwable {
		utilities.webDriverWait(driver, View_monthly_target);
		driver.findElement(View_monthly_target).click();
		utilities.MaximumWait(driver);
		driver.findElement(Cancel_window).click();
		utilities.MaximumWait(driver);
	}

}
