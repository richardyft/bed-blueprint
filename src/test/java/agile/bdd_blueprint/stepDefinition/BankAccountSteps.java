package agile.bdd_blueprint.stepDefinition;

import org.junit.Assert;

import agile.bdd_blueprint.BankAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankAccountSteps {

	private BankAccount account;

	@Given("^balance is (\\d+.\\d+)$")
	public void balance_is(double balance) throws Throwable {
		this.account = new BankAccount(balance);
	}

	@Given("^annual interest rate is (\\d+.\\d+)$")
	public void annual_interest_rate_is(double interestRate) throws Throwable {
		this.account.setInterestRate(interestRate);
	}

	@When("^calculate interest$")
	public void calculate_interest() throws Throwable {
		this.account.calculateInterest();
	}

	@Then("^balance becomes (\\d+.\\d+)$")
	public void balance_becomes(double arg1) throws Throwable {
		Assert.assertEquals(arg1, this.account.getBalance(), 0);
	}
}
