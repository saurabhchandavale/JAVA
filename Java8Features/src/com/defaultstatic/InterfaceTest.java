package com.defaultstatic;

public class InterfaceTest {

	public static void main(String[] args) {

		ClassOne classOne = new ClassOne();
//		classOne.getName();
//		classOne.defaultMethodTwo();
//		classOne.defaultMethodOne();
		
		ClassTwo classTwo = new ClassTwo();
		classOne.defaultMethodOne();
		classTwo.defaultMethod();
		
		classTwo.commonDefaultMethod();
		
		InterfaceOne.staticMethod();
	}

}
