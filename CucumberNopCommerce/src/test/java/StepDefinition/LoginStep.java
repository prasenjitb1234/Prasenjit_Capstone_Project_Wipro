//package StepDefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStep {
//
//	WebDriver driver;
//	PageClass pc;
//	
//	@Given("Login Page should open in default browser")
//	public void login_page_should_open_in_default_browser() {
//		
//		driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		pc = new PageClass(driver);
//		
//	}
//
//	@When("Page Loads click on Log In Button")
//	public void page_loads_click_on_log_in_button() throws InterruptedException {
//		pc.clickloginlink_in();
//	}
//
//	@And("click on email and enter email")
//	public void click_on_email_and_enter_email() {
//		pc.email_in();
//	}
//
//	@And("click on password and enter password")
//	public void click_on_password_and_enter_password() throws InterruptedException {
//		pc.password_in();
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() throws InterruptedException {
//		pc.loginbtn_in();
//	}
//
//	@Then("successfully logged and open home page")
//	public void successfully_logged_and_open_home_page() {
////		driver.close();
//	}
//
//}

//***********

package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.*;

public class LoginStep {

    WebDriver driver;
    PageClass pc;

    @Given("Login Page should open in default browser")
    public void login_page_should_open_in_default_browser() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pc = new PageClass(driver);
    }

    @When("Page Loads click on Log In Button")
    public void page_loads_click_on_log_in_button() throws InterruptedException {
        pc.clickloginlink_in();
    }

    @And("click on email and enter {string}")
    public void click_on_email_and_enter_email(String email) {
    	System.out.println("Entered email : "+email);
        pc.email_in(email);
    }

    @And("click on password and enter {string}")
    public void click_on_password_and_enter_password(String password) throws InterruptedException {
        System.out.println("entered password : "+password);
    	pc.password_in(password);
        
        
    }

    @And("click on login button")
    public void click_on_login_button() throws InterruptedException {
        pc.loginbtn_in();
    }

    @Then("login successful and {string}")
    public void login_successful_and_status(String status) {
        String actualResult = "";
        try {
            
            driver.findElement(By.linkText("Log out"));
            actualResult = "true";
        } catch (Exception e) {
           
            actualResult = "false";
        }
        Assert.assertEquals(status, actualResult);
        driver.close();
    }
}
