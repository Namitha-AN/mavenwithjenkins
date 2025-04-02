package packagename.ProjectName;

import org.testng.annotations.Test;

	public class Testcase3 extends LaunchQuit {
	@Test
	public void login_search_wishlist_cart_updating_newddress_logout() 
	{
	 AmzHomePage homepage=new AmzHomePage(driver);
	 homepage.hoveroveronAccountsandlist(driver);
	 homepage.signin_click();
	 AmzLoginPage loginpage=new AmzLoginPage(driver);
	 loginpage.un();
	 loginpage.cb();
	 loginpage.pwd();
	 loginpage.signin();
	 AmazonAddressPage address=new AmazonAddressPage(driver);
	 homepage.hoveroveronAccountsandlist(driver);
	 address.youraccount();
	 address.youraddress();
	 address.addaddress();
	 address.fullname();
	 address.mobilenumber();
	 address.pincode();
	 address.houseno();
	 address.area();
	 address.landmark();
	 address.city();
	 address.addtheaddress();
	 homepage.hoveroveronAccountsandlist(driver);
	 homepage.signout();
}
}
