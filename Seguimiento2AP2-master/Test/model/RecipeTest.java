package model;
import static org.junit.Assert.*;

import org.junit.Test;



public class RecipeTest{
	
	private Recipe tester;
	
	private void setupStage1() {
		tester=new Recipe();
	}
	private void setupStage2() {
		tester=new Recipe();
		tester.addIngredient("Cebolla",315);
		tester.addIngredient("Ajo",58);
		tester.addIngredient("Arroz",520);
	}
	@Test
	public void test1() {
		setupStage1();
		tester.addIngredient("Sal",12);
		Ingredient toTest=  tester.getIngredients().get(1);
		assertTrue(toTest.getName().equals("Sal")&&toTest.getWeight()==12);
	}
	@Test
	public void test2() {
		setupStage2();
		tester.addIngredient("Pimienta",6);
		int size=tester.getIngredients().size();
		Ingredient toTest=tester.getIngredients().get(4);
		assertTrue(size==4&&toTest.getName()=="Pimienta"&&toTest.getWeight()==6);
	}
	@Test
	public void test3() {
		setupStage2();
		tester.addIngredient("Ajo",21);
		int size=tester.getIngredients().size();
		Ingredient ajo=tester.getIngredients().get(2);
		assertTrue(size==3&&ajo.getWeight()==79);
	}
	@Test
	public void test4() {
		setupStage2();
		tester.removeIngrdient("Ajo");
		int size=tester.getIngredients().size();
		Ingredient onion=tester.getIngredients().get(1);
		Ingredient rice=tester.getIngredients().get(2);
		assertTrue(size==2&&onion.getName().equals("Cebolla")&&rice.getName().equals("Arroz"));
	}
}
