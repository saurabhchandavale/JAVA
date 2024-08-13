package com.lambda;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		
		doProcess(a, i -> System.out.println(a+i));
		
		
	}

	private static void doProcess(int a, Process p) {
		p.process(a);
	}

	interface Process{
		void process(int i);
	}
}
