package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStep {

	WebDriver driver;
	PageClass pc;

	@Given("Open Website and add to cart")
	public void open_website_and_add_to_cart() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Page loads login to website")
	public void page_loads_login_to_website() throws InterruptedException {

		pc = new PageClass(driver);
		Thread.sleep(2000);
		pc.clickloginlink_in();
		Thread.sleep(3000);
		pc.email_in("prasenjitbhosale1234@gmail.com");
		pc.password_in("Bhosale@1234");
		Thread.sleep(2000);
		pc.loginbtn_in();

	}

	@And("click on searchbar then  enter an item and search")
	public void click_on_searchbar_then_enter_an_item_and_search() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(2000);
		pc.search();
	}

	@And("open and view product")
	public void open_and_view_product() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(2000);
		pc.productdescription();
	}

	@And("add item to cart")
	public void add_item_to_cart() throws InterruptedException {
		pc = new PageClass(driver);
		Thread.sleep(3000);
		pc.addtocart_in();
		Thread.sleep(2000);
		pc.closepopup();
		Thread.sleep(2000);
	}

	@And("go to cart")
	public void go_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		pc.shoppingcart_in();
	}

	@Then("successful add item to cart")
	public void successful_add_item_to_cart() throws InterruptedException {
		System.out.println("Item added to cart ");
		Thread.sleep(4000);
		driver.close();
	}

}
