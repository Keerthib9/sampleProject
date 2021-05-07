package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable {

	WebDriver driver;

	@Given("Launch browser")
	public void launch_browser() {

		System.setProperty("webdriver.gecko.driver", "src\\\\main\\\\resources\\\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("User enters url")

	public void user_enters_url() {

		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();

	}

	@And("He enters userName")

	public void he_enters_userName() {


		driver.findElement(By.id("Email")).sendKeys("vishnu@vmail.com");

	}

	@When("He enters password")

	public void he_enters_password() {


		driver.findElement(By.id("Password")).sendKeys("123456");

	}

	@Then("Home page is displayed")

	public void home_page_is_displayed() {

		System.out.println("home page");


		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();

	}

}
