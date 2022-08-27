package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	
	@FindBy(xpath="//button[text()='Continue ']")private WebElement CNT;
	
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterPIN(String pin) {
		PIN.sendKeys(pin);
	}
	
	
	public void clickCNT() {
	CNT.click();
	}

}
