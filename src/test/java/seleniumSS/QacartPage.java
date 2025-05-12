package seleniumSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QacartPage {

	ChromeDriver D1 = new ChromeDriver();
	
	
	@BeforeTest
	public void GetUrl ()
	{
		D1.navigate().to("D:\\EclipseWorkspace\\SS\\index.html");
	}
	
	@Test
	public void FindElementByXpath ()
	{
//	WebElement SignUpBtn = D1.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[2]/button"));
//	System.out.println(SignUpBtn.getText());
//	//WebElement Enterprise = D1.findElement(By.xpath("//h4[@class='my-0 font-weight-normal']"));
//	WebElement Enterprise = D1.findElement(By.xpath("/html/body/div[7]/div[1]/div[3]/div[1]/h4"));
//	System.out.println(Enterprise.getText());
	WebElement Enterprise2 = D1.findElement(By.xpath("//*[text()='Free']"));
	System.out.println(Enterprise2.getText());	
//	WebElement PlsSignUp = D1.findElement(By.xpath("//*[@class='h3 mb-3 font-weight-normal']"));
//	System.out.println(PlsSignUp.getText());


	}
	
	
	@AfterTest
	public void QuitDriver ()
	{
		D1.quit();
	}
	
	
}
