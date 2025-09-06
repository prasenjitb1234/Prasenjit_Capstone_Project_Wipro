package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewAddressStep {

	WebDriver driver;
	PageClass pc;

	@Given("Website must open in default browser")
	public void website_must_open_in_default_browser() {

		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("Page Loads Login and click on My Account")
	public void page_loads_login_and_click_on_my_account() throws InterruptedException {
		pc = new PageClass(driver);
		pc.clickloginlink_in();
		pc.email_in("prasenjitbhosale1234@gmail.com");
		pc.password_in("Bhosale@1234");
		pc.loginbtn_in();

		// click on my account

		Thread.sleep(3000);
		pc.myaccount_in();

	}

	@And("click on addresses")
	public void click_on_addresses() {
		pc = new PageClass(driver);
		pc.addresses_in();
	}

	@And("click on add new Button")
	public void click_on_add_new_button() {
		pc = new PageClass(driver);
		pc.addnewaddressbtn_in();
	}

	@And("fill address information")
	public void fill_address_information() {
		pc = new PageClass(driver);
		pc.newfilladdress_in();
	}

	@And("click on save button")
	public void click_on_save_button() {
		pc = new PageClass(driver);
		pc.savebtn_in();

	}

	@Then("successful add a new address")
	public void successful_add_a_new_address() {
		driver.close();
	}

}
