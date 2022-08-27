package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    //open the application
	    driver.get("https://demo.actitime.com/login.do");
	   
	
	    driver.findElement(By.id("username")).sendKeys("admin");
	    
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	    driver.findElement(By.id("loginButton")).click();
	    driver.manage().window().maximize();
	}
}
