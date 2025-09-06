package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStep {

	WebDriver driver;
	PageClass pc;

	@Given("open website in default browser")
	public void open_website_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Page loads click login account")
	public void page_loads_click_login_account() throws InterruptedException {

		pc = new PageClass(driver);
		// login
		pc.clickloginlink_in();
		pc.email_in("prasenjitbhosale1234@gmail.com");
		pc.password_in("Bhosale@1234");
		pc.loginbtn_in();

	}

	@And("search an item")
	public void search_an_item() {
		pc = new PageClass(driver);
		pc.search();
	}

	@And("open product description")
	public void open_product_description() throws InterruptedException {
		pc = new PageClass(driver);
		pc.productdescription();
		Thread.sleep(2000);
	}

	@And("add that product to cart and go to cart")
	public void add_that_product_to_cart_and_go_to_cart() throws InterruptedException {
		pc = new PageClass(driver);
		pc.addtocart_in();
		Thread.sleep(2000);
		pc.closepopup();
		Thread.sleep(3000);

		// go to cart :
		pc.shoppingcart_in();
		Thread.sleep(2000);
	}

	@And("click on checkbox of terms of service")
	public void click_on_checkbox_of_terms_of_service() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		pc = new PageClass(driver);
		pc.checkboxterms_in();

	}

	@And("click on checkout button")
	public void click_on_checkout_button() {
		pc = new PageClass(driver);
		pc.checkoutbtn_in();
	}

	@And("click on continue button billing addresss step")
	public void click_on_continue_button_billing_addresss_step() {
		pc = new PageClass(driver);
		pc.continuecheckoutbtn_in();
	}

	@And("click on continue button shipping method step")
	public void click_on_continue_button_shipping_method_step() {
		pc = new PageClass(driver);
		pc.continueshippingcheckoutbtn_in();
	}

	@And("click on continue button payment method step")
	public void click_on_continue_button_payment_method_step() {
		pc = new PageClass(driver);
		pc.continuepaymentbtn_in();
	}

	@And("click on continue button payment information step")
	public void click_on_continue_button_payment_information_step() {
		pc = new PageClass(driver);
		pc.continuePaymentinformationbtn_in();
	}

	@And("click on confirm button confirm order step")
	public void click_on_confirm_button_confirm_order_step() {
		pc = new PageClass(driver);
		pc.confirmcheckoutbtn_in();
	}

	@And("click on order details link")
	public void click_on_order_details_link() {
		pc = new PageClass(driver);
		pc.orderdetailspagelink_in();
	}

	@And("view order information page")
	public void view_order_information_page() {
		pc = new PageClass(driver);
		pc.viewAllorderinformationpage_in();
	}

	@And("see all your order in all orders page")
	public void see_all_your_order_in_all_orders_page() {
		pc = new PageClass(driver);
		pc.allOrderspage_in();

	}

	@Then("successful checked out item")
	public void successful_checked_out_item() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
	}

}
