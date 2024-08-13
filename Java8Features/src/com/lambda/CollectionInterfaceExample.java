package com.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionInterfaceExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Saurabh", "Chandavale", 24),
				new Person("Aditya", "Surana", 24),
				new Person("Aditya", "Adake", 24),
				new Person("Sunil", "Sahu", 24)
				);

		//persons.forEach(p -> System.out.println(p))
		persons.forEach( System.out::println);
	}

}
