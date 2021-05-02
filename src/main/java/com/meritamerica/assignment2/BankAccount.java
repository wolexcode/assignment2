package com.meritamerica.assignment2;

public class BankAccount {
	private double balance;
	private double interestRate;
	private long accountNumber;
	
	public BankAccount() {
		
	}
	public BankAccount(double balance, double interestRate, long accountNumber) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNumber = accountNumber;
	}
	public BankAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean withdraw(double amount) {
		
		return true;
	}
	public boolean deposit( double amount) {
		System.out.println ("Deposit");
		balance += amount;
		return true;
	}
	public double futureValue(int years) {
		
		return 0.0;
	}
}
