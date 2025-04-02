package packagename.ProjectName;

	import org.testng.annotations.Test;

		public class Editaddress extends LaunchQuit {
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
		 //search
		 homepage.searchproduct();
		 SearchResultPage search=new SearchResultPage(driver);
		 search.searchfirstproduct();
		 AmzProductPage product=new AmzProductPage(driver);
		 product.wishlist(driver);
		 product.viewurcart();
		 product.addtocart();
		 product.viewcart();
		 AmzProceedToBuy buyproduct=new AmzProceedToBuy(driver);
		 buyproduct.proceedtobuy();
		 //buyproduct.editaddress();
		 AmzEditAddress address=new AmzEditAddress(driver);
		 address.fullname();
		 address.mobilenumber();
		 address.pincode();
		 address.houseno();
		 address.area();
		 address.landmark();
		 address.city();
		 address.usethisaddress();
		 //homepage.hoveroveronAccountsandlist(driver);
		 //homepage.signout();
	}
	}


