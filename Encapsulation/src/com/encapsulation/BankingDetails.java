package com.encapsulation;

public class BankingDetails {

	int accountNumber;

	String accountHolderName;

	private int accountPassword;

	String ifscCode;

	public BankingDetails() {

		System.out.println(" Default Banking Constructor is Running ");

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {

		this.accountNumber = accountNumber;

	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

}
