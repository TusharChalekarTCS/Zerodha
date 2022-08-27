package Dynamic_element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_dynamic_element {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.drive","F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/"); 
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone13",Keys.ENTER);
	Thread.sleep(3000);
	
	String rating = driver.findElement(By.xpath("(//div[@class='gUuXy-']//span)[4]")).getText();
	System.out.println(rating);
	
	String review = driver.findElement(By.xpath("(//div[@class='gUuXy-']//span)[6]")).getText();
	System.out.println(review);
}
}
