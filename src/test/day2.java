package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void demo2() {
		System.out.println("Hi");
	}
@BeforeTest
public void prerequistle()
{
	System.out.println("I will excute first");
}
}
