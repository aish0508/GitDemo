package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Basisday1 {
	@Test(groups="smoke")
	public void Demo()
	{
		System.out.println("hello");
		//writing to failed test in testingxml
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println("i am no 1 from last");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}

}
