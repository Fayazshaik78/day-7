package com.elc.blc;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance ;
 
public void setAccountDetails(String holder , int accNumc, double bal) {
	accountHolder = holder;
	accountNumber = accNumc;
	balance = bal;
	
	
}
public String  getAccountDetails() {
	return "Account Holder : "+accountHolder + "\nAccount Number :"+accountNumber+"\nBalance "+ balance;
	
}
}
