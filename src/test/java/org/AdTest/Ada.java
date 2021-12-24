package org.AdTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ada {

	WebDriver driver;

	@Given("user is an hotel login page")
	public void user_is_an_hotel_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();
	}

	@When("user should enter valid {string} and {string}")
	public void user_should_enter_valid_and(String userNam, String string2) {

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(userNam);

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(string2);

	}

	@When("user should click login button")
	public void user_should_click_login_button() {

		WebElement loginBtn = driver.findElement(By.id("login"));

		loginBtn.click();

	}

	@When("user sholud choose hotel {string} ,{string} ,{string} ,{string} ,{string} ,{string} ,{string} ,{string}")
	public void user_sholud_choose_hotel(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {

		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByVisibleText(string);

		WebElement hot = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hot);
		s1.selectByVisibleText(string2);

		WebElement rType = driver.findElement(By.id("room_type"));
		Select s2 = new Select(rType);
		s2.selectByVisibleText(string3);

		WebElement rNo = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rNo);
		s3.selectByVisibleText(string4);

		WebElement cInDate = driver.findElement(By.id("datepick_in"));
		cInDate.sendKeys(string5);

		WebElement cOutDate = driver.findElement(By.id("datepick_out"));
		cOutDate.sendKeys(string6);

		WebElement aRoom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(aRoom);
		s4.selectByVisibleText(string7);

		WebElement cRoom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(cRoom);
		s5.selectByVisibleText(string8);

	}

	@When("user should click search button")
	public void user_should_click_search_button() {
		WebElement searchBtn = driver.findElement(By.id("Submit"));
		searchBtn.click();
	}

	@When("user should select the hotel and click continue")
	public void user_should_select_the_hotel_and_click_continue() {

		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();

		WebElement contBtn = driver.findElement(By.id("continue"));
		contBtn.click();
	}

	@When("user should update profile information {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_update_profile_information(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {

		WebElement fName = driver.findElement(By.id("first_name"));
		fName.sendKeys(string);

		WebElement lName = driver.findElement(By.id("last_name"));
		lName.sendKeys(string2);

		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys(string3);

		WebElement cardNum = driver.findElement(By.id("cc_num"));
		cardNum.sendKeys(string4);

		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(cardType);
		s7.selectByVisibleText(string5);

		WebElement expM = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(expM);
		s8.selectByVisibleText(string6);

		WebElement expY = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(expY);
		s9.selectByVisibleText(string7);

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(string8);

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}

	@Then("user should be in Booking Conformation page")
	public void user_should_be_in_Booking_Conformation_page() throws InterruptedException {

		System.out.println("user booking is confirmed....................................");

		Thread.sleep(7000);

		WebElement id = driver.findElement(By.id("order_no"));
		String attribute = id.getAttribute("value");
		System.out.println("Booking PNR number:" + attribute);

		driver.quit();
	}

}
