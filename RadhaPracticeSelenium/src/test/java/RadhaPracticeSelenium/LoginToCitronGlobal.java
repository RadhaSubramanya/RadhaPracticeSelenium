package RadhaPracticeSelenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToCitronGlobal {
	static ChromeDriver driver;
	static WebDriverWait wait;
	public LoginToCitronGlobal()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Library\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
	}
		
	public static void main(String []args) 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://autoapp.citronglobal.com/");
		driver.findElementById("username").sendKeys("Radha");
		driver.findElementById("password").sendKeys("radha1");
		driver.findElementByXPath("//div[@id='loginFormDiv']//button[@type='submit']").click();
	}
}
