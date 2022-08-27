package auto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automata {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.YOUTUBE.COM/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
}
}
