package RadhaPracticeSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowsers 
{
@Test
void launchChrome() throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Java Library\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://autoapp.citronglobal.com/");
	driver.findElementById("username").sendKeys("Radha");
	driver.findElementById("password").sendKeys("radha1");
    //driver.findElementByClassName("button buttonBlue").click();
	driver.findElementByXPath("//div[@id='loginFormDiv']//button[@type='submit']").click();
	String pageTitle = driver.getTitle();
	String dashBoardName = "RadhaDashboard";
	if(pageTitle.equals("Dashboard"))
	{
		driver.findElementByXPath("//div[@class='dropdown dashBoardDropDown']//button").click();
		driver.findElementByLinkText("Add new dashboard").click();
		//WebElement dashboardPopUp = driver.findElementByXPath("//h4[contains(text(),'Add dashboard')]");
		Thread.sleep(10000);
		WebElement dashboardPopUp = driver.findElementByXPath("//div[@class='modal-header']//h4");
		if(dashboardPopUp.isDisplayed())
		{
		//driver.switchTo().activeElement();
		//driver.switchTo().frame(driver.findElementByXPath("//div[@class='modal-header']//h4"));
		//driver.switchTo().frame("Add dashboard");
			
			driver.findElementByXPath("//div[@class='modal-content']//input[@name='tabName']").sendKeys(dashBoardName);
			driver.findElementByName("saveButton").click();
			//driver.findElementByXPath("//button[@name='saveButton']").click();
		}
		List<WebElement> tabList = 
				driver.findElementsByXPath("//ul[@class='nav nav-tabs tabs sortable container-fluid']/li");
		int tabSize = tabList.size();
		for(int i=0;i<tabSize;i++)
		{
			String tabName = driver.findElement(By.xpath
					("//ul[@class='nav nav-tabs tabs sortable container-fluid']/li["+i+"]/a/div/span/strong")).getText();
			if(tabName.equals(dashBoardName))
			{
				driver.
				findElementByXPath("//ul[@class='nav nav-tabs tabs sortable container-fluid']/li["+i+"]/a/div/i[1]").click();
			}
		}
	}
	Thread.sleep(5000);
	driver.quit();	
}

}
