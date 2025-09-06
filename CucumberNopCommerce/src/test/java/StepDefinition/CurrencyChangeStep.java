package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.junit.Assert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CurrencyChangeStep {

	WebDriver driver;
	PageClass pc;

	@Given("open website and currencybox available")
	public void open_website_and_currencybox_available() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Page Loads click on Currency Change Dropdown and select currency")
	public void page_loads_click_on_currency_change_dropdown_and_select_currency() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(3000);
		pc.changecurrencydropdown_in();

	}

	@Then("Successful changed currency")
	public void successful_changed_currency() throws InterruptedException {

		Thread.sleep(3000);

		driver.quit();

	}

}
