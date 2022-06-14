package Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\Cucumberproject\\src\\test\\java\\Feature\\google.feature"
,glue ="stepDefintitions")
public class GoogleRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver= new ChromeDriver();
	}

}
