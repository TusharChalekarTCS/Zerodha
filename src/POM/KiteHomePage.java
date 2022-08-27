package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyuserID() {
		String expID="DPG458";
		String actID = userID.getText();
		
		if(actID.equals(expID)) {
			System.out.println("Test Case is Pass");
		}
		else {
			System.out.println(" Test Case is Fail");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	



