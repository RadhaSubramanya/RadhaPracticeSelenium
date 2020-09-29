package RadhaPracticeHTMLPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class index {

	@Test
	void modalLoginForm() throws InterruptedException {
		/*--------------------------------------------------------------------------
		login block
		--------------------------------------------------------------------------*/
		// Initialize chromedriver path
		WebDriverManager.chromedriver().setup();
		// Create chromedriver instance
		ChromeDriver driver = new ChromeDriver();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// Maximize window
		driver.manage().window().maximize();
		// Browse local html file
		driver.get("file:///B:/HTML%20pages_for_selenium_Pratice_created_by_Santu/index.html");
		// // Switch to frame
		// driver.switchTo().frame("popupsignuplogin");
		// // Switch to frame
		// driver.switchTo().frame("loginform");
		// // wait for login button1 to load
		// wait.until(ExpectedConditions
		// .visibilityOfElementLocated(By.xpath("//h2/following-sibling::button[text()='Login']")));
		// // Click on login button1
		// driver.findElementByXPath("//h2/following-sibling::button[text()='Login']").click();
		// // enter username
		// driver.findElementByName("uname").sendKeys("radha");
		// // enter password
		// driver.findElementByName("psw").sendKeys("radha");
		// // // wait for login button2 to load
		// // wait.until(
		// //
		// ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit'
		// // and text()='Login']")));
		// // // find login button2 element
		// // WebElement loginButtonElement =
		// // driver.findElementByXPath("//button[@type='submit' and text()='Login']");
		// // scroll to view login button2 on page
		// JavascriptExecutor jseob = (JavascriptExecutor) driver;
		// jseob.executeScript("arguments[0].scrollIntoView()",
		// driver.findElementByXPath("//button[@type='submit' and text()='Login']"));
		// // Click on login button2
		// driver.findElementByXPath("//button[@type='submit' and
		// text()='Login']").click();
		// // Switch to default content
		// driver.switchTo().defaultContent();
		// /*--------------------------------------------------------------------------
		// sign up block
		// --------------------------------------------------------------------------*/
		// // Switch to frame
		// driver.switchTo().frame("popupsignuplogin");
		// // Switch to frame
		// driver.switchTo().frame("signupform");
		// // Click on signup button
		// driver.findElementByXPath("//h2/following-sibling::button[text()='Sign
		// Up']").click();
		// // Click on close icon
		// driver.findElementByXPath("//div[@class='modal']/span[@title='Close
		// Modal']").click();
		// // Switch to default content
		// driver.switchTo().defaultContent();
		// /*--------------------------------------------------------------------------
		// custom select block
		// --------------------------------------------------------------------------*/
		// // Switch to frame
		// driver.switchTo().frame("customselectlist");
		// // wait for dropdown to load
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select-selected']")));
		// // Click on select car dropdown
		// driver.findElementByXPath("//div[@class='select-selected']").click();
		// // wait for dropdown option to load
		// wait.until(ExpectedConditions
		// .visibilityOfElementLocated(By.xpath("//div[@class='select-items']/div[text()='Jaguar']")));
		// // Click on option inside dropdown
		// driver.findElementByXPath("//div[@class='select-items']/div[text()='Jaguar']").click();
		// // Switch to default content
		// driver.switchTo().defaultContent();
		// /*--------------------------------------------------------------------------
		// custom radio button block
		// --------------------------------------------------------------------------*/
		// // Switch to frame
		// driver.switchTo().frame("customradiobutton");
		// // wait for dropdown to load
		// wait.until(ExpectedConditions
		// .visibilityOfElementLocated(By.xpath("//label[@class='container'and
		// contains(text(),'Three')]")));
		// driver.findElementByXPath("//label[@class='container'and
		// contains(text(),'Three')]").click();
		// // Switch to default content
		// driver.switchTo().defaultContent();
		// /*--------------------------------------------------------------------------
		// filter div elements block
		// --------------------------------------------------------------------------*/
		// // Switch to frame
		// driver.switchTo().frame("customfilterelements");
		// // wait for dropdown to load
		// wait.until(ExpectedConditions.visibilityOfElementLocated(
		// By.xpath("//div[@id='myBtnContainer']/button[contains(text(),'Animals')]")));
		// driver.findElementByXPath("//div[@id='myBtnContainer']/button[contains(text(),'Animals')]").click();
		// Thread.sleep(5000);
		// // Switch to default content
		// driver.switchTo().defaultContent();
		/*--------------------------------------------------------------------------
		drag and drop block
		--------------------------------------------------------------------------*/
		// Create Actions object
		Actions action = new Actions(driver);
		// wait for image to load
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@id='drag1']")));
		// Click and hold the element to be dragged
		//action.clickAndHold(driver.findElementByXPath("//img[@id='drag1']")).build().perform();
		// wait for src to load
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='div1']")));
		// wait for destination to load
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='div2']")));
		// drag the element and drop it
		action.dragAndDrop(driver.findElementByXPath("//img[@id='drag1']"),
				driver.findElementByXPath("//div[@id='div2']")).build().perform();
		// release the mouse click
		//action.release(driver.findElementByXPath("//img[@id='drag1']"));
		/*--------------------------------------------------------------------------
		menu button block
		--------------------------------------------------------------------------*/
		// Click on menu button
//		action.moveToElement(driver.findElementByXPath("//button[@class='dropbtn']")).build().perform();
//		Thread.sleep(5000);
//		action.moveToElement(driver.findElementByXPath("//a[text()='Link 3']")).click().build().perform();
//		Thread.sleep(5000);
		// close the browser and kill the chromedriver instance
		driver.quit();
	}
}