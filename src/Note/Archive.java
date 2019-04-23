package Note;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Archive extends Baseclass {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://34.213.106.173/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign in instead']")).click();
    Thread.sleep(2000);
    
		/***********************For Login*******************************/
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("ovi12@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("abcd1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div//mat-card//form//div[2]//button/span")).click();
		Thread.sleep(1000);
		
	/********************************Note Creation To Archive***********************/	
		driver.findElement(By.xpath("//div//mat-card/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div//mat-card//div[1]/div")).sendKeys("Archive");
		Thread.sleep(2000);
		System.out.println("Title added to note");
		driver.findElement(By.xpath("//div//mat-card//div[2]")).sendKeys("To check Archive functionality is working or not");
		Thread.sleep(2000);
		System.out.println("Description added to note");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div//mat-card//div[4]//app-notes-archive//abbr/mat-icon")).click();
		Thread.sleep(3000);
		System.out.println("Note get Archived");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//div[2]//div[2]/mat-icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-drawer-container//mat-drawer//div[5]/img")).click();
		Thread.sleep(2000);
		System.out.println("Note Display in Archive Module");
		Thread.sleep(2000);
		driver.close();
/***************************Note Creation to Delete Note***************************************
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/mat-drawer-container/mat-drawer/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/mat-drawer-container/mat-drawer-content/app-notes/app-notes-add/div/mat-card/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/mat-drawer-container/mat-drawer-content/app-notes/app-notes-add/div/mat-card/div[1]/div")).sendKeys("Delete Note");
		Thread.sleep(2000);
		System.out.println("Title added to note");
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/mat-drawer-container/mat-drawer-content/app-notes/app-notes-add/div/mat-card/div[2]")).sendKeys("Note Get Delete");
		Thread.sleep(2000);
		System.out.println("Description added to note");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/mat-drawer-container/mat-drawer-content/app-notes/app-notes-add/div/mat-card/div[4]/button/span")).click();
		Thread.sleep(2000);
		System.out.println("Note created");
	driver.findElement(By.xpath("/html/body/app-root/app-navbar/mat-drawer-container/mat-drawer-content/app-notes/app-notes-list[1]/div/div/mat-card/div[2]/app-more/abbr/mat-icon")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/div/div/button[1]")).click();
	Thread.sleep(2000);
	System.out.println("Note get deleted");*/
	}

}
