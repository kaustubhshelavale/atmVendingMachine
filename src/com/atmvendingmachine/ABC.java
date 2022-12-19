package com.atmvendingmachine;

import com.atmvendingmachine.service.ABC_Bank_Service;

public class ABC {

	public static void main(String[] args) {
		ABC_Bank_Service service = new ABC_Bank_Service();
		System.out.println("=================================");
		System.out.println(" ==== Welcome to ABC Bank ====");
		service.service();

	}

}
