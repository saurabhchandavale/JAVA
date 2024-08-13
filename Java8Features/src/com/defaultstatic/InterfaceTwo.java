package com.defaultstatic;

public interface InterfaceTwo {
	default void defaultMethod() {
		System.out.println("Testing implemention of two interfaces");
	}
	
	default void commonDefaultMethod(){
		System.out.println("Default Method Interface two");
		
		
	}
}
