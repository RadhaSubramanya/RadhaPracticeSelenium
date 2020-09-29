package RadhaPracticeHTMLPages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickdropdown {

	@Test
	void clickDD() throws InterruptedException {
		// Initialize chromedriver path
		WebDriverManager.chromedriver().setup();
		// Create chromedriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		// Browse local html file
		driver.get("file:///B:/HTML%20pages_for_selenium_Pratice_created_by_Santu/clickdropdown.html");
		//click on Dropdown button
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		// initialize scanner object
		Scanner scnObj = new Scanner(System.in);
		// provide message for user
		System.out.println("choose dropdown option - \n Home \n About\n Contact \n");
		// obtain user input
		String optionName = scnObj.next();
		switch(optionName)
		{
		case "Home":
			driver.findElement(By.linkText("Home")).click();
			break;
		case "About":
			driver.findElement(By.linkText("About")).click();
			break;
		default:
			driver.findElement(By.linkText("Contact")).click();
		}
		Thread.sleep(3000);
		// close the browser and kill the chromedriver instance
		driver.quit();
	}
}
