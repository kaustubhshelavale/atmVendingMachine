package com.atmvendingmachine.dao;

public class ABC_Bank {

	private int AC1 = 101;
	private int AC2 = 102;
	private int AC3 = 103;
	private int AC4 = 104;
	private int AC5 = 105;

	public int getAC1() {
		return AC1;
	}

	public int getAC2() {
		return AC2;
	}

	public int getAC3() {
		return AC3;
	}

	public int getAC4() {
		return AC4;
	}

	public int getAC5() {
		return AC5;
	}

	private double AC1_Bal = 1000000;
	private double AC2_Bal = 1000000;
	private double AC3_Bal = 1000000;
	private double AC4_Bal = 1000000;
	private double AC5_Bal = 1000000;

	public double getAC1_Bal() {
		return AC1_Bal;
	}

	public void setAC1_Bal(double aC1_Bal) {
		AC1_Bal = aC1_Bal;
	}

	public double getAC2_Bal() {
		return AC2_Bal;
	}

	public void setAC2_Bal(double aC2_Bal) {
		AC2_Bal = aC2_Bal;
	}

	public double getAC3_Bal() {
		return AC3_Bal;
	}

	public void setAC3_Bal(double aC3_Bal) {
		AC3_Bal = aC3_Bal;
	}

	public double getAC4_Bal() {
		return AC4_Bal;
	}

	public void setAC4_Bal(double aC4_Bal) {
		AC4_Bal = aC4_Bal;
	}

	public double getAC5_Bal() {
		return AC5_Bal;
	}

	public void setAC5_Bal(double aC5_Bal) {
		AC5_Bal = aC5_Bal;
	}

	public ABC_Bank(double aC1_Bal, double aC2_Bal, double aC3_Bal, double aC4_Bal, double aC5_Bal) {
		super();
		AC1_Bal = aC1_Bal;
		AC2_Bal = aC2_Bal;
		AC3_Bal = aC3_Bal;
		AC4_Bal = aC4_Bal;
		AC5_Bal = aC5_Bal;
	}

	public ABC_Bank() {
		// TODO Auto-generated constructor stub
	}

}
