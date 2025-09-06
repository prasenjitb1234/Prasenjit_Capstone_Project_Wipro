package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveFromCartStep {

	WebDriver driver;
	PageClass pc;

	@Given("Open Website and hover check shopping cart")
	public void open_website_and_hover_check_shopping_cart() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pc = new PageClass(driver);
	}

	@When("Page loads first login to the website for smooth cart flow")
	public void page_loads_first_login_to_the_website_for_smooth_cart_flow() throws InterruptedException {
		pc = new PageClass(driver);
		pc.clickloginlink_in();
		pc.email_in("prasenjitbhosale1234@gmail.com");
		pc.password_in("Bhosale@1234");
		pc.loginbtn_in();
	}

	@When("Hover over shopping cart and click on go to cart")
	public void hover_over_shopping_cart_and_click_on_go_to_cart() {
		pc = new PageClass(driver);

//		pc.search();
//		Thread.sleep(3000);
//		pc.productdescription();
//		Thread.sleep(3000);
//		pc.addtocart_in();
//		Thread.sleep(3000);
//		pc.closepopup();
//		Thread.sleep(3000);

		// above things we comment when run with test runner but not when individual run
		pc.shoppingcart_in();
	}

	@And("Click on remove product cross button")
	public void click_on_remove_product_cross_button() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(3000);
		pc.removefromcartbtn_in();
	}

	@Then("successful item removed from cart")
	public void successful_item_removed_from_cart() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}

}
