package com.meritamerica.assignment2;
import java.util.Date;
public class CDAccount1 extends BankAccount {
	CDOffering offering;
	Date date;
	private double balance;
	private Date startDate;
	private long accountNumber;
	public CDAccount1(CDOffering offering, double openingBalance) {
		this.offering = offering;
		this.balance = openingBalance;
	}
	public void CDAccount(CDOffering offering, double openBalance) {
		this.date = new Date();
		this.offering = offering;
		this.balance = openBalance;
		this.accountNumber = MeritBank.getNextAccountNumber();
	}
	public double getBalance() {
		return this.balance;
		
	}
	public double getInterestRate() {
		return this.offering.getInterestRate();
			
		
	}
	public int getTerm() {
		return this.offering.getTerm();
		
	}
	public Date getStartDate() {
		return this.startDate;
	
		
	}
	public long getAccountNumber() {
		return this.accountNumber;
		
	}
	public double futureValue(int term) {
		double futureValue1;
		if (term <= 0) {
			System.out.println("Invalid period of time");
			return -1;
		} else {
			futureValue1 = balance * Math.pow((1+getInterestRate()), term);
			return futureValue1; } 
		}
	
		public double futureValue() {
		return balance * Math.pow(1 + getInterestRate(), getTerm());
	}

}	
