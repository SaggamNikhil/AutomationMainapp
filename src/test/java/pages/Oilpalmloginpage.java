package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Oilpalmloginpage extends DriverFactory {
	Utilities utilities    = new Utilities();

	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Otpafter_sub           = By.xpath("//button[@ng-click='submit(login)']");
	By validationMessage      = By.xpath("//div[@class='ng-binding alert alert-danger']//self::div");
	By Dash_board_message     = By.xpath("//section[@class='content-header']");
	
	
	
	
	public void User_is_on_login_screen() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);

	}

	public void User_enter_username_and_password() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);

	}

	public void Clicks_With_the_logins_button() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
		
	}
	public void Check_with_the_Invalid_Username_and_valid_password() throws Throwable {
        utilities.webDriverWait(driver, username);
        driver.findElement(username).sendKeys("admi");
        driver.findElement(password).sendKeys("P@ssw0rd");
        driver.findElement(Login).click();
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(validationMessage);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
    }
 
  
    public void Clicks_on_the_login_button() throws Throwable {
        utilities.webDriverWait(driver, Login);
        driver.findElement(Login).click();
        driver.findElement(username).clear();
        driver.findElement(password).clear();
        utilities.MaximumWait(driver);
    }
	public void Click_on_the_Otp_submit_button() throws Throwable {
	   utilities.webDriverWait(driver,Otpafter_sub);
	   driver.findElement(Otpafter_sub).click();
	   utilities.MinimumWait(driver);
		
	}
	public void Navigate_to_the_Dashboard_falsh_screen() throws Throwable {
		utilities.webDriverWait(driver, Dash_board_message);
		driver.findElement(Dash_board_message).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dash_board_message);
        String actualMessage = message.getText();

        // Print the validation message
        System.out.println("Validation message: " + actualMessage);
	}



	
}
