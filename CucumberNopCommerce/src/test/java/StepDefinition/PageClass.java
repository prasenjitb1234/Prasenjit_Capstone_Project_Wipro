
package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {

	WebDriver driver;
	WebDriverWait wait;

	public PageClass(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// logout locator :

	By logoutbtn = By.xpath("//li/a[text()=\"Log out\"]");

	// locators login :
	By loginlink = By.linkText("Log in");
	By email = By.id("Email");
	By password = By.id("Password");
	By loginbtn = By.xpath("//button[@class=\"button-1 login-button\"]");

//	// locator register
//
	By registerlink = By.linkText("Register");
	By gender = By.xpath("//input[@id=\"gender-male\"]");

	By fname = By.id("FirstName");
	By lname = By.id("LastName");
	By company = By.id("Company");
	By confirmPassword = By.id("ConfirmPassword");
	By registerbtn = By.id("register-button");
	By continuebtn = By.xpath("//a[@class=\"button-1 register-continue-button\"]");

	// locator search

	By searchbar = By.xpath("//input[@id=\"small-searchterms\"]");
	By searchbtn = By.xpath("//button[@class=\"button-1 search-box-button\"]");

	/// locator product description

	By productdescription = By.partialLinkText("Apple iPhone 16 128GB");

	// locator close popup

	By closepopupbtn = By.xpath("//span[@class=\"close\"]");

	// locator - cart

	By addtocartbtn = By.xpath("//button[@id=\"add-to-cart-button-21\"]");

	By shoppingcart = By.xpath("//span[@class=\"cart-label\"]");

	By gotocartbtn = By.cssSelector("button[class=\"button-1 cart-button\"]");

//	By removefromcartbtn = By.cssSelector("input[id=\"removefromcart3\"]");
	By removefromcartbtn = By.xpath("//button[@class=\"remove-btn\"]");

	// Locator - Change currency

	By changecurrencydropdown = By.cssSelector("select[id=\"customerCurrency\"]");

	// Locator - Wishlist

	By addtowishlistbtn = By.xpath("//button[@id='add-to-wishlist-button-21']");
	By removewishlistbtn = By.cssSelector("button[class=\"remove-btn\"]");

	By wishlist = By.xpath("//span[@class=\"wishlist-label\"]");

	// Locator My Account

	By myaccountbtn = By.xpath("//a[@class=\"ico-account\"]");

	// address

	By addressesbtn = By.linkText("Addresses");

	By addnewaddressbtn = By.xpath("//button[@class=\"button-1 add-address-button\"]");

	By addressfname = By.xpath("//input[@name=\"Address.FirstName\"]");
	By addresslname = By.xpath("//input[@name=\"Address.LastName\"]");
	By addressemail = By.xpath("//input[@name=\"Address.Email\"]");
	By addresscompany = By.xpath("//input[@name=\"Address.Company\"]");
	By addresscountrydropdown = By.xpath("//select[@id=\"Address_CountryId\"]");
	// select : option value of india : value="104"

	By addressstatedropdown = By.xpath("//select[@name=\"Address.StateProvinceId\"]");
	// select : option value of maharashtra : value="859"

	By addresscity = By.xpath("//input[@id=\"Address_City\"]");

	By addressprimary = By.xpath("//input[@id=\"Address_Address1\"]");
	By addresssecondary = By.xpath("//input[@id=\"Address_Address2\"]");
	By addresszipcode = By.xpath("//input[@id=\"Address_ZipPostalCode\"]");
	By addressphonenumber = By.xpath("//input[@id=\"Address_PhoneNumber\"]");
	By savebtnaddress = By.xpath("//button[@class=\"button-1 save-address-button\"]");

	// Locator change password

	By changepasswordtablink = By.linkText("Change password");
	By oldpasswordchange = By.xpath("//input[@id=\"OldPassword\"]");
	By newpasswordchange = By.xpath("//input[@id=\"NewPassword\"]");
	By confirmnewpasswordchange = By.xpath("//input[@id=\"ConfirmNewPassword\"]");
	By changepassbtn = By.xpath("//button[@class=\"button-1 change-password-button\"]");

	// Locator checkout :

	By termsofservicecheckbox = By.xpath("//input[@id=\"termsofservice\"]");
	By checkoutbtn = By.xpath("//button[@class=\"button-1 checkout-button\"]");
	By continuecheckoutbtn = By.xpath("//button[@class=\"button-1 new-address-next-step-button\"][1]");
	By continuenextstepcheckoutbtn = By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
	By conntinuepaymentbtn = By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");
	By continuePaymentinformationbtn = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");
	By confirmcheckoutbtn = By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");
	By orderdetailspagelink = By.linkText("Click here for order details.");

	By allorderslink = By.linkText("Orders");

	// Locator compare product :

	By compareproductbtn = By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]");
	By compareproductlisttab = By.linkText("Compare products list");

//	---------------------------------------------------------------------------

	// ************* login ***************
	public void clickloginlink_in() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(loginlink).click();
	}

	// this for register
	public void email_in() {
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
//		emailField.sendKeys("prasenjitbhosale1234@gmail.com");
//		emailField.sendKeys("prasenjitbhosale111@gmail.com");
//		emailField.sendKeys("spiderman01@gmail.com");
		emailField.sendKeys("prasenjit07@gmail.com");

	}

	// this for login
	public void email_in(String emailText) {
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		emailField.clear();
		emailField.sendKeys(emailText);
	}

	// this for register
	public void password_in() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(password).click();
		driver.findElement(password).sendKeys("Bhosale@1234");
	}

	// this for login
	public void password_in(String passwordText) throws InterruptedException {
		Thread.sleep(1000);
		WebElement passField = driver.findElement(password);
		passField.clear();
		passField.sendKeys(passwordText);
	}

	public void loginbtn_in() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(loginbtn).click();
	}

