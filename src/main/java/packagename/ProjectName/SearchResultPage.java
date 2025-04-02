package packagename.ProjectName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	WebDriver driver;
	//step 1
	@FindBy(xpath="//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']")
	WebElement SearchFirstProduct;
	
		//step 2
		public void searchfirstproduct()
		{
			SearchFirstProduct.click();
		}

		//step 3
		public SearchResultPage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);		
		}
	}




