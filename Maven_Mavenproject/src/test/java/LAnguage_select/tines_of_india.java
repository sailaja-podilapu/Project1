package LAnguage_select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tines_of_india {
	WebDriver driver;
	
	@Given("user opens Times of India website")
	public void user_opens_times_of_india_website() {
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://timesofindia.indiatimes.com/");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user selects Hindi lanaguage from dropdown")
	public void user_selects_hindi_lanaguage_from_dropdown() {
		driver.findElement(By.xpath("//div[contains(@class,'language')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hindi')]")).click();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Hindi page should be displayed")
	public void hindi_page_should_be_displayed() {
		String currentUrl=driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("hindi"),"Hindi page is not displayed");
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
