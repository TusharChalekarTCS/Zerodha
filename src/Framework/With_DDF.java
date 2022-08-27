package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Tushar.7350\\Desktop\\Tset Case sample sheet (11).xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("1");
	  
	 // set propertis
	 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 //get url
		driver.get("https://kite.zerodha.com/");
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//maximize 
		driver.manage().window().maximize();
		
		//User name
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		
		//PWD
		 String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		 
		 //login click
		 driver.findElement(By.xpath("//button[text()='Login ' ]")).click();
		 
		 //enter pin
		 String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		 driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		 
		 
		 //click on continue
		 driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		 
		 //Compare EXP And ACT
		 String expID = sh.getRow(0).getCell(3).getStringCellValue();
		 
		 String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		 
		 if(actID.equals(expID)) {
			 System.out.println(" Both are same, TC is pass");
		 }
		 else {
			 System.out.println(" Both are not same, TC is not pass");
		 }
		 	
	}
}
