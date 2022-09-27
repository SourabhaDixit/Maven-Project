import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AutomateLeave {
	WebDriver driver = new ChromeDriver();
	 void login() {
		 	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);		
		 	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys("Admin");
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("admin123");
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			login.click();
			//driver.findElement(By.xpath("//li[3]/a/span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
			driver.findElement(By.linkText("Leave")).click();
	 }
	 void leave() {
		 driver.findElement(By.linkText("Apply")).click();
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		 driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
		 driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();		 
		 
		
	 }

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		AutomateLeave obj = new AutomateLeave();
		obj.login();
		obj.leave();
	}

}
