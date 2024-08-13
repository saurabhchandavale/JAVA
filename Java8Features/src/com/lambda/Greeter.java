package com.lambda;

public class Greeter {
	public void greeter(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		MyFunction my = () -> System.out.println("HEllo");
		my.foo();
		MyAddition add = (int a, int b) -> a + b;
		int result = add.add(5, 5);
		System.out.println(result);
		
		MyLength myLength = (String s) -> s.length();
		int length = myLength.getLength("Hello");
		System.out.println(length);
	}

}

interface MyFunction {
	void foo();
}

interface MyAddition {
	int add(int a, int b);
}


interface MyLength{
	int getLength(String s);
}