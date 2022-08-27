package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gecko_Demo {
@Parameters
		@Test
		public void TC(String browsername) {//paramerized method
				WebDriver driver=null;//runtime polymorphism
			
				if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","‪F:\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
				else if(browsername.equals("Firefox")) {
					System.setProperty("webdriver.gecko.driver","‪F:\\geckodriver\\geckodriver.exe");
					 driver=new FirefoxDriver();
					
				}
				driver.get("https://kite.zerodha.com/");
				
				
		}

	
}
