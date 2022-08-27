package Advantages_Testng;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Class {
	
		@Test
		public void TC1() {
			Reporter.log("TC1 is Running",true);
			String expR="Tushar";
			String actR="Hushar";
			SoftAssert soft= new SoftAssert();
			soft.assertEquals(expR, actR); //verification 1
			 
			System.out.println(" I am after failed verification ");
			//mandatory
			soft.assertAll();
			
		}
 @Test
 public void TC2() {
	 Reporter.log("Hiiii , Hello",true);
 }
}
