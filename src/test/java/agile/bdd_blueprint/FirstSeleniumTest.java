package agile.bdd_blueprint;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	@Test
	public void testOpenGoogle() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		driver.quit();
		Assert.assertEquals("Google", title);
	}
}