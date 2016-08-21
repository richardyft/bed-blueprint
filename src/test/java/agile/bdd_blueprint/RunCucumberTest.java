package agile.bdd_blueprint;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		monochrome = true,
		plugin = {"html:target/report", "pretty"}
		)
public class RunCucumberTest {
}
