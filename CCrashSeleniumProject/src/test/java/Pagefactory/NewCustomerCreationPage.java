package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerCreationPage extends BaseClass {
	
	WebDriver driver;
	
	public NewCustomerCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement NewCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement customerName;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pinnumber;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobilenumber;
	
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit;
	
	@FindBy(xpath="//table[@id='customer']/tbody/tr[4]/td[2]")
	WebElement getcustomerID;
	
	
	public void clickOnNewCustomerLink() throws InterruptedException
	{
		NewCustomer.click();
		Thread.sleep(5000);
	}
	
	public void enterCustomername(String CustomerName)
	{
		customerName.sendKeys(CustomerName);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void enterDateOfBirth(String dateOfBirth)
	{
		dOB.sendKeys(dateOfBirth);
	}
	
	public void enterAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	
	public void enterCity(String City)
	{
		city.sendKeys(City);
	}
	
	public void enterState(String State)
	{
		state.sendKeys(State);
	}
	
	public void enterPinCode(String Pincode)
	{
		pinnumber.sendKeys(Pincode);
	}
	
	public void entermobileNumber(String Mobilenumber)
	{
		mobilenumber.sendKeys(Mobilenumber);
	}
	
	public void enteremailID(String EmailId)
	{
		emailId.sendKeys(EmailId);
	}
	
	public void enterpassowrd(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}
	
	public String  getCustomerID()
	{
		String CustomerID=getcustomerID.getText();
		return CustomerID;
	}
	
	
}
