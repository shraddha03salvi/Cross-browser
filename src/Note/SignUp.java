
/**************************************************************************************

@Author  : Shraddha Dhatavkar
@version : selenium 3.7.1
@Date    : 22/02/2019
@Description:Create Note using all the feature mentioned in the application
***************************************************************************************/
package Note;

import org.openqa.selenium.By;

public class SignUp extends Baseclass  {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://34.213.106.173/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]//div[3]//div[1]//mat-card[1]")).click();
		Thread.sleep(2000);
		
   driver.findElement(By.xpath("//*[text()='Proceed to Checkout']")).click();
    Thread.sleep(2000);
    
/*****************Create Your Account**************************/
driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("swapnil");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("salvi");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("swapnil24salvi@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("abcd1234");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("abcd1234");
Thread.sleep(1000);
driver.findElement(By.xpath("//mat-card//form//div[7]//button/span")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//*[text()='Sign in instead']")).click();
Thread.sleep(2000);
System.out.println("Registeration done successfully");

/*@**************************Login page****************************************@*/
driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("shraddha12salvi@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("abcd1234");
Thread.sleep(1000);
driver.findElement(By.xpath("//mat-card//form//div[2]//button/span")).click();
Thread.sleep(1000);
System.out.println("Login done successfully");

/*********************************************Note Creation***************************************/
/*@*******************************Adding Title To Note**********************@*/
driver.findElement(By.xpath("//div//mat-card//span")).click();
Thread.sleep(1000);
System.out.println("Title added to note");
driver.findElement(By.xpath("//div//mat-card//div[1]//div")).sendKeys("Testing");
Thread.sleep(2000);

/*@****************************ADD Description To Note***************************@*/
driver.findElement(By.xpath("//div//mat-card//div[2]")).sendKeys("manual testing is the base of the testing");
Thread.sleep(2000);
System.out.println("Description added to note");

/*@****************Add Collaborator To note*************************@*/
driver.findElement(By.xpath("//div//mat-card//div[4]//app-add-collaborator//abbr/mat-icon")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div//mat-card/div[2]//mat-card-header[2]/input")).sendKeys("dhatavkarshraddha@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//div//mat-card//mat-card-footer//div//button/span")).click();
Thread.sleep(3000);
System.out.println("Collaborator added to note");

/*@****************************Set Reminder*******************-@*/
driver.findElement(By.xpath("//div//mat-card//div[4]//app-remind-me//abbr/img")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/div/div/mat-card/div[5]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='save']")).click();
Thread.sleep(3000);
System.out.println("Reminder added to note");


/*@******************************Add Color******************************@*/
Thread.sleep(4000);
driver.findElement(By.xpath("//div//mat-card//div[4]//app-change-color//abbr/mat-icon")).click();
Thread.sleep(3000);
driver.findElement(By.className("pink")).click();
Thread.sleep(3000);
System.out.println("Color added to note");

/*********Create New Label****************/
//driver.findElement(By.xpath("/html/body/app-root/app-navbar/div/mat-toolbar-row/div/div[2]/div[2]/mat-icon")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/app-root/app-navbar/mat-drawer-container/mat-drawer/div[3]/div[3]/button")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//*[@id=\"mat-dialog-4\"]/app-create-label/div[2]/div[2]/input")).sendKeys("Tools");
//Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id=\"mat-dialog-4\"]/app-create-label/button/span")).click();
//Thread.sleep(3000);

/*@******************************Pined Note******************************@*/
Thread.sleep(2000);
driver.findElement(By.xpath("//div//mat-card//div[1]//app-pin/img")).click();
Thread.sleep(2000);
System.out.println("Note get Pined Successfully");

/*@******************************Close created Note ******************************@*/
Thread.sleep(2000);
driver.findElement(By.xpath("//div//mat-card//div[4]//button/span")).click();
Thread.sleep(3000);
System.out.println("Note Created successfully");
Thread.sleep(3000);
driver.findElement(By.xpath("//div//div[2]//div[2]/mat-icon")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//mat-drawer//div[2]/small")).click();
Thread.sleep(2000);
System.out.println("Note Reflected in Reminder module");
Thread.sleep(3000);
driver.findElement(By.xpath("//mat-drawer//div[6]/small")).click();
Thread.sleep(3000);
System.out.println("Deleted note reflected in Trash Module");
Thread.sleep(3000);
/*@******************************View of Notes In homepage ******************************@*/
driver.findElement(By.xpath("//div//div[2]//div[7]/mat-icon")).click();//List View
System.out.println("List view for notes");
Thread.sleep(3000);
driver.findElement(By.xpath("//div//div[2]//div[7]/mat-icon")).click();// Grid view
System.out.println("Grid view for notes");
Thread.sleep(3000);

/*@******************************SignOut From the account ******************************@*/
driver.findElement(By.xpath("//div//div[2]//div[8]/div")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//mat-card//div//button")).click();
System.out.println("Signout from Account successfully");
	}

}
