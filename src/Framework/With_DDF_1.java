package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF_1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\Tushar.7350\\Documents\\New folder\\zerodhha.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("1");
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  String UN = sh.getRow(0).getCell(0).getStringCellValue();
		  driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		  
		 String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		 
		 driver.findElement(By.xpath("//button[text()='Login ']")).click();
		 
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
         String expId = sh.getRow(0).getCell(3).getStringCellValue();
         
         String actId = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
         
         
         if(expId.equals(actId)) {
        	 System.out.println("Both are the same, Test Case is passed");
         }
         else {
        	 System.out.println("Both are not same, Test Case is failed");
         }
		}

}
