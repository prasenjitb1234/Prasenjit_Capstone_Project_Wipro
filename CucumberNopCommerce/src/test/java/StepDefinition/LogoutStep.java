package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStep {

	WebDriver driver;
	PageClass pc;

	@Given("page should open in default browser")
	public void page_should_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pc = new PageClass(driver);
	}

	@When("the page loads first login to the website")
	public void the_page_loads_first_login_to_the_website() throws InterruptedException {

		pc = new PageClass(driver);
		pc.clickloginlink_in();
		
		Thread.sleep(3000);
		pc.email_in("prasenjitbhosale1234@gmail.com");
		pc.password_in("Bhosale@1234");
		
		Thread.sleep(2000);
		pc.loginbtn_in();

	}

	@When("click on Logout button")
	public void click_on_logout_button() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(3000);
		pc.logoutbtn_in();
	}

	@Then("successfully logged out")
	public void successfully_logged_out() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
	}

}
