
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
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	// logout locator :

	By logoutbtn = By.xpath("//a[@class='ico-logout']");

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

	// ************* Login *************
	public void clickloginlink_in() {
		wait.until(ExpectedConditions.elementToBeClickable(loginlink)).click();
	}

	public void email_in(String emailText) {
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		emailField.clear();
		emailField.sendKeys(emailText);
	}

	public void password_in(String passwordText) {
		WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		passField.clear();
		passField.sendKeys(passwordText);
	}

	public void loginbtn_in() {
		wait.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();
	}

	// ************* Register *************
	public void clickregisterlink_in() {
		wait.until(ExpectedConditions.elementToBeClickable(registerlink)).click();
	}

	public void gender_in() {
		wait.until(ExpectedConditions.elementToBeClickable(gender)).click();
	}

	public void fname_in(String fnameText) {
		WebElement fnameField = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		fnameField.clear();
		fnameField.sendKeys(fnameText);
	}

	public void lname_in(String lnameText) {
		WebElement lnameField = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		lnameField.clear();
		lnameField.sendKeys(lnameText);
	}

	public void email_in_register(String emailText) {
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		emailField.clear();
		emailField.sendKeys(emailText);
	}

	public void company_in(String companyText) {
		WebElement companyField = wait.until(ExpectedConditions.visibilityOfElementLocated(company));
		companyField.clear();
		companyField.sendKeys(companyText);
	}

	public void password_in_register(String passwordText) {
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		passwordField.clear();
		passwordField.sendKeys(passwordText);
	}

	public void confirmPassword_in(String confirmPasswordText) {
		WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPassword));
		confirmPasswordField.clear();
		confirmPasswordField.sendKeys(confirmPasswordText);
	}

	public void registerbtn_in() {
		wait.until(ExpectedConditions.elementToBeClickable(registerbtn)).click();
	}

	public void continuebtn_in() {
		wait.until(ExpectedConditions.elementToBeClickable(continuebtn)).click();
	}

	public boolean isLoggedIn() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(myaccountbtn));
			return true;
		} catch (Exception e) {
			return false;
		}
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

	// *********** Product Description ***************
	public void productdescription() {
		WebElement productDesc = wait.until(ExpectedConditions.elementToBeClickable(productdescription));
		productDesc.click();
	}

	// *********** Add to cart ***************
	public void addtocart_in() {
		WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(addtocartbtn));
		addToCartBtn.click();
	}

	// ***** Close popup ***************
	public void closepopup() {
		WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(closepopupbtn));
		closeBtn.click();
	}

	// *********** Shopping Cart *******

	public void shoppingcart_in() {
		Actions act = new Actions(driver);

		WebElement shoppingcartHover = wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingcart));
		act.moveToElement(shoppingcartHover).perform();

		WebElement goToCart = wait.until(ExpectedConditions.elementToBeClickable(gotocartbtn));
		goToCart.click();
	}
	// ********* remove item from cart

	public void removefromcartbtn_in() {
		WebElement removeBtn = wait.until(ExpectedConditions.elementToBeClickable(removefromcartbtn));
		removeBtn.click();
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

	// ****** ***** Change Adddress ******* ********

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
		WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(addressfname));
		firstName.clear();
		firstName.sendKeys("Prasenjit");

		WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(addresslname));
		lastName.clear();
		lastName.sendKeys("Bhosale");

		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(addressemail));
		emailField.clear();
		emailField.sendKeys("prasenjitbhosale1234@gmail.com");

		WebElement companyField = wait.until(ExpectedConditions.visibilityOfElementLocated(addresscompany));
		companyField.clear();
		companyField.sendKeys("Wipro");

		WebElement countrydropdown = wait.until(ExpectedConditions.elementToBeClickable(addresscountrydropdown));
		new Select(countrydropdown).selectByValue("104"); // India

		WebElement statedropdown = wait.until(ExpectedConditions.elementToBeClickable(addressstatedropdown));
		new Select(statedropdown).selectByVisibleText("Maharashtra");

		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(addresscity));
		city.clear();
		city.sendKeys("Pune");

		WebElement address1 = wait.until(ExpectedConditions.visibilityOfElementLocated(addressprimary));
		address1.clear();
		address1.sendKeys("Generic Sociaty, M.K Gandhi Road");

		WebElement address2 = wait.until(ExpectedConditions.visibilityOfElementLocated(addresssecondary));
		address2.clear();
		address2.sendKeys("near D. Y Patil Stadium");

		WebElement zip = wait.until(ExpectedConditions.visibilityOfElementLocated(addresszipcode));
		zip.clear();
		zip.sendKeys("415001");

		WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(addressphonenumber));
		phone.clear();
		phone.sendKeys("1234567890");
	}

	public void savebtn_in() {
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(savebtnaddress));
		saveBtn.click();
	}

	// ********* change password *********************************

	public void changepasswordtablink_in() {
		WebElement changePasswordTab = wait.until(ExpectedConditions.elementToBeClickable(changepasswordtablink));
		changePasswordTab.click();
	}

	public void oldpasswordchange_in() {
		WebElement oldPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(oldpasswordchange));
		oldPasswordField.clear();
		oldPasswordField.sendKeys("bhosale@1234");
	}

	public void newpasswordchange_in() {
		WebElement newPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(newpasswordchange));
		newPasswordField.clear();
		newPasswordField.sendKeys("Bhosale@1234");
	}

	public void confirmnewpasswordchange_in() {
		WebElement confirmNewPasswordField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(confirmnewpasswordchange));
		confirmNewPasswordField.clear();
		confirmNewPasswordField.sendKeys("Bhosale@1234");
	}

	public void changepassbtn_in() {
		WebElement changePassButton = wait.until(ExpectedConditions.elementToBeClickable(changepassbtn));
		changePassButton.click();
	}

	// ********* checkout *********************************

	public void checkboxterms_in() {
		WebElement termsCheckbox = wait.until(ExpectedConditions.elementToBeClickable(termsofservicecheckbox));
		termsCheckbox.click();
	}

	public void checkoutbtn_in() {
		WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(checkoutbtn));
		checkoutButton.click();
	}

	public void continuecheckoutbtn_in() throws InterruptedException {

		WebElement continueCheckoutButton = wait.until(ExpectedConditions.elementToBeClickable(continuecheckoutbtn));
		continueCheckoutButton.click();

	}

	public void continueshippingcheckoutbtn_in() {
		WebElement continueShippingButton = wait
				.until(ExpectedConditions.elementToBeClickable(continuenextstepcheckoutbtn));
		continueShippingButton.click();
	}

	public void continuepaymentbtn_in() {
		WebElement continuePaymentButton = wait.until(ExpectedConditions.elementToBeClickable(conntinuepaymentbtn));
		continuePaymentButton.click();
	}

	public void continuePaymentinformationbtn_in() {
		WebElement continuePaymentInfoButton = wait
				.until(ExpectedConditions.elementToBeClickable(continuePaymentinformationbtn));
		continuePaymentInfoButton.click();
	}

	public void confirmcheckoutbtn_in() {
		WebElement confirmCheckoutButton = wait.until(ExpectedConditions.elementToBeClickable(confirmcheckoutbtn));
		confirmCheckoutButton.click();
	}

	public void orderdetailspagelink_in() {
		WebElement orderDetailsLink = wait.until(ExpectedConditions.elementToBeClickable(orderdetailspagelink));
		orderDetailsLink.click();
	}

	public void viewAllorderinformationpage_in() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
	}

	public void allOrderspage_in() {
		WebElement allOrdersLink = wait.until(ExpectedConditions.elementToBeClickable(allorderslink));
		allOrdersLink.click();
	}

//	***************** Compare Product button ***********************************

	public void compareprodbtn_in() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement compareBtn = wait.until(ExpectedConditions.elementToBeClickable(compareproductbtn));
		compareBtn.click();
	}

	public void compareproductlisttab_in() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement compareTab = wait.until(ExpectedConditions.elementToBeClickable(compareproductlisttab));
		compareTab.click();
	}

	// ***************** logout button ***********************************

	public void logoutbtn_in() throws InterruptedException {

		WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(logoutbtn));
		logout.click();
	}

}
