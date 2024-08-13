package com.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello with implation ");
				
			}
			
		});
		
		myThread.start();
		
		
		Thread myThread1 = new Thread(() -> System.out.println("In line implementation "));
		myThread1.run();
	}

}
