package pkg_StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	WebDriver driver;
	
	@Given("Open Chrome")
	public void open_Chrome() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/Users/aravinthraj/Eclipse Utilities/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Then("Navigate to {string}")
	public void navigate_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	}

	@Then("Type {string} in google text box")
	public void type_in_google_text_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(string);
	}
	
	public static void myName() {
		System.out.println("Aravinth Raj");
	}
	
	@Then("Kill Browser")
	public void kill_Browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.manage().deleteAllCookies();
	    driver.quit();
	}

}
