package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		
	}
}
