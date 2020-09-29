package RadhaPracticeHTMLPages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	 public static void initializeDriverInstance(String filePath) {
	 // Initialize chromedriver path
	 WebDriverManager.chromedriver().setup();
//	  Configure browser setting option - disable pop-up blocker
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("test-type");
//	  options.addArguments("disable-popup-blocking");
//	  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//	  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//	  Create chromedriver instance
	 final WebDriver driver = new ChromeDriver(options);
	 // Maximize window
	 driver.manage().window().maximize();
	 // Browse local html file
	 driver.get(filePath);
	 }

	 @Test(priority = 1)
	 void selectDropDownAction() throws InterruptedException {
	 // Initialize chromedriver path
	 WebDriverManager.chromedriver().setup();
	 // Configure browser setting option - disable pop-up blocker
	 // ChromeOptions options = new ChromeOptions();
	 // options.addArguments("test-type");
	 // options.addArguments("disable-popup-blocking");
	 // DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	 // capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	 // Create chromedriver instance
	 WebDriver driver = new ChromeDriver();
	 // Maximize window
	 driver.manage().window().maximize();
	 // Browse local html file
	 driver.get("file:///B:/HTML%20pages_for_selenium_Pratice_created_by_Santu/dropdown.html");
	 // create an instance of Select class to handle dropdown/listbox
	 Select selectObj = new Select(driver.findElement(By.id("singleselect")));
	 // Select an option in listbox using index method
	 selectObj.selectByIndex(2);
	 Thread.sleep(3000);
	 // Select an option in listbox using value attribute
	 selectObj.selectByValue("ho");
	 Thread.sleep(3000);
	 // Select an option in listbox using visible text method
	 selectObj.selectByVisibleText("Volvo");
	 Thread.sleep(3000);
	 // close the browser and kill the chromedriver instance
	 driver.quit();
	 }

	 @Test(priority = 2)
	 void textboxActions() throws InterruptedException {
	 // Initialize chromedriver path
	 WebDriverManager.chromedriver().setup();
	 // Create chromedriver instance
	 WebDriver driver = new ChromeDriver();
	 // Maximize window
	 driver.manage().window().maximize();
	 // Browse local html file
	 driver.get("file:///B:/HTML%20pages_for_selenium_Pratice_created_by_Santu/dropdown.html");
	 // find first name locator
	 WebElement firstnameLocator = driver.findElement(By.name("FirstName"));
	 // get the text stored in first name field form UI
	 String firstNameText = firstnameLocator.getAttribute("value");
	 // print first name
	 System.out.println(firstNameText);
	 // find last name locator
	 WebElement lastnameLocator = driver.findElement(By.name("LastName"));
	 // get the text stored in last name field form UI
	 String lastNameText = lastnameLocator.getAttribute("value");
	 // print last name
	 System.out.println(lastNameText);
	 // Clear first name field
	 firstnameLocator.clear();
	 Thread.sleep(5000);
	 // enter new first name
	 firstnameLocator.sendKeys("Radha");
	 // Clear last name field
	 lastnameLocator.clear();
	 Thread.sleep(5000);
	 // enter new last name
	 lastnameLocator.sendKeys("Subramanya");
	 Thread.sleep(5000);
	 // click on submit button
	 driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
	 // close the browser and kill the chromedriver instance
	 driver.quit();
	 }

	 @Test(priority = 3)
	 void multiSelectDropdown() throws InterruptedException {
	 // Initialize chromedriver path
	 WebDriverManager.chromedriver().setup();
	 // Create chromedriver instance
	 WebDriver driver = new ChromeDriver();
	 // Maximize window
	 driver.manage().window().maximize();
	 // Browse local html file
	 driver.get("file:///B:/HTML%20pages_for_selenium_Pratice_created_by_Santu/dropdown.html");
	 // create an instance of Select class to handle dropdown/listbox
	 Select selectObj = new Select(driver.findElement(By.id("multiselect")));
	 // Select an option in listbox using index method
	 selectObj.selectByIndex(2);
	 Thread.sleep(3000);
	 // Select an option in listbox using value attribute
	 selectObj.selectByValue("ho");
	 Thread.sleep(3000);
	 // Select an option in listbox using visible text method
	 selectObj.selectByVisibleText("Volvo");
	 Thread.sleep(3000);
	 // get all selected options and store in a list
	 List<WebElement> allSelectedOptions = selectObj.getAllSelectedOptions();
	 // use foreach to iterate through list and print each option
	 for (WebElement obj : allSelectedOptions) {
	 System.out.println(obj.getText());
	 }
	 // close the browser and kill the chromedriver instance
	 driver.quit();
	
	 }

	@Test(priority = 4)
	void checkboxActions() throws InterruptedException {
		// Initialize chromedriver path
		WebDriverManager.chromedriver().setup();
		// Create chromedriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		// Browse local html file
		driver.get("file:///B:/HTML%20pages_for_selenium_Pratice_created_by_Santu/dropdown.html");
		// obtain the list of checkboxes and store in a list
		List<WebElement> checkboxesList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		// use foreach to iterate through list
		for (WebElement ob : checkboxesList) {
			// deselect the checkbox if it is already selected
			if (ob.isSelected()) {
				ob.click();
				Thread.sleep(3000);
			}
			// select the checkbox if it is already not selected
			ob.click();
			Thread.sleep(3000);
		}
		// close the browser and kill the chromedriver instance
		driver.quit();
	}

	@Test(priority = 5)
	void radioButtonActions() throws InterruptedException {
		// Initialize chromedriver path
		WebDriverManager.chromedriver().setup();
		// Create chromedriver instance
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		// Browse local html file
		driver.get("file:///B:/HTML%20pages_for_selenium_Pratice_created_by_Santu/dropdown.html");
		//initialize scanner object
		Scanner scnObj = new Scanner(System.in);
		//provide message for user
		System.out.println("choose gender - \n male\n female\n other \n");
		//obtain user input
		String gender = scnObj.next();
		driver.findElement(By.xpath("//input[@type='radio' and @value='"+gender+"']")).click();
		Thread.sleep(10000);
		// close the browser and kill the chromedriver instance
		driver.quit();
	}
}
