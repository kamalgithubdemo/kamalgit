package Package_1;

import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BasePage;

public class WomenPageOjects extends BasePage{
	
	
	@FindBy(xpath=" //a[@class='sf-with-ul' and @title='Women']")
	private WebElement women;

	@FindBy(id="llayered_id_attribute_group_2")
	WebElement mediumsize;
	
	@FindBy(id="layered_id_attribute_group_3")
	WebElement largsize;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement headerproductcount;
	
	@FindBy(xpath="//img[@itemprop]")
	private List<WebElement> displayedproducts;
	
	@FindBy(xpath="//a[@title='Add to cart' and @data-id-product='5']")
	private WebElement PrintedSummerWear;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkingout;
	
	public WomenPageOjects() {
		PageFactory.initElements(driver,this);
	}
	 
	public WebElement womentab() {
		return women;	
	}
	public WebElement medsize() {
		return mediumsize;	
	}
	
	public WebElement larsize() {
		return largsize;
	}
	
	public WebElement headercount() {
		return headerproductcount;
		}
	
	public List<WebElement> productsdisplaed() {
		return displayedproducts;
	}
	
	public WebElement product() {
		return PrintedSummerWear;
	}
	
	public WebElement Checkout() {
		return checkingout;
	}
	
}
