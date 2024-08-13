package com.defaultstatic;

public class ClassTwo implements InterfaceOne, InterfaceTwo {

	@Override
	public void printName() {
		
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void commonDefaultMethod() {
		// TODO Auto-generated method stub
		InterfaceOne.super.commonDefaultMethod();
		InterfaceTwo.super.commonDefaultMethod();
	}

}
