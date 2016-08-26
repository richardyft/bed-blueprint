package agile.bdd_blueprint.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private WebDriver driver = new FirefoxDriver();

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		this.driver.get("http://www.store.demoqa.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		this.driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		this.driver.findElement(By.id("log")).sendKeys("bddtester_1");
		this.driver.findElement(By.id("pwd")).sendKeys("E*#0bPl)R&pnR#E@s");
		this.driver.findElement(By.id("login")).click();
	}

	@Then("^User sees the account details$")
	public void user_sees_the_account_details() throws Throwable {
		final WebElement webElement = this.driver.findElement(By.linkText("Your Account"));
		Assert.assertNotNull(webElement);
		Assert.assertEquals("Your Account", webElement.getText());
		this.driver.quit();
	}

}
