package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExcelFacebook {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://facebook.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		

		
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin123");
		
		

		//Prepare the path of excel file
		String filePath = "C:\\Users\\EI13054\\eclipse-workspace";
		String fileName = "Facebook.xlsx";
		String sheetName ="Sheet1"; 
		
		//Create an object of File class to open xlsx file

	    File file = new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    @SuppressWarnings("resource")
		Workbook workBook = new XSSFWorkbook(inputStream);

	    //Find the file extension by splitting file name in substring  and getting only extension name


	    //Check condition if the file is xlsx file

	    //Read sheet inside the workbook by its name

	    Sheet sheet = workBook.getSheet(sheetName);

	    //Find number of rows in excel file

	    //int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    //System.out.println("Row count " +rowCount);

	    //Create a loop over all the rows of excel file to read it

	        Row row = sheet.getRow(1);
	        String a = row.getCell(0).getStringCellValue();
	        String b = row.getCell(1).getStringCellValue();
	        
	        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(a);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(b);
			driver.findElement(By.xpath("//div/button[@name='login']")).click();
	}

}
