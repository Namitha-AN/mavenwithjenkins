package packagename.ProjectName;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzProductPage {
	@FindBy(xpath="//span[@class='a-button a-button-groupfirst a-spacing-none a-button-base a-declarative']")
	WebElement wishlist;
	@FindBy(linkText="View Your List")
	WebElement viewurcart;
	@FindBy(xpath="//a[@class='a-button-text a-text-center']")
	WebElement addtocart;
	@FindBy(linkText="View Cart")
	WebElement viewcart;
	

	public void wishlist(WebDriver driver)
	{
		Set<String> pcid=driver.getWindowHandles();
		Iterator<String> i2=pcid.iterator();
		String parentid=i2.next();
		String childid=i2.next();
		driver.switchTo().window(childid);
		wishlist.click();
	}
	
	public void viewurcart()
	{
		viewurcart.click();
	}
	
	public void addtocart()
	{
		addtocart.click();
	}
	
	public void viewcart()
	{
		viewcart.click();
	}
	
	
	public AmzProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);		
	}
}
