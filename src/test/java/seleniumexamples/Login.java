package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		driver.findElement(By.name("lastname")).sendKeys("KA");
		driver.findElement(By.name("reg_email__")).sendKeys("admin123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("admin123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin@123");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin@123");
		driver.findElement(By.name("birthday_day")).sendKeys("02");
		driver.findElement(By.name("birthday_month")).sendKeys("11");
		driver.findElement(By.name("birthday_year")).sendKeys("1999");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
		//Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();

	}

}
