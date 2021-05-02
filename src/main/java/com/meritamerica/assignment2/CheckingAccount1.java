package com.meritamerica.assignment2;
public class CheckingAccount1 {
	private double balance;
	private final double INTERESTRATE = 0.0001;
	private final double INTEREST_RATE = 0.0001;
	private long accountNumber;
	
	
	public CheckingAccount1(double openingBalance) {
		this.balance = openingBalance;
	}
	public void CheckingAccount(double openBalance) {
		this.balance = openBalance;
		this.accountNumber = MeritBank.getNextAccountNumber();
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return INTERESTRATE;
	}
	public boolean withdraw(double amount) {
		if(amount <= balance && amount>0) {
			this.balance -= amount;
			System.out.println("You withdrew: $" + amount);
			System.out.println("Your remaining balance is: $" + balance);
		if(amount <= balance && amount > 0) {
			this.balance = balance - amount;
			System.out.println("Withdrawn amount: " + amount);
			System.out.println("Remaining balance: " + balance);
			return true;
		}
		System.out.println("Insufficient Funds.");
		return false;
		}
		return false;
		
	}
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
		if (amount > 0) {
			this.balance = balance + amount;
			System.out.println("Deposited amount: " + amount);
			System.out.println("Total balance: " + balance);
			return true;
		}
		System.out.println(amount + " - Invalid amount.");
		return false;
	}
		return false;
	}
	public double futureValue(int years) {
		double futureValue;
		if (years <= 0) {
			System.out.println("Invalid period of time");
			return -1;
		} else {
			futureValue = balance * Math.pow((1 + INTERESTRATE), years);
			return futureValue;
		}
	}
	public double getBalance1() {
		return balance;
	}
	public double getInterestRate1() {
		return INTEREST_RATE;
	}
	@Override
	public String toString() {
		return  "Checking Account Balance: $" + getBalance() + "\n" +
				"Checking Account Interest Rate: " + String.format( "%.4f", INTERESTRATE)+ "%" + "\n" +
				"Checking Account Balance in 3 years: $" + String.format( "%.2f", futureValue(3));	
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String toString1() {
		return "Checking Account Balance: $" + getBalance() + "\n" + "Checking Account Interest Rate: " + INTEREST_RATE
				+ "\n" + "Checking Account Balance in 3 years: $" + futureValue(3);
	}
}
