package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1SolutionJava7 {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("Saurabh", "Chandavale", 24),
				new Person("Aditya", "Surana", 24),
				new Person("Aditya", "Adake", 24),
				new Person("Sunil", "Sahu", 24)
				);
		// sort list by last name
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		// Print all persons
		printAll(persons);
		System.out.println();
		//create a method that only prints last name start with C
		printLastNameStartWithC(persons);
		
		printConditionally(persons, new Condition() {

			@Override
			public boolean test(Person p) {
				return  p.getLastName().startsWith("C");
			}
			
		});
	}

	private static void printConditionally(List<Person> persons, Condition condition) {
		for(Person p : persons) {
			if(condition.test(p))
			System.out.println(p + " ------------- ");
			
		}
		
	}

	private static void printLastNameStartWithC(List<Person> persons) {
		for(Person p : persons) {
			if(p.getLastName().startsWith("C")) 
			System.out.println(p);
			
		}
		
	}

	private static void printAll(List<Person> persons) {
		for(Person p : persons) {
			System.out.println(p);
		}
	}
	
	interface Condition{
		boolean test(Person p);
	}

}
