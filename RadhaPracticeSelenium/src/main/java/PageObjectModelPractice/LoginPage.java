package PageObjectModelPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	
	public static WebElement userName()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Library\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebElement un = driver.findElementById("username");
		return un;
	}	public static WebElement password()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Library\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebElement pwd = driver.findElementById("password");
		return pwd;
	}
	public static WebElement signIn()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Library\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebElement si = driver.findElementByXPath("//div[@id='loginFormDiv']//button[@type='submit']");
		return si;
	}	
}
