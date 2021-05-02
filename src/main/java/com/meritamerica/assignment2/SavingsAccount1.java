package com.meritamerica.assignment2;
public class SavingsAccount1 {
	
	private double balance;
	private final double INTERESTRATE = 0.01;
	private long acountNumber;
	
	
	public void SavingsAccount (double balance) {
		this.balance = balance; 
	}
	public SavingsAccount1(double openBalance){
		this.balance = openBalance;
		this.acountNumber = MeritBank.getNextAccountNumber();
	}
	public double getBalance() {
		return this.balance;
	
	}
	public double getInterestRate() {
		return this.INTERESTRATE;
		
	}
	public long getAccountNumber() {
		return acountNumber;
	}
	public boolean withdraw(double amount) {
		if(amount <= balance && amount>0) {
			this.balance -= amount;
			System.out.println("You withdrew: $" + amount);
			System.out.println("Your remaining balance is: $" + balance);
		if(amount <= balance && amount > 0) {
			this.balance = balance - amount;
			System.out.println("Withdrawn amount: $" + amount);
			System.out.println("Remaining balance: $" + balance);
			return true;
		}
		System.out.println("Insufficient Funds."); {
		return false; 
		}
		}
		return false;
	}
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
		if (amount > 0) {
			this.balance = balance + amount;
			System.out.println("Deposited amount: $" + amount);
			System.out.println("Total balance: $" + balance);
			return true;
		}
		System.out.println(amount + " - Invalid amount."); {
		return false;
		}
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
	@Override
	public String toString() {
		return  "Savings Account Balance: $" + getBalance() + "\n" +
				"Savings Account Interest Rate: " + INTERESTRATE + "%" + "\n" +
				"Savings Account Balance in 3 years: $" + String.format( "%.2f", futureValue(3));
		
	}
}