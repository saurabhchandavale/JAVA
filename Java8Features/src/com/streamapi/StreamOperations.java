package com.streamapi;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		List<Employees> employeeList = employeeList();
		List<String> empName = new ArrayList<String>();
		for (Employees emp : employeeList) {
			empName.add(emp.getName());
		}
		System.out.println(empName);

		Stream<Employees> stream = employeeList.stream();
		List<String> eName = stream.map(emp -> emp.getName()).toList();
		System.out.println("Emp name  " + eName);

		List<String> eAge = employeeList.stream().filter(emp -> emp.getAge() > 25).map(emp -> emp.getName()).toList();
		System.out.println("Name of employee by age " + eAge);

		employeeList.stream().map(emp -> emp.getCity()).distinct().forEach(System.out::println);

		long count = employeeList.stream().filter(emp -> emp.getSalary() > 5000).count();
		System.out.println(count);

		// get first 3 employees

		List<Employees> first3Employee = employeeList.stream().limit(3).toList();
		System.out.println(first3Employee);

		// skip first 2
		List<Employees> skipfirst2 = employeeList.stream().skip(2).toList();
		System.out.println(skipfirst2);

		// verfiy any employee < 18
		boolean anyMatch = employeeList.stream().anyMatch(emp -> emp.getAge() < 18);
		System.out.println(anyMatch);

		// check every employee joined after 2021
		boolean allMatch = employeeList.stream().allMatch(emp -> emp.getYearOfJoining() > 2021);
		System.out.println(allMatch);

		// opposite to allMatch
		boolean noneMatch = employeeList.stream().noneMatch(emp -> emp.getYearOfJoining() < 2019);
		System.out.println(noneMatch);

		Employees employees = employeeList.stream().findAny().get();
		System.out.println(employees);

		Employees employees2 = employeeList.stream().findFirst().get();
		System.out.println(employees2);

		List<Integer> sortesList = employeeList.stream().map(emp -> emp.getId()).sorted().toList();
		System.out.println(sortesList);

		// sorted employee objects
		List<Employees> soretdEmployees = employeeList.stream().sorted((e1, e2) -> {
			return e1.getId() - e2.getId();
		}).toList();
		System.out.println(soretdEmployees);

		// get minium salary
		Employees employees3 = employeeList.stream().min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
		System.out.println(employees3);

		// find max salary

		Employees employees4 = employeeList.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
		System.out.println(employees4);

		// track how many employees are processed
		System.out.println("******************Peek()********************");
		List<Employees> employees5 = employeeList.stream().peek(System.out::println)
				.filter(emp -> emp.getYearOfJoining() > 2020).toList();
		System.out.println(employees5);

		// average

		double average = employeeList.stream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble();
		System.out.println(average);

		// collect employees and their salary

		Map<Integer, Double> collect = employeeList.stream()
				.collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getSalary()));
		System.out.println(collect);

		// grouping BY
		Map<String, Double> collect2 = employeeList.stream().collect(
				Collectors.groupingBy(emp -> emp.getGender(), Collectors.averagingDouble(emp -> emp.getSalary())));
		System.out.println(collect2);

		// get count gender wise
		Map<String, Long> collect3 = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));
		System.out.println(collect3);
		// summing salary
		Double collect4 = employeeList.stream().collect(Collectors.summingDouble(emp -> emp.getSalary()));
		System.out.println(collect4);

		// summing salary with details
		DoubleSummaryStatistics collect5 = employeeList.stream()
				.collect(Collectors.summarizingDouble(emp -> emp.getSalary()));
		System.out.println(collect5);

		// find max age
		Optional<Employees> collect6 = employeeList.stream()
				.collect(Collectors.maxBy((e1, e2) -> e1.getAge() - e2.getAge()));
		System.out.println(collect6);

		// All department name with delimeters :::
		String collect7 = employeeList.stream().map(emp -> emp.getApartment()).collect(Collectors.joining(":::"));
		System.out.println(collect7);
	}

	public static List<Employees> employeeList() {
		List<Employees> eList = new ArrayList<Employees>();
		eList.add(new Employees(11, "Saurabh", "Chopadi", 24, "Male", "MyOwn", 2022, 6000));
		eList.add(new Employees(2, "Bhagwan", "Kolhapur", 26, "Male", "MyOwn", 2017, 7000));
		eList.add(new Employees(23, "Ram", "Aayodhya", 24, "Female", "MyOwn", 2022, 600));
		eList.add(new Employees(14, "Sham", "Chopadi", 24, "Female", "MyOwn", 2020, 4400));

		return eList;
	}

}
