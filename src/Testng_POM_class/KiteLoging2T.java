package Testng_POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoging2T {
@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	
	@FindBy(xpath="//button[text()='Continue ']")private WebElement CNT;
	
	public KiteLoging2T(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterPIN(String pin) {
		PIN.sendKeys(pin);
	}
	
	
	public void clickCNT() {
	CNT.click();
	}
}
