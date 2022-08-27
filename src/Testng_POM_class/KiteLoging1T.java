package Testng_POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoging1T {

	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ' ]")private WebElement LOGIN;
	
	public KiteLoging1T(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}

	public void clickLOGIN() {
	LOGIN.click();
	}


}
