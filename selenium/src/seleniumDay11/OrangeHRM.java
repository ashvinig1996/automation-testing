package seleniumDay11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) {
// 1) Open web Browser(Chrome)
		System.setProperty("webdriver.chrome.driver",
				"/home/ashwini/testing/Drivers/chromedriver_linux64/chromedriver");
		
// 1) Open web Browser(FireFox)
//		System.setProperty("webdriver.gecko.driver",
//				"/home/ashwini/testing/Drivers/geckodriver-v0.30.0-linux64/geckodriver");
		
	WebDriver driver = new ChromeDriver();
	
// 1) Open web Browser(IE)
//		driver.get("http://www.google.com");
	
// 2) Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//3) Enter username (Admin)
//		WebElement usernametxt=driver.findElement(By.id("txtUsername"));
//		usernametxt.sendKeys("Admin");
		
//OR
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
//4) Enter passward(admin123)
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
//5) click on login
		driver.findElement(By.name("Submit")).click();
		
//6) Capture title of the home page
		String act_title=driver.getTitle();//capture the title of current page
		String exp_title="OrangeHRM";
		
//7) Verify title of the page:OrangeHRM
		if(act_title.equals(exp_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		 fdjfbjdssssssssssabfonwadufbjdabnfiodafbdifnidjfpjdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaapiuf
//8) Close Browser
		driver.close();//driver.quit()
		
	}

}
