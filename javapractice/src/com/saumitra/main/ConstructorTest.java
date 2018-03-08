package com.saumitra.main;

public class ConstructorTest {

	public int varA;
	public String varB;
	public double varC;
	public long varD;
	
	public int varA1;
	public String varB1;
	public double varC1;
	public long varD1;
	
	private int varA2;
	private String varB2;
	private double varC2;
	private long varD2;
	
	public ConstructorTest() {
		this.varA1 = 100;
		this.varB1 = "Saumitra";
		this.varC1 = 10000000.10001;
		this.varD1 = 500000000;
		
		this.varA2 = 200;
		this.varB2 = "Dosaumitra";
		this.varC2 = 2000000.20002;
		this.varD2 = 1000000000;
	};
	
	public static void main(String[] args) {
	
		/**
		 * To print values of variables defined
 		 * */

		ConstructorTest test = new ConstructorTest();
		SomeClass someClass = new SomeClass();
		
		System.out.println("Value of VarA: "+ test.varA);
		System.out.println("Value of VarB: "+ test.varB);
		System.out.println("Value of VarC: "+ test.varC);
		System.out.println("Value of VarD: "+ test.varD);
		
		System.out.println("Value of VarA1: "+ test.varA1);
		System.out.println("Value of VarB1: "+ test.varB1);
		System.out.println("Value of VarC1: "+ test.varC1);
		System.out.println("Value of VarD1: "+ test.varD1);
		
		System.out.println("Value of VarA2: "+ test.varA2);
		System.out.println("Value of VarB2: "+ test.varB2);
		System.out.println("Value of VarC2: "+ test.varC2);
		System.out.println("Value of VarD2: "+ test.varD2);
		
		someClass.doSomething();
	}

}
