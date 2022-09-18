package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class day3 {
	@Parameters({"URL","APIKey/username"})
public void WebLoginCarLoan( String urlname , String key)
{
	//selenium
	System.out.println("WebLoginCar");
	System.out.println(urlname);
	System.out.println(key);
}
@BeforeMethod
public void beforeevery()
{
	System.out.println("I will excute before every test method in day 3 class");
}
@AfterMethod
public void aftereevery()
{
	System.out.println("I will excute before every test method in day 3 class");
}
public void MobileLoginCarLoan()
{
	//appium
	System.out.println("MobileLoginCar");
}
public void MobileSigninCarLoan()
{
	//appium
	System.out.println("MobileSignIn");
}
@BeforeSuite
public void Bfsuite()
{
	System.out.println("I am no 1");
}
@Test(dataProvider="getData")
public void MobileSignOutCarLoan(String username , String password)
{
	//appium
	System.out.println("MobileSignOut");
	System.out.println("username");
	System.out.println("password");
}
public void LoginApiCarLoan()
{
	//Rest Api automation
	System.out.println("LoginApiCar");
}
@DataProvider
public Object[][] getData()
{
	// 1 st combination -username password - good credit history =row
	//2nd -username,password -no credit history
	//3rd -fraudelent credit history
	Object[][] data = new Object[3][2];
			//1st set
	data[0][0]="firstsetusername";
	data[0][1]="firstpassword";
	//columns are nothing but values for the particular combination(rows])
	//2nd set
	data[0][1]="secondsetusername";
	data[1][1]="secondpassword";
	//3rd set
	data[2][0]="thirdsetusername";
			data[2][1]="secondpassword";
	return data;
	
}
}
