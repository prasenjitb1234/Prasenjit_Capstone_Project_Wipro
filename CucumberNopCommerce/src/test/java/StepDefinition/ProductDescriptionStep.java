package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDescriptionStep {

	WebDriver driver;
	PageClass pc;
	
	@Given("open website for view product")
	public void open_website_for_view_product() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Page loads click on search enter item and search")
	public void page_loads_click_on_search_enter_item_and_search() {
		pc = new PageClass(driver);
		pc.search();
	}

	@When("click on product")
	public void click_on_product() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		pc = new PageClass(driver);
		pc.productdescription();
	}

	@Then("successful viewed product description")
	public void successful_viewed_product_description() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.close();
	}

}
