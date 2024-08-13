package com.streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamInitialization {

	public static void main(String[] args) {
		// from collection object
		List<String> numbers = List.of("one", "two", "three");
		Stream<String> stream = numbers.stream();
		// Arrays of value
		String[] names = { "one", "two", "three" };
		Stream<String> stream2 = Arrays.stream(names);

		// stream method
		Stream<String> stream3 = Stream.of("one", "two", "three");

		// generate
		Stream<String> stream4 = Stream.generate(() -> "one");

		// builder
		// Builder design pattern
		Builder<String> streamBuilder = Stream.builder();
		Stream<String> stream5 = streamBuilder.add("one").add("two").build();

		// Empty stream

		Stream<String> stream6 = Stream.empty();

	}

}
