package Package_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BasePage;

public class HomePageObjects extends BasePage{

	//Object Identification OR
	@FindBy(xpath="//a[@title='gulfi']")
	WebElement Women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	WebElement Dresses;
	
	@FindBy(xpath="//li[@class]//a[@title='T-shirts']")
    WebElement TShirts;
	
	@FindBy(id="newsletter-input")
	WebElement Newsletter;
	
	@FindBy(id="newsletter-input")
	WebElement EmailBox;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
    WebElement SubscriptionBtn;
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	
	public WebElement getwomen() {
		return Women;
		}
	
	public WebElement getdresses() {
		return Dresses;
	}
	
	public WebElement getTshirts() {
		return TShirts;
	}
	public WebElement subscription() {
		return SubscriptionBtn;
	}
	public WebElement emailbox() {
		return EmailBox;

}
}
//public void ggwomen() {
//Women.click();
//}
