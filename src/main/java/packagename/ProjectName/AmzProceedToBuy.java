package packagename.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzProceedToBuy {
	WebDriver driver;
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-span12 a-button-primary']")
	WebElement proceedtobuy;

	public void proceedtobuy()
	{
		proceedtobuy.click();
	}
		
//	@FindBy(xpath="//a[@id='edit-address-desktop-tango-sasp-0']")
//	WebElement EditAddress;
//
//	public void editaddress()
//	{
//		EditAddress.click();
//	}
	public AmzProceedToBuy(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);		
	}
}


