package com.atmvendingmachine.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.atmvendingmachine.dao.ABC_Bank;
import com.atmvendingmachine.dto.ABC_Bank_DTO;
import com.atmvendingmachine.exception.ExceptionHandler;

public class ABC_Bank_Service {

	
	ABC_Bank bank = new ABC_Bank();
	
	Scanner sc = new Scanner(System.in);
	
	public  void service() {

		ABC_Bank_Service service = new ABC_Bank_Service();
		
		service.atm();
	}

	public void atm() {

		ABC_Bank_DTO dto = new ABC_Bank_DTO();
		
		System.out.println("=================================");

		ABC_Bank_Service service = new ABC_Bank_Service();

		System.out.println("press 1 to Login");
		System.out.println("press 2 to Exit");
		

		try {
			
		
		int key = sc.nextInt();

		switch (key) {
		case 1:
			
			System.out.println("Enter your Account Number");
			
			try {
				int acNumber = sc.nextInt();
				
				if (acNumber == bank.getAC1()) {
					dto.customerAccount1();		
				} else if (acNumber == bank.getAC2()) {
					dto.customerAccount2();
				} else if (acNumber == bank.getAC3()) {
					dto.customerAccount3();
				} else if (acNumber == bank.getAC4()) {
					dto.customerAccount4();
				} else if (acNumber == bank.getAC5()) {
					dto.customerAccount5();
				} else {
					System.out.println("please enter correct account number");
					service.atm();
				}
			
			} catch(Exception e){
				System.out.println("please choose correct input");
				service.atm();
			}
			break;

		case 2:
			dto.exit();
			break;
		default:
			System.out.println("please choose correct input");
			service.atm();
			break;
		}
		
	}
		catch(Exception e) {
			System.out.println("=================================");
			System.out.println("please enter correct input");
			service.service();
		}
	}

}
