package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
@Test
public void WebLoginHomeLoan( String uname)
{
	//selenium
		System.out.println("WebLoginHomePersonalloan");
	System.out.println(uname);
}
public void MobileLoginHomeLoan()
{
	//appium
	System.out.println("MobileLoginHome");
}
public void LoginApiCarLoan()
{
	//Rest Api automation
	System.out.println("LoginApiHome");
}
}
