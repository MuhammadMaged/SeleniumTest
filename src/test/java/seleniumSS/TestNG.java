package seleniumSS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	ChromeDriver D1 = new ChromeDriver() ;
	
	
	@BeforeTest
	public void OpenURL() 
	{		
		D1.navigate().to("https://www.facebook.com");
	}
	
	
	@Test (priority = 0)
	public void GetUrlCorrectly () 
	{
		System.out.println(D1.getCurrentUrl());
	}
	
	
	@Test (priority = 1)
	public void GetBTitle () 
	{	
		String title = D1.getTitle();
		Assert.assertNotEquals(title, "Google");
	}
	
	@Test (dependsOnMethods = {"GetBTitle"})
	public void UserCanBuy () 
	{		
		System.out.println(D1.getTitle());	
	}
	
	
	
	@AfterTest
	public void CloseDriver () 
	{	
		D1.quit();	
	}
	

}
