package seleniumDay11;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	private static final String Date = null;
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
// 1) Open web Browser(Chrome)
				System.setProperty("webdriver.chrome.driver",
						"/home/ashwini/testing/Drivers/chromedriver_linux64/chromedriver");
				
				WebDriver driver = new ChromeDriver();
// 2) Open URL
				driver.get("https://www.kiwi.com/");
				
				driver.manage().window().maximize();
			
				String year="2021";
				String month="september";
				String date="30";
				
				driver.findElement(By.xpath("//*[@id=\"HomePage\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div/div/div[2]/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/span/div/div[2]/div[1]/div[1]/div/div[3]/div[30]/div/div[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/span/div/div[1]/div/div[3]/div[2]/div/div[1]")).isSelected();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/span/div/div[2]/div[1]/div[2]/div/div[3]/div[30]/div/div[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/span/div/div[3]/div/button[2]/div/div")).click();
//				selectCurrentDate();
//				selectFutureDate(Date,month);
//				selectFutureDate(Date,month);
				
				driver.quit();
							
	}
	
//	static void selectCurrentDate()
//	{
//		Calendar cal=Calender.getInstant();
//		int d=cal.get(Calendar.DATE);
//		String date=String.valueOf(d);
//		driver.findElement(By.linkText(date)).click();
//	}
//	static void selectFutureDate(String d,String m)
//	{
//		Calendar cal=Calendar.getInstance();
//		int d=cal.get(Calendar.DATE);
//		 
//		int currentmonth;
//		for(i=currentmonth;i>=1;i++)
//		{
//			//driver.findElement(By.xpath("//*[@id=\"HomePage\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/span/div/div[2]/div[3]/button/div/div/svg")).click();
//			driver.findElement(By.xpath("//*[@id=\"HomePage\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[2]/div/span/div/div[2]/div[1]/div[1]/div/div[3]/div[30]/div/div[1]")).click();
////			if(mon.equals(m))
////			{
////			 driver.findElement(By.linkText(d)).click();
////			 break;
////			}
//			
//		}
	}
	


