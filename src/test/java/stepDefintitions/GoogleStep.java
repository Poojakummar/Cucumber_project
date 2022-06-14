package stepDefintitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Runner.GoogleRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStep {

	public static WebDriver driver=GoogleRunner.driver;

@Given("User Enter the Google URL")
public void user_enter_the_google_url() {
   driver.get("https://www.google.com");
}
@When("User enters the search term")
public void user_enters_the_search_term() {
    driver.findElement(By.name("q")).sendKeys("Roman Reigns");
}
@Then("User see the Search Results")
public void user_see_the_search_results() {
	System.out.println("Successfully Launched");
	driver.quit();
	
   
}
}
