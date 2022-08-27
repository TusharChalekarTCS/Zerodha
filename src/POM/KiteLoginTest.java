package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		KiteLogin1Page KL1=new KiteLogin1Page(driver);
		KL1.enterUN();
		KL1.enterPWD();
		KL1.clickLOGINBTN();
		
		KiteLogin2Page KL2=new KiteLogin2Page(driver);
		KL2.enterPIN();
		KL2.clickCNTBTN();
		
		KiteHomePage KH=new KiteHomePage(driver);
		KH.verifyuserID();
		
		driver.close();
		}

}
