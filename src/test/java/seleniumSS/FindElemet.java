package seleniumSS;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElemet {

	
	ChromeDriver D1 = new ChromeDriver();
	
	@BeforeTest
	public void GetUrl ()
	{
		D1.navigate().to("https://the-internet.herokuapp.com/login");
	}
	
	@Test
	public void EnterInvalidUserAndPassword ()
	{
		WebElement usernameTxt = D1.findElement(By.name("username"));
		WebElement passwordTxt = D1.findElement(By.id("password"));
		WebElement LoginButton = D1.findElement(By.className("radius"));
		WebElement Text = D1.findElement(By.cssSelector("h4.subheader"));
		System.out.println(Text.getText());
		usernameTxt.sendKeys("Muhammad");
		passwordTxt.sendKeys("123456");	
		LoginButton.click();
	}
	
	
	@Test
	public void LinkText ()
	{
		WebElement LinkText = D1.findElement(By.linkText("Elemental Selenium"));
		System.out.println(LinkText.getAttribute("href"));
		Assert.assertEquals("http://elementalselenium.com/",LinkText.getAttribute("href"));
	}
	
	
	
	

//	{
//		try 
//		{
//		WebElement usernameTxt = D1.findElement(By.name("username"));
//		WebElement passwordTxt = D1.findElement(By.id("password"));
//		usernameTxt.sendKeys("Muhammad");
//		passwordTxt.sendKeys("123456");		
//		}
//			catch (NoSuchElementException e) 
//			{
//				System.out.println("The element is nout found please use another attribute");
//			}
//	}
	
	
	
	@AfterTest
	public void CloseDriver ()
	{
		D1.quit();
	}
	
	
	
	
	
}
