package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class SeleniumHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button")).click(); //presses "cancel"
		//String b=driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login","actual result and expected result");
	}

}
