package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchSteps extends googleBase{

	//WebDriver driver;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	    
		launchBrowser();
	  
	}

	@When("I enter search {string}")
	public void i_enter_search(String searchData) {
	    
	 WebElement searchBx;
	 
	 searchBx = driver.findElement(By.name("q"));
	 
	 searchBx.sendKeys(searchData);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    
	    WebElement searchBtn;
	    
	    searchBtn = driver.findElement(By.name("btnK"));
	    
	    searchBtn.click();
	    
	}

	@Then("I receive related search results")
	public void i_receive_related_search_results() {
	    
		WebElement resultStats;
		
		resultStats = driver.findElement(By.id("result-stats"));
		String result = resultStats.getText();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(result);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		closeBrowser();
		//driver.close();
	}
	
}
