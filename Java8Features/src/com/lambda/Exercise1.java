package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambda.Exercise1SolutionJava7.Condition;

public class Exercise1 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Saurabh", "Chandavale", 24),
				new Person("Aditya", "Surana", 24), new Person("Sunil", "Sahu", 24));

		// sort list by last name
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		// Print all persons

		// create a method that only prints last name start with C
		printLastNameStartWithC(persons);

		printConditionally(persons, p -> p.getLastName().startsWith("C"));
		System.out.println();
		printConditionally(persons, p -> true);
		
		performConditionally(persons,  p -> p.getLastName().startsWith("S"), p -> System.out.println("----- " + p.getFirstName()));
	}

	private static void performConditionally(List<Person> persons, Predicate<Person> condition, Consumer<Person> consumer) {
		
		for (Person p : persons) {
			if (condition.test(p)) {
				consumer.accept(p);
			}
				

		}
	}

	private static void printConditionally(List<Person> persons, Predicate<Person> condition) {
		for (Person p : persons) {
			if (condition.test(p))
				System.out.println(p + " ------------- ");

		}

	}

	private static void printLastNameStartWithC(List<Person> persons) {
		for (Person p : persons) {
			if (p.getLastName().startsWith("C"))
				System.out.println(p);

		}

	}

	private static void printAll(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p);
		}
	}

}
