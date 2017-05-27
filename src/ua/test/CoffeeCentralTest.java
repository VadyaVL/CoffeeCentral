/**
 * CoffeeCentralTest.java
 * using hamcrest lib for JUNIT
 * @since 27:05:2017
 * @author Vadym
 */
package ua.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ua.coffee.Answer;
import ua.coffee.Main;

public class CoffeeCentralTest {

	@Test
	public void checkLoadDataFromFile() {
		List<String> input = Main.getTownCaseFromFile("input.txt");
		List<String> mustBe = new ArrayList<>();
		mustBe.add("4 4 5 3\n1 1\n1 2\n3 3\n4 4\n2 4\n1\n2\n4\n0 0 0 0");
		
		System.out.println(input.size());
		assertThat("Parse invalid!", mustBe, is(Main.getResult(input)));		
	}
	
	@Test
	public void checkResultTestOne() {
		List<String> input = new ArrayList<>();
		input.add("4 4 5 3\n1 1\n1 2\n3 3\n4 4\n2 4\n1\n2\n4\n0 0 0 0");
		
		List<Answer> mustBe = new ArrayList<>();
		mustBe.add(new Answer(3, 3, 4));
		mustBe.add(new Answer(4, 2, 2));
		mustBe.add(new Answer(5, 3, 1));
		
		assertThat("Different result!", mustBe, is(Main.getResult(input)));		
	}
	
	@Test
	public void checkResultTestTwo() {

		List<String> input = new ArrayList<>();
		input.add("4 4 5 3\n1 1\n1 2\n3 3\n4 4\n2 4\n1\n2\n4\n0 0 0 0");
		
		int mustBe = 3;
		
		assertEquals("Different result!", mustBe, Main.getResult(input).size());
	}

}
