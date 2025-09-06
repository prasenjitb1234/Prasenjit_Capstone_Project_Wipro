package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordStep {

	WebDriver driver;
	PageClass pc;

	@Given("user on homepage")
	public void user_on_homepage() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("page loads fully click on log in then  click on myaccount")
	public void page_loads_fully_click_on_log_in_then_click_on_myaccount() throws InterruptedException {
		pc = new PageClass(driver);
		// login 
		pc.clickloginlink_in();
		pc.email_in("prasenjitbhosale01@gmail.com");
		pc.password_in("Bhosale@1234");
		pc.loginbtn_in();

		// click on my account

		pc.myaccount_in();

	}

	@And("click on Change password")
	public void click_on_change_password() {
		pc = new PageClass(driver);
		pc.changepasswordtablink_in();
	}

	@And("click on old password and add existing password")
	public void click_on_old_password_and_add_existing_password() {
		pc = new PageClass(driver);
		pc.oldpasswordchange_in();
	}

	@And("click on new password and add new password")
	public void click_on_new_password_and_add_new_password() {
		pc = new PageClass(driver);
		pc.newpasswordchange_in();
	}

	@And("click on confirm new password and add new confirm password")
	public void click_on_confirm_new_password_and_add_new_confirm_password() {
		pc = new PageClass(driver);
		pc.confirmnewpasswordchange_in();
	}
	
	@And("click on change password button")
	public void click_on_change_password_button() {
		pc = new PageClass(driver);
		pc.changepassbtn_in();
	}

	@Then("successfull changed password")
	public void successfull_changed_password() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