//************* register ***************
	public void clickregisterlink_in() {
		driver.findElement(registerlink).click();
	}

	public void gender_in() {
		driver.findElement(gender).click();
	}

	public void fname_in() {
		driver.findElement(fname).click();
		driver.findElement(fname).sendKeys("Prasenjit");
	}

	public void lname_in() {
		driver.findElement(lname).click();
		driver.findElement(lname).sendKeys("Bhosale");
	}

	public void company_in() {
		driver.findElement(company).click();
		driver.findElement(company).sendKeys("Wipro");
	}

	public void confirmPassword_in() {
		driver.findElement(confirmPassword).click();
		driver.findElement(confirmPassword).sendKeys("Bhosale@1234");
	}

	public void registerbtn_in() {
		
		driver.findElement(registerbtn).click();
	}

	public void continuebtn_in() {
		WebElement contBtn = wait.until(ExpectedConditions.elementToBeClickable(continuebtn));
		contBtn.click();
	}

//	*********** search Multiple***************

	public void searchMultiple(String item) {
		driver.findElement(searchbar);
		driver.findElement(searchbar).sendKeys(item);
		driver.findElement(searchbtn).sendKeys(Keys.ENTER);
	}

//	*********** search single ***************

	public void search() {
		driver.findElement(searchbar);
		driver.findElement(searchbar).sendKeys("iphone");
		driver.findElement(searchbtn).sendKeys(Keys.ENTER);
	}

//	*********** Product Description ***************

	public void productdescription() {
		driver.findElement(productdescription).click();
	}

//	*********** Add to cart ***************

	public void addtocart_in() {

		driver.findElement(addtocartbtn).click();

	}

	public void closepopup() {
		WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(closepopupbtn));
		closeBtn.click();
	}

	public void shoppingcart_in() {
		Actions act = new Actions(driver);
		WebElement shoppingcarthover = driver.findElement(shoppingcart);
		act.moveToElement(shoppingcarthover).build().perform();

		WebElement gotocart = driver.findElement(gotocartbtn);
		gotocart.click();

	}

	// ********* remove item from cart

	public void removefromcartbtn_in() {
		driver.findElement(removefromcartbtn).click();
	}

	// ********* change currency dropdown

	public void changecurrencydropdown_in() {

		WebElement currencyDropdown = wait.until(ExpectedConditions.elementToBeClickable(changecurrencydropdown));
		Select select = new Select(currencyDropdown);
		select.selectByVisibleText("Euro");

	}

	public void addtowishlist_in() {
		WebElement wishlistBtn = wait.until(ExpectedConditions.elementToBeClickable(addtowishlistbtn));
		wishlistBtn.click();
	}

	public void wishlist_in() throws InterruptedException {
		Thread.sleep(2000);
		WebElement wish = wait.until(ExpectedConditions.elementToBeClickable(wishlist));
		wish.click();
	}

	public void removefromwishlist() {
		WebElement removeBtn = wait.until(ExpectedConditions.elementToBeClickable(removewishlistbtn));
		removeBtn.click();
	}

