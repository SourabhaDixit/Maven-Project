package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Sourabha");
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("Dixit");
		driver.findElement(By.name("reg_email__")).sendKeys("9591805848");
		driver.findElement(By.name("reg_passwd__")).sendKeys("SouSaw24!02000");
		driver.findElement(By.name("birthday_day")).sendKeys("24");
		driver.findElement(By.name("birthday_month")).sendKeys("Oct");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
