package packagename.ProjectName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAddressPage {
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[.='Your Account']")
	WebElement YourAccount;
	@FindBy(xpath="(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[4]")
	WebElement YourAddress;
	@FindBy(id="ya-myab-plus-address-icon")
	WebElement AddAddress;

	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement Fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement MobileNumber;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement Pincode;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement Houseno;
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement Area;
	@FindBy(id="address-ui-widgets-landmark")
	WebElement Landmark;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement City;
	@FindBy(xpath="//span[@id='address-ui-widgets-form-submit-button']")
	WebElement AddtheAddress;
	
	//step 2
	public void youraccount()
	{
		YourAccount.click();
	}
	public void youraddress()
	{
		YourAddress.click();
	}
	public void addaddress()
	{
		AddAddress.click();
	}
	
	public void fullname()
	{
		Fullname.sendKeys("Namitha yadne");
	}
	public void mobilenumber()
	{
		MobileNumber.sendKeys("7022933501");
	}
	public void pincode()
	{
		Pincode.sendKeys("560076");
	}
	public void houseno()
	{
		Houseno.sendKeys("3rd floor,Gratia#25/A,6th cross");
	}
	public void area()
	{
		Area.sendKeys("Yellenhalli Main Road, Akshaya Nagar East,Akshaynagar");
	}
	public void landmark()
	{
		Landmark.sendKeys("Near Balaji medows");
	}
	public void city()
	{
		City.sendKeys("Bangalore");
	}
	public void addtheaddress()
	{
		AddtheAddress.click();
	}
	
	//step 3
	public AmazonAddressPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);		
	}

	
}
