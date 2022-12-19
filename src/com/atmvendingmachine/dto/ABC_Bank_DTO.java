package com.atmvendingmachine.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import com.atmvendingmachine.dao.ABC_Bank;
import com.atmvendingmachine.service.ABC_Bank_Service;

public class ABC_Bank_DTO extends ABC_Bank {

	ABC_Bank bank = new ABC_Bank();

	ABC_Bank_Service service = new ABC_Bank_Service();

	ArrayList<Object> ac1_stmt = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	Date date = new Date();

	public void exit() {
		System.out.println("====== Thank you for connecting with us ! ==========");
	}

	public void cancel() {
		service.atm();
	}

	public void transaction(double trAmt) {
		double balance = bank.getAC1_Bal();

		if (balance >= trAmt && trAmt > 0 && trAmt % 500 == 0) {
			balance = balance - trAmt;
			System.out.println("withdrawn amount is :" + trAmt);
			Timestamp ts1 = new Timestamp(date.getTime());
			ac1_stmt.add(ts1 + " the debited amount is :  " + trAmt + " and available balance  " + balance);
			bank.setAC1_Bal(balance);
			System.out.println("available balance is :" + bank.getAC1_Bal());
		} else {
			System.out.println("transaction failed");
		}
	}

	public void customerAccount1() {
		System.out.println("=================================");
		System.out.println("enter 1 for check balance");
		System.out.println("enter 2 for withdraw");
		System.out.println("enter 3 for Mini statement (last 5 transaction)");
		System.out.println("enter 4 for cancel");

		int key = sc.nextInt();

		switch (key) {
		case 1:
			System.out.println(bank.getAC1_Bal());
			customerAccount1();
			break;
		case 2:
			System.out.println("enter ammount in the multiple 500");
			transaction(sc.nextInt());
			customerAccount1();
			break;
		case 3:

			if (ac1_stmt.isEmpty()) {
				System.out.println("nothing");
				System.out.println(ac1_stmt);

			} else {
				Collections.reverse(ac1_stmt);
				for (int i = 0; i < 5 && i < ac1_stmt.size(); i++) {
					System.out.println(ac1_stmt.get(i));
				}
				Collections.reverse(ac1_stmt);
			}
			
			customerAccount1();
			break;

		case 4:
			cancel();
			break;

		default:
			System.out.println("please enter correct input");
			customerAccount1();
			break;
		}

	}

	public void customerAccount2() {
		System.out.println("Hello! \nyour account number is : " + bank.getAC2() + "\n=========================");
		service.atm();
	}

	public void customerAccount3() {

		System.out.println("Hello! \nyour account number is : " + bank.getAC3() + "\n=========================");
		service.atm();
	}

	public void customerAccount4() {
		System.out.println("Hello! \nyour account number is : " + bank.getAC4() + "\n=========================");

		service.atm();
	}

	public void customerAccount5() {
		System.out.println("Hello! \nyour account number is : " + bank.getAC5() + "\n=========================");

		service.atm();

	}

}
