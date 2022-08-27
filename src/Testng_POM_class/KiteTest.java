package Testng_POM_class;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTest {
	
	Sheet sh;
	 WebDriver driver;
	 KiteLoging1T k1;
	 KiteLoging2T k2;
	 KiteHome kh;
	@BeforeClass
	public void openBrowser() throws Throwable, Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Tushar.7350\\Desktop\\Tset Case sample sheet (11).xlsx");
		 sh = WorkbookFactory.create(file).getSheet("1");
			
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 
			  k1=new KiteLoging1T(driver);
			 k2=new KiteLoging2T(driver);
			  kh=new KiteHome(driver);
	}
	
	@BeforeMethod
	public void loginToApp() {
		
		//UN
		String username = sh.getRow(0).getCell(0).getStringCellValue(); 
		k1.enterUN(username);
		
		//PWD
		String password = sh.getRow(0).getCell(1).getStringCellValue(); 
		k1.enterPWD(password);
		
		k1.clickLOGIN();
		
		
		//PIN
		String pin = sh.getRow(0).getCell(2).getStringCellValue(); 
		k2.enterPIN(pin);
		
		k2.clickCNT();
		
	}
	
	@Test
	public void verifyuserID() {
		Reporter.log("Running verify user id",true);
	String actID = kh.verifyuserID(null);
	
	String expID = sh.getRow(0).getCell(3).getStringCellValue(); 
	assertEquals(expID, actID,"Both are the different tc is failed");
	
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
	}
	
	@AfterClass
	public void close() {
		Reporter.log("Close",true);
	}

}
