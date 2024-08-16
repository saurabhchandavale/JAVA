package junit.logic.service;

public class CalculatorService {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int product(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static int sumAny(int... numbers) {
		int s = 0;
		for (int n : numbers) {
			s += n;
		}
		return s;
	}

}
