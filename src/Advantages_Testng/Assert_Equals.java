package Advantages_Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Equals {
	@Test
	public void TC1() {
		Reporter.log("TC1 is Running",true);
		String expR="Tushar";
		String actR="Tushar";
		Assert.assertEquals(expR, actR);
	}

}
