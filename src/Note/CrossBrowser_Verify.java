package Note;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Verify {
	static{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
		}
		WebDriver driver;

	@Test
	@Parameters({"browser"})


public void VerifyTitle(String browser) {
		if (browser.equals("firefox")) {
			 driver = new FirefoxDriver();
			 System.out.println("Application get open into FireFox Browser");
		} else 
		{
			 driver = new ChromeDriver();
			 System.out.println("Application get open into Google Chrome Browser");
		}
		
	driver.manage().window().maximize();
	driver.get("http://codingcafetest-stg.bridgelabz.com");
	System.out.println(driver.getTitle());
	
	//driver.quit();
}
}
