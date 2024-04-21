package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import Pagefactory.LoginPage;
import Pagefactory.NewCustomerCreationPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginPage obj=new LoginPage(driver);
	NewCustomerCreationPage obj1=new NewCustomerCreationPage(driver);
	
	
	@Given("User Opens the application")
	public void user_opens_the_application() {
		
		System.out.println("Application Launched");
		addImplicitWait();
	    
	}

	@Given("User enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		obj.enterUsername(username);
		
	    
	}

	@Given("User enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		
		obj.enterPassword(password);
	    
	}

	@When("User clicks on the Submit button")
	public void user_clicks_on_the_submit_button() {
		
		obj.clickOnLogin();
	   
	}

	@Then("User will be navigated to home page of the application")
	public void user_will_be_navigated_to_home_page_of_the_application() {
		
	System.out.println("The Title of Page is "+getTitleOfPage());	
		
		
	    
	}
	
	
	@Given("User will click on the new Customer Link")
	public void user_will_click_on_the_new_customer_link() throws InterruptedException {
		
		obj1.clickOnNewCustomerLink();
	    
	}

	@Given("User will enter the Customer name as {string}")
	public void user_will_enter_the_customer_name_as(String CustomerName) {
		
		obj1.enterCustomername(CustomerName);
		scrollDown();
		
	   
	}

	@Given("User will select gender")
	public void user_will_select_gender() {
		
		obj1.selectGender();
	   
	}

	@Given("User will enter date of birth as {string}")
	public void user_will_enter_date_of_birth_as(String dateOfBirth) {
		
		obj1.enterDateOfBirth(dateOfBirth);
		
	    
	}

	@Given("User will then enter the address as {string}")
	public void user_will_then_enter_the_address_as(String Address) {
		
		obj1.enterAddress(Address);
	   
	}

	@Given("User will then enter the City as {string}")
	public void user_will_then_enter_the_city_as(String City) {
		
		obj1.enterCity(City);
	    
	}

	@Given("User will then enter the State as {string}")
	public void user_will_then_enter_the_state_as(String State) {
		
		obj1.enterState(State);
	    
	}

	@Given("User will then enter the PinCode as {string}")
	public void user_will_then_enter_the_pin_code_as(String Pincode) {
		
		obj1.enterPinCode(Pincode);
		
	   
	}
	
	
	@Given("User will then enter the MobileNumber as {string}")
	public void user_will_then_enter_the_mobile_number_as(String Mobilenumber) {
		
		obj1.entermobileNumber(Mobilenumber);
	    
	}

	@Given("User will then enter the Email as {string}")
	public void user_will_then_enter_the_email_as(String EmailId) {
		
		obj1.enteremailID(EmailId);
	    
	}

	@Given("User will then enter the Password as {string}")
	public void user_will_then_enter_the_password_as(String Password) {
		
		obj1.enterpassowrd(Password);
	   
	}

	@When("User will Click on Submit button")
	public void user_will_click_on_submit_button() throws InterruptedException {
	   
		obj1.clickOnSubmit();
		Thread.sleep(3000);
		
	}

	@Then("User will Fetch the Customer Id")
	public void user_will_fetch_the_customer_id() {
		
	System.out.println(obj1.getCustomerID());	
	   
	}
	
	@AfterTest
	public void closeWebDriver() throws InterruptedException
	{
		Thread.sleep(5000);
		closeDriver();
		
	}
	




}
