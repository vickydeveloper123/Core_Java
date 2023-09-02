package com.encapsulation;

public class BankingDetailsRunner {

	public static void main(String[] args) {

		BankingDetails banking = new BankingDetails();

		banking.setAccountNumber(12312);
		banking.setAccountHolderName("Vignesh");
		banking.setIfscCode("SS787SC898S");
		banking.setAccountPassword(1234);

		System.out.println("AccountNumber ==>"+banking.getAccountNumber());
		System.out.println("AccouHoldName ==>"+banking.getAccountHolderName());
		System.out.println("Bank IFSC Code==>"+banking.getIfscCode());
		System.out.println("User Password ==>"+banking.getAccountPassword());
		

	}

}
