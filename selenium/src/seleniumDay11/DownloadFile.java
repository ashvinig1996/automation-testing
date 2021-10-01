package seleniumDay11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		
// 1) Open web Browser(Chrome)
		System.setProperty("webdriver.chrome.driver","/home/ashwini/testing/Drivers/chromedriver_linux64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
//2) Open URL
		driver.get("http://demo.automationtesting.in/FileDownload.html");
//3) Maximize the window		
		driver.manage().window().maximize();
	
		//download text file
		driver.findElement(By.id("textbox")).sendKeys("selenium text file Download");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		//dwnload pdf file
		driver.findElement(By.id("pdfbox")).sendKeys("selenium pdf file download");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
	}

}
