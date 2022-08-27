package Testng_POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHome {
@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	
	public KiteHome(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyuserID(String expID) {
		
		String actID = userID.getText();
		return actID;
}
}
