package com.defaultstatic;

public interface InterfaceOne {
	
	public void printName();
	
	public String getName();
	
	default void defaultMethodOne(){
		System.out.println("Default Method One");
		
	}
	
	default String defaultMethodTwo(){
		System.out.println("Default Method Two");
		return "";
		
	}
	
	default void commonDefaultMethod(){
		System.out.println("common Default Method");
	
		
	}
	
	static void staticMethod() {
		System.out.println("Static method ");
	}



}
