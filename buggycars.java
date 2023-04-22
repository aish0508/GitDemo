package buggyCars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class buggycars {


		WebDriver dr;
			@BeforeTest
			  public void LoadWebsite()  {
				System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
				WebDriver dr = (WebDriver) new FirefoxDriver();
					dr.get("https://buggy.justtestit.org/");
					dr.manage().window().maximize();
			
					

			}
			public void createAccount(){
				dr.findElement(By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/a")).click();
				
			}
}
