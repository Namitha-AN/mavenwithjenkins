package packagename.ProjectName;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzHomePage {
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountsandlist;
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement SearchProduct;
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	//step 2
	public void hoveroveronAccountsandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountsandlist).perform();
	}
	//signin
	public void signin_click()
	{
		signin.click();
	}
	
	public void searchproduct()
	{
		SearchProduct.sendKeys("Shoes"+Keys.ENTER);
	}
	
	public void signout()
	{
		signout.click();
	}
	
	//step 3
	public AmzHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);		
	}
	
	
}
