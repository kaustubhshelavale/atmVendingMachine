//package com.atmvendingmachine.dto;
//
//import java.sql.Timestamp;
//import java.util.Scanner;
//
//import com.atmvendingmachine.dao.Test2;
//
//public class Test {
//
//	
//	Test2 t2 = new Test2();
//	
//	public static void main(String[] args) {
//
//		Scanner sc=new Scanner(System.in);
//		
//		Test2 t2 = new Test2();
//
//		Test t = new Test();
//System.out.println("enter amount");
//		t.transaction(sc.nextInt());
//
//	}
//
//	public void transaction(double amt) {
//
//		double balance= t2.getBalance();
//		
//		balance = balance - amt;
//
//		System.out.println("withdrawn amount is :"+amt);
//		t2.setBalance(balance);
//		System.out.println("available balance is :"+t2.getBalance());
//		
////		ac1_stmt.add(ts1 + " " + balance);
////		ac1_stmt.add(balance);
////		bank.setAC1_Bal(balance);
//
//	}
//
//}
