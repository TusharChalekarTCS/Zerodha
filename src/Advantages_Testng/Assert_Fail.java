package Advantages_Testng;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
	@Test
	public void TC1() {
		Reporter.log("running TC1",true);
		Assert.fail();//verification 1
		System.out.println(" I am After fail");//verification 2
		
	}
@Test
public void TC2() {
	Reporter.log("running TC2",true);
}
}
