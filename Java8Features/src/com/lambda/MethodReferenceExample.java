package com.lambda;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		/*Thread thread = new Thread(() -> process());
		thread.start();*/
		
		Thread thread = new Thread(MethodReferenceExample::process);
		thread.start();
	}
	
	public static void process() {
		System.out.println("Hello");
	}

}
