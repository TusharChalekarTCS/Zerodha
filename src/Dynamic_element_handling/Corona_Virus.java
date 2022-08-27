package Dynamic_element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Virus {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.drive","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.worldometers.info/coronavirus/country//uk");
	Thread.sleep(3000);
	String Case = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
	System.out.println(Case);
	
	Thread.sleep(3000);
	String Deaths = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[2]")).getText();
	System.out.println(Deaths); 
	
	Thread.sleep(3000);
	String Recover = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();
	System.out.println(Recover);

}
}
