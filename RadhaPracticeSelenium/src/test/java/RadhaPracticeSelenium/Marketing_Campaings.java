package RadhaPracticeSelenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Marketing_Campaings {

	public static ArrayList<Object> LoginToCitron() {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Library\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://autoapp.citronglobal.com/");
		driver.findElementById("username").sendKeys("Radha");
		driver.findElementById("password").sendKeys("radha1");
		driver.findElementByXPath("//div[@id='loginFormDiv']//button[@type='submit']").click();
		ArrayList<Object> instances = new ArrayList<Object>();
		instances.add(driver);
		instances.add(wait);
		return instances;
	}

	public static ArrayList<Object> ClickOnHamburgerIcon() {
		ArrayList<Object> instancesEntry = LoginToCitron();
		ChromeDriver driver = (ChromeDriver) instancesEntry.get(0);
		WebDriverWait wait = (WebDriverWait) instancesEntry.get(1);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='appnavigator']/div[@class='row app-navigator']")));
		driver.findElementByXPath("//div[@id='appnavigator']/div[@class='row app-navigator']").click();
		ArrayList<Object> instancesExit = new ArrayList<Object>();
		instancesExit.add(driver);
		instancesExit.add(wait);
		return instancesExit;
	}

	public static void HoverOnHamburgerLinks(String LinkName) {
		ArrayList<Object> instancesEntry = ClickOnHamburgerIcon();
		ChromeDriver driver = (ChromeDriver) instancesEntry.get(0);
		WebDriverWait wait = (WebDriverWait) instancesEntry.get(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(String.format("//div[@class='app-list row']/div/div[@data-app-name='{0}']", LinkName))));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElementByXPath(
				String.format("//div[@class='app-list row']/div/div[@data-app-name='{0}']", LinkName)));
	}

	public static void main(String[] args) {
		HoverOnHamburgerLinks("MARKETING");
	}
}
