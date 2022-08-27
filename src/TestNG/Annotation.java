package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open the browser",true);
	}
	@BeforeMethod
	public void loginApp() {
		Reporter.log("login to app",true);
	}
	@Test
	public void verifyID() {
		Reporter.log("verify user id",true);
	}
	@AfterMethod
	public void closeapp() {
		Reporter.log("close the app",true);
	}
	
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the Browser",true);
	}

}
