package org.tse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {

	WebDriver driver;
	
	
	@Given("User is an login page")
	public void user_is_an_login_page() {
	   
		WebDriverManager.chromedriver().setup();
		
		driver  = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	}

	@When("User enter a valid username and invalid password")
	public void user_enter_a_valid_username_and_invalid_password() {
	   
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("jackiechan");
		
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("vasudev123");
	}
	

	@When("User click login button")
	public void user_click_login_button() {
	  
		WebElement lBtn = driver.findElement(By.id("login"));
		lBtn.click();
	}

	@Then("Error Message should be declared")
	public void error_Message_should_be_declared() {
	   
		System.out.println("Error message displayed..............................");
	}


	
	
}
