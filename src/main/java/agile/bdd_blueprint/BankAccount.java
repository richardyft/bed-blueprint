package agile.bdd_blueprint;

public class BankAccount {

	private double balance;
	private double interestRate;

	public BankAccount(double initialBalance) {
		this.setBalance(initialBalance);
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void calculateInterest() {
		this.balance += (this.balance * this.interestRate);
	}

}
