package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	WebDriver driver;
	PageClass pc;

	@Given("Login User and search bar available")
	public void login_user_and_search_bar_available() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("^Enter (.*) and click search button$")
	public void enter_item_and_click_search_button(String item) {
		pc = new PageClass(driver);
		pc.searchMultiple(item);

	}

	@Then("list of output relevant to input")
	public void list_of_output_relevant_to_input() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.close();
	}

}
