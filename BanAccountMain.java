package com.elc.blc;

public class BanAccountMain {
public static void main(String[] args) {
	BankAccount bank = new BankAccount();
	bank.setAccountDetails("Rahul", 123456, 5000.0);
	System.out.println(bank.getAccountDetails());
}
}
