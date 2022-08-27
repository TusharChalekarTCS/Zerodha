package Case_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 
		 //enter the UN
		  driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		  
		  //enter the pwd
		  driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		  
		  //click on login button
		  driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	}

}
