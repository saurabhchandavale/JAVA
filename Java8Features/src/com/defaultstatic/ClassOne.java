package com.defaultstatic;

public class ClassOne implements InterfaceOne{

	@Override
	public void printName() {
		System.out.println("Print name");
	}

	@Override
	public String getName() {
		defaultMethodOne();
		System.out.println("get name");

		return "";
	}
	@Override
	public void defaultMethodOne(){
		InterfaceOne.staticMethod();
		System.out.println("Override Default Method One");
		
	}

}
