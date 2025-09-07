package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompareProductStep {

	WebDriver driver;
	PageClass pc = new PageClass(driver);

	@Given("open website to compare")
	public void open_website_to_compare() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		pc = new PageClass(driver);
	}

	@When("Page loads hover on computers and go to notebooks")
	public void page_loads_hover_on_computers_and_go_to_notebooks() throws InterruptedException {
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);		
		WebElement computer = driver.findElement(By.linkText("Computers"));
		act.moveToElement(computer).build().perform();

		Thread.sleep(3000);
		WebElement notebook = driver.findElement(By.linkText("Notebooks"));
		act.moveToElement(notebook).build().perform();
		notebook.click();

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
	}

	@And("add first product to compare")
	public void add_first_product_to_compare() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		WebElement firstprod = driver.findElement(By.linkText("HP Envy 15.6-Inch Sleekbook"));
		firstprod.click();
		Thread.sleep(1000);
		pc.compareprodbtn_in();

		driver.navigate().back();

	}

	@And("add second product to compare")
	public void add_second_product_to_compare() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
		WebElement secondprod = driver.findElement(By.linkText("HP Spectre XT Pro UltraBook"));

		secondprod.click();
		Thread.sleep(1000);
		pc.compareprodbtn_in();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);

	}

	@And("go to compare products list and wait and scroll down")
	public void go_to_compare_products_list_and_wait_and_scroll_down() throws InterruptedException {

		pc.compareproductlisttab_in();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	@Then("successfully compared product")
	public void successfully_compared_product() throws InterruptedException {

		Thread.sleep(6000);
		driver.close();

	}

}
