package RadhaPracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.radha.config.Config;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_Login_Page_To_Read_From_Config 
{
	@Test
	void login()
	{
		Config confob = new Config();
		System.out.println(confob.url);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(confob.url);
	}
}
