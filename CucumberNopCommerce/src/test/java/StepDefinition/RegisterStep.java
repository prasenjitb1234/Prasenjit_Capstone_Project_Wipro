package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {
	
    WebDriver driver;
    PageClass pc;

    @Given("Register page should open in default browser")
    public void register_page_should_open_in_default_browser() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pc = new PageClass(driver);
    }

    @When("Page Loads click on Register button")
    public void page_loads_click_on_register_button() {
        pc.clickregisterlink_in();
    }

    @And("Select Gender")
    public void select_gender() {
        pc.gender_in();
    }

    @And("^click on First Name and add (.*)$")
    public void click_on_first_name_and_add(String fname) {
        pc.fname_in(fname);
    }

    @And("^click on Last Name and add (.*)$")
    public void click_on_last_name_and_add(String lname) {
        pc.lname_in(lname);
    }

    @And("^click on Email and add (.*)$")
    public void click_on_email_and_add(String email) {
        pc.email_in_register(email);
    }

    @And("^click on Company and add (.*)$")
    public void click_on_company_and_add(String company) {
        pc.company_in(company);
    }

    @And("^click on Password and add (.*)$")
    public void click_on_password_and_add(String password) {
        pc.password_in_register(password);
    }

    @And("^click on Confirm Password and enter (.*)$")
    public void click_on_confirm_password_and_enter(String confirmPassword) {
        pc.confirmPassword_in(confirmPassword);
    }

    @And("click on Register Button")
    public void click_on_register_button() {
        pc.registerbtn_in();
    }

    @And("click on continue button to navigate to home page")
    public void click_on_continue_button_to_navigate_to_home_page() {
        pc.continuebtn_in();
    }

    @Then("Successfully Registered and open home page")
    public void successfully_registered_and_open_home_page() {
        System.out.println("User registered successfully!");
        driver.quit();
    }

}