//	***********  Change Address           *******

	public void myaccount_in() {
		WebElement myaccount = wait.until(ExpectedConditions.elementToBeClickable(myaccountbtn));
		myaccount.click();
	}

	public void addresses_in() {
		WebElement addresses = wait.until(ExpectedConditions.elementToBeClickable(addressesbtn));
		addresses.click();
	}

	public void addnewaddressbtn_in() {
		WebElement addnew = wait.until(ExpectedConditions.elementToBeClickable(addnewaddressbtn));
		addnew.click();
	}

	public void newfilladdress_in() {

		driver.findElement(addressfname).sendKeys("Prasenjit");
		driver.findElement(addresslname).sendKeys("Bhosale");
		driver.findElement(addressemail).sendKeys("prasenjitbhosale1234@gmail.com");
		driver.findElement(addresscompany).sendKeys("Wipro");

		WebElement countrydropdown = wait.until(ExpectedConditions.elementToBeClickable(addresscountrydropdown));
		Select select = new Select(countrydropdown);
		select.selectByValue("104"); // india

		WebElement statedropdown = wait.until(ExpectedConditions.elementToBeClickable(addressstatedropdown));
		Select select1 = new Select(statedropdown);
		select1.selectByVisibleText("Maharashtra"); // maharashtra

		driver.findElement(addresscity).sendKeys("Pune");
		driver.findElement(addressprimary).sendKeys("Generic Sociaty,  M.K Gandhi Road");
		driver.findElement(addresssecondary).sendKeys("near D. Y Patil Stadium");

		driver.findElement(addresszipcode).sendKeys("415001");
		driver.findElement(addressphonenumber).sendKeys("1234567890");

	}

	public void savebtn_in() {
		driver.findElement(savebtnaddress).click();
	}

	// ********* change password *********************************

	public void changepasswordtablink_in() {
		driver.findElement(changepasswordtablink).click();
	}

	public void oldpasswordchange_in() {
		driver.findElement(oldpasswordchange).click();
		driver.findElement(oldpasswordchange).sendKeys("bhosale@1234");
	}

	public void newpasswordchange_in() {
		driver.findElement(newpasswordchange).click();
		driver.findElement(newpasswordchange).sendKeys("Bhosale@1234");
	}

	public void confirmnewpasswordchange_in() {
		driver.findElement(confirmnewpasswordchange).click();
		driver.findElement(confirmnewpasswordchange).sendKeys("Bhosale@1234");
	}

	public void changepassbtn_in() {
		driver.findElement(changepassbtn).click();
	}

	// ********* checkout *********************************

	public void checkboxterms_in() {
		driver.findElement(termsofservicecheckbox).click();

	}

	public void checkoutbtn_in() {
		driver.findElement(checkoutbtn).click();
	}

	public void continuecheckoutbtn_in() {
		driver.findElement(continuecheckoutbtn).click();
	}

	public void continueshippingcheckoutbtn_in() {
		driver.findElement(continuenextstepcheckoutbtn).click();
	}

	public void continuepaymentbtn_in() {
		driver.findElement(conntinuepaymentbtn).click();
	}

	public void continuePaymentinformationbtn_in() {
		driver.findElement(continuePaymentinformationbtn).click();
	}

	public void confirmcheckoutbtn_in() {
		driver.findElement(confirmcheckoutbtn).click();
	}

	public void orderdetailspagelink_in() {
		driver.findElement(orderdetailspagelink).click();
	}

	public void viewAllorderinformationpage_in() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
	}

	public void allOrderspage_in() {
		driver.findElement(allorderslink).click();
	}

//	***************** Compare Product button ***********************************

	public void compareprodbtn_in() {
		driver.findElement(compareproductbtn).click();
	}

	public void compareproductlisttab_in() {
		driver.findElement(compareproductlisttab).click();
	}

	// ***************** logout button ***********************************

	public void logoutbtn_in() throws InterruptedException {
		WebElement logout = driver.findElement(logoutbtn);
		Thread.sleep(1000);
		logout.click();
	}

//	***************************************************************************


}
