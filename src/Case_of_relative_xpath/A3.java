package Case_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 
		 
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 
		 
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}


}
