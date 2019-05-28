package KeywordDriven_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;
	public static void OpenBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void navigate() 
	{
		driver.navigate().to("https://www.naukri.com/nlogin/login");
	}
	public static void Sendkeys_Textfield() 
	{
		driver.findElement(By.id("usernameField")).sendKeys("dhatavkarshraddha@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("shraddhacom");
	}
	public static void Click() 
	{
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	}
}
