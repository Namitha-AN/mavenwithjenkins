package packagename.ProjectName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzEditAddress {
		WebDriver driver;
		//step 1
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
		@FindBy(xpath="(//span[@class='a-button a-button-primary continue-button primary-action-button celwidget'])[2]")
		WebElement usethisaddress;
		
		//step 2
		public void fullname()
		{
			Fullname.clear();
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
			Houseno.clear();
			Houseno.sendKeys("3rd floor,Gratia#25/A,6th cross");
		}
		public void area()
		{
			Area.clear();
			Area.sendKeys("Yellenhalli Main Road, Akshaya Nagar East,Akshaynagar");
		}
		public void landmark()
		{
			Landmark.clear();
			Landmark.sendKeys("Near Balaji medows");
		}
		public void city()
		{
			City.clear();
			City.sendKeys("Bangalore");
		}
		public void usethisaddress()
		{
			usethisaddress.click();
		}
		
		//step 3
		public AmzEditAddress(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);		
		}

		
	}




