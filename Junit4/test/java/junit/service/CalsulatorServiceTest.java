package junit.service;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import junit.logic.service.CalculatorService;

public class CalsulatorServiceTest {
	
	int counter = 0;
	//Before and after is used to setup environment and teardown the environment
	//both this methods are class level there for methods should be static
	//To run anything before execution of test
	@BeforeClass
	public static void inti() {
		Date date = new Date();
		System.out.println("Test case start date " + date);
	}
	@Before // before start of test
	public void beforeTest() {
		System.out.println("Before test ");
		counter = 0;
	}

	@Test
	public void addTwoNumbersTest() {
		System.out.println("addTwoNumbersTet testcase");
		for(int i = 0; i < 5; i++) {
			counter++;
		}
		System.out.println(counter);
		int result = CalculatorService.add(5, 25);
		int expectedResult = 30;
		
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void sumAnyNumberTest() {
		System.out.println("sumAnyNumbersest testcase");
		for(int i = 0; i < 5; i++) {
			counter++;
		}
		System.out.println(counter);
		int result = CalculatorService.sumAny(5, 25,5,5);
		int expectedResult = 40;
		
		Assert.assertEquals(expectedResult, result);
	}
	
	@After // after test
	public void afterTest() {
		System.out.println("After test ");
	}
	
	//To run anything after test
	@AfterClass
	public static void cleanup() {
		System.out.println("Close all connections");
	}
}

