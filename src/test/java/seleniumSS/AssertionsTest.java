package seleniumSS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {
	
	ChromeDriver D1 = new ChromeDriver();

	@Test
	public void GetUrl () 
	{
		D1.navigate().to("https://www.google.com");
		String title = D1.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		D1.quit();
		
		
		
	}
	
	

}
