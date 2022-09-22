package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/EI13054/eclipse-workspace/OnlineMavenProject/src/test/java/seleniumexamples/WebTable.html");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input[@type='checkbox']")).click();
		

	}

}
