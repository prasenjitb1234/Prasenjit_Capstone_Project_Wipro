package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistStep {

	WebDriver driver;
	PageClass pc;

	@Given("Website should open in default browser")
	public void website_should_open_in_default_browser() {
		driver = new ChromeDriver();


		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("Page loads click on searchbar and enter product")
	public void page_loads_click_on_searchbar_and_enter_product() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(2000);
		pc.search();
	}

	@And("view product")
	public void view_product() {
		pc = new PageClass(driver);
		pc.productdescription();
	}

	@And("Add item to Wishlist")
	public void add_item_to_wishlist() {
		pc = new PageClass(driver);
		pc.addtowishlist_in();
	}

	@And("close wishlist popup")
	public void close_wishlist_popup() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]//span[@class=\"close\"]")).click();
	}

	@And("click on wishlist button in navbar")
	public void click_on_wishlist_button_in_navbar() throws InterruptedException {

		pc = new PageClass(driver);
		Thread.sleep(2000);
		pc.wishlist_in();
	}

	@And("remove item from wishlist")
	public void remove_item_from_wishlist() throws InterruptedException {

		pc = new PageClass(driver);
		Thread.sleep(2000);
		pc.removefromwishlist();
	}

	@Then("successful updatation in cart")
	public void successful_updatation_in_cart() {
		driver.close();
	}

}
