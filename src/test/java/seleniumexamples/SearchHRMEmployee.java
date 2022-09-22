package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class SearchHRMEmployee {
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
			driver.findElement(By.xpath("//a/span")).click();
		 
	 }
	 void search(String username) {
		 
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	
	
	 }	
	void search(String username, String empName) {
		 
			driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
			driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
			driver.findElement(By.xpath("//form//div//button[2]")).click();
		
		
		 }
	 
	 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		SearchHRMEmployee obj = new SearchHRMEmployee();
		obj.login();
		//obj.search("Admin");
		obj.search("Admin","Paul Collings");
		
	}
	
	
	
		
	

}
