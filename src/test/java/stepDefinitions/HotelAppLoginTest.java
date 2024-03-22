package stepDefinitions;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLoginTest {
	
	WebDriver driver;
	@Given("I want to login into hotel app using valid username as {string}")
	public void i_want_to_login_into_hotel_app_using_valid_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(string);
		
	}

	@Given("valid password as {string}")
	public void valid_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("login")).click();
	}

	@Then("I have to get redirected to another page")
	public void i_have_to_get_redirected_to_another_page() {
	    // Write code here that turns the phrase above into concrete actions
//		String Expected="Hello Sudeepthi01!";
//		String Actual = driver.findElement(By.id("username_show")).getAttribute("value");
//		  AssertJUnit.assertTrue(Actual.equalsIgnoreCase(Expected));
//		
		
		
	}
	@Then("I select location as {string}")
	public void i_select_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Click on the search button")
	public void click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("Submit")).click();
	}

	@Then("I can see the hotel")
	public void i_can_see_the_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
System.out.println("heloo")






}
