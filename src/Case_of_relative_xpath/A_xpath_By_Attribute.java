package Case_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_xpath_By_Attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 
		 // Enter UN
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 
		 // enter pwd
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 
		 //click on login
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
