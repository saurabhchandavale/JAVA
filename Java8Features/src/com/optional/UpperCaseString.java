package com.optional;

import java.util.Optional;

public class UpperCaseString {

	public static void main(String[] args) {
		Optional<String> nameContainer = getName();
		if (nameContainer.isPresent()) {
			String string = nameContainer.get();
			string = string.toUpperCase();
			System.out.println(string);
		}

		nameContainer.ifPresent(val -> System.out.println(val.toLowerCase()));
		nameContainer.ifPresentOrElse(val -> System.out.println(val.toLowerCase()),
				() -> System.out.println("not present"));

		// If value present get original value
		// If value is not present supplier functionality will produce another optional
		// with value
		String or = nameContainer.or(() -> Optional.of("Saurabh")).get();
		System.out.println(or);

		// if value is present return existing value
		// if value is not present you can configure another value
		String orElse = nameContainer.orElse("This is configured value");
		System.out.println(orElse);

		// need not to written optional value
		String orElseGet = nameContainer.orElseGet(() -> "This is not optional Value");
		System.out.println(orElseGet);

		// throw exception
		String orElseThrow = nameContainer.orElseThrow();
		System.out.println(orElseThrow);

		try {
			nameContainer.orElseThrow(() -> new Exception("Throw exception"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Optional<String> getName() {
		// return "abc"; // If I pass null here It will throw null pointer exception
		String name = null;
		Optional<String> value;
		if (name == null) {
			value = Optional.empty();
		} else {
			value = Optional.of(name);
		}
		return value;
	}

}
