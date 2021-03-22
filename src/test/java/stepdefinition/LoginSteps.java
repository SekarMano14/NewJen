package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;

	@Given("The user in Fb page")
	public void the_user_in_Fb_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("The user has to fill {string} and {string}")
	public void the_user_has_to_fill_and(String user, String pass) {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("The user navigate to coreesponding page")
	public void the_user_navigate_to_coreesponding_page() {
		System.out.println("User login successfully");
		driver.quit();
	}
	@When("The has to fill all details to the fileds")
	public void the_has_to_fill_all_details_to_the_fileds() {
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
	}
	@Then("The user successfully registred the facebook application")
	public void the_user_successfully_registred_the_facebook_application() {
		System.out.println("User successfully registerd");
		driver.quit();
	}

}
