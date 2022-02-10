package model;
import static org.junit.Assert.*;

import org.junit.Test;

import exception.NegativeNumberException;

public class IngredientTest{
	
	Ingredient ingToTest;
	
	private void setupStage1() {
		ingToTest=new Ingredient("Tomate",245);
	}
	@Test
	public void test1() {
		setupStage1();
		try {
			ingToTest.addWeight(54);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(ingToTest.getWeight()==299);

	}
	@Test
	public void test2() {
		setupStage1();
		try {
			ingToTest.addWeight(-100);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(ingToTest.getWeight()==245);
	}
	@Test
	public void test3() {
		setupStage1();
		try {
			ingToTest.removeWeight(45);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(ingToTest.getWeight()==200);
	}
	@Test
	public void test4() {
		setupStage1();
		try {
			ingToTest.removeWeight(-100);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(ingToTest.getWeight()==245);
	}
}
