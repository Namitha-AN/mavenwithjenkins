package packagename.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class First_Program {
	@Test
	public void login() throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("ap_email"));
		e.sendKeys("namithayadne@gmail.com");
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("12345");
		WebElement e4=driver.findElement(By.id("signInSubmit"));
		e4.click();
	
	}
}
