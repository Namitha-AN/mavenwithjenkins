package packagename.ProjectName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzLoginPage {
	WebDriver driver;
	//step 1
	@FindBy(name="email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continueButton;
	@FindBy(id="ap_password")
	WebElement Password;
	@FindBy(id="signInSubmit")
	WebElement signinbutton;

	//step 2
	public void un()
	{
		username.sendKeys("919380691411");
	}
	public void cb()
	{
		continueButton.click();
	}
	public void pwd()
	{
		Password.sendKeys("Che@1234");
	}
	public void signin()
	{
		signinbutton.click();
	}

	//step 3
	public AmzLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);		
	}
	
	
}


