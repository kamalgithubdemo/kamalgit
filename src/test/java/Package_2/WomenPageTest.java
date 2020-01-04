package Package_2;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Package_1.WomenPageOjects;

public class WomenPageTest {
	WomenPageOjects women;
	
public WomenPageTest() {
	women= new WomenPageOjects();
}	

@BeforeMethod
	public void womenTabClickTest() { 
women.click(women.womentab());
}

@Test(priority=0)
public void verifydisplaedproductTest() {
	
		String a= women.headercount().getText();
		System.out.println(a);
		int b= women.productsdisplaed().size();
		System.out.println(b);
		
		String c= Integer.toString(b);
		System.out.println(c);
		
	Assert.assertTrue(a.contains(c), "the displayed product was not not equal");
}

@Test(priority=1)
public void AddToCartTest() {
	women.click(women.product());
}

//@Test(priority=2)
//public void ProceedToCartTest() {
//	women.isElementVisible(women.Checkout());
//	women.Checkout().click();
//}
}


