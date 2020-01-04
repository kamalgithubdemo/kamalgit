package Package_2;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import Package_1.HomePageObjects;
import net.bytebuddy.utility.RandomString;

public class HomePageTest {
  
	HomePageObjects homepage;
	BasePage bp;
	int random= new Random().nextInt(5000);
	String email= "kamalakannan"+random+"@gmail.com";
	
	String tandom2= new RandomString().nextString();
	String mail= "AA"+tandom2+"@gmail.com";
	
	

 public HomePageTest() {
	
	homepage= new HomePageObjects();
	bp= new BasePage();
 }
 	@Test
 	public void NoOfSubscriptionTest() {
 	
 		homepage.setText(homepage.emailbox(), mail);
 		homepage.click(homepage.subscription());
 		System.out.println(mail); //if you wanted to know what was printed
 	}
 	
 	
 	
    @Test(enabled= false)
    public void clickwomentabtest() {
	   homepage.click(homepage.getwomen());
   }
   
   @Test(enabled= false)
   public void verifywomentabclickTest() {
	  Assert.assertTrue(homepage.getTitlte().contains("Women"));
   }
 
}



//@Test
//public void PresenceOfWomentDresTshAbtest() {
//Assert.assertTrue(homepage.getwomen().isDisplayed());
//Assert.assertTrue(homepage.getdresses().isDisplayed());
//Assert.assertTrue(homepage.getTshirts().isDisplayed());
//}
//@Test
//public void presenceoftabtestbybasepagetest() {
//  Assert.assertTrue(homepage.elementFound(homepage.getwomen()));
//}}
//
//@Test
//public void presenceoftabtestbybasepagetest2() {
//  Assert.assertTrue(homepage.elementFound(homepage.getdresses()));
//}
//
//@Test
//public void presenceoftabtestbybasepagetest3() {
//  Assert.assertTrue(homepage.elementFound(homepage.getTshirts()));
//}

//@Test
//public void subscriptiontest() {
//bp.setText(homepage.emailbox(), "kk@gmail.com");
//homepage.subscription().click();
//}
//

//@Test
//public void WomenClickTest() { 
//  homepage.getwomen().click();
  // otherwise
//homepage.ggwomen();