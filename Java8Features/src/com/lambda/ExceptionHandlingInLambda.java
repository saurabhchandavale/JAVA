package com.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandlingInLambda {

	public static void main(String[] args) {

		int numbers[] = {1,2,3,4,5};
		int key = 0;
		
		process(numbers,key, wrappedLambda((n,k) -> System.out.println(n/k)));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer,Integer> consumer) {

		for(int i : numbers) {
			consumer.accept(i, key);
		}
	}
	
	private static  BiConsumer<Integer,Integer> wrappedLambda(BiConsumer<Integer,Integer> consumer) {
		return (n , k) -> {
			try {
			consumer.accept(n, k);
			}catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception " + e);
			}
		};
	}
}
