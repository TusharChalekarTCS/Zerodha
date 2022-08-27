package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ' ]")private WebElement LOGINBTN;
	
	public KiteLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUN() {
		UN.sendKeys("DPG458");
	}
	public void enterPWD() {
		PWD.sendKeys("Amol@1234");
	}
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}

}
