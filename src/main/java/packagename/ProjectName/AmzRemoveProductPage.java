package packagename.ProjectName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzRemoveProductPage {
	WebDriver driver;
	@FindBy(xpath="//span[@class='a-size-small sc-action-delete']")
	WebElement removeproduct;

	public void removeproductfromcart()
	{
		removeproduct.click();
	}
		
	public AmzRemoveProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);		
	}
}


