package packagename.ProjectName;

import org.testng.annotations.Test;

public class Testcase2 extends LaunchQuit {
	@Test
	public void login_search_wishlist_cart_removingfromcart_logout() {
		AmzHomePage homepage=new AmzHomePage(driver);
		homepage.hoveroveronAccountsandlist(driver);
		homepage.signin_click();
		AmzLoginPage loginpage=new AmzLoginPage(driver);
		loginpage.un();
		loginpage.cb();
		loginpage.pwd();
		loginpage.signin();
		//search
		homepage.searchproduct();
		SearchResultPage search=new SearchResultPage(driver);
		search.searchfirstproduct();
		AmzProductPage product=new AmzProductPage(driver);
		product.wishlist(driver);
		product.viewurcart();
		product.addtocart();
		product.viewcart();
		AmzRemoveProductPage remove=new AmzRemoveProductPage(driver);
		remove.removeproductfromcart();
		homepage.hoveroveronAccountsandlist(driver);
		homepage.signout();
		
	}	
}
