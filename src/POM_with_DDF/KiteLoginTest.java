package POM_with_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Tushar.7350\\Desktop\\Tset Case sample sheet (11).xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("1");
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 KiteLogin1Page KL1=new KiteLogin1Page(driver);
		 String username = sh.getRow(0).getCell(0).getStringCellValue(); 
		 KL1.enterUN(username);
		 
		 String password = sh.getRow(0).getCell(1).getStringCellValue(); 
		 KL1.enterPWD(password);
		 KL1.clickLOGIN();
		 
		 
		 KiteLogin2Page KL2=new KiteLogin2Page(driver);
		 String pin = sh.getRow(0).getCell(2).getStringCellValue(); 
		 KL2.enterPIN(pin);
		 
		 KL2.clickCNT();
		 
		 KiteHomePage KH=new KiteHomePage(driver);
		 String expID = sh.getRow(0).getCell(3).getStringCellValue(); 
		 
		 KH.verifyuserID(expID);
		 
		 driver.close();
	
		
		 
}

}
