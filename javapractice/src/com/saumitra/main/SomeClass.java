package com.saumitra.main;

public class SomeClass {
	
	private String message;
	
	public void doSomething() {
		
		SomeClass itsObject = new SomeClass();
		ConstructorTest test2 = new ConstructorTest();
		
		/**
		 * varB2 is not visible here since it is private throws compilation error
		 * */
		//itsObject.message = "Value of VarB2: "+ test2.varB2;
		
		itsObject.message = "Value of VarB1" + test2.varB1;
		
		System.out.println("The message is: "+ itsObject.message);
	}

}
