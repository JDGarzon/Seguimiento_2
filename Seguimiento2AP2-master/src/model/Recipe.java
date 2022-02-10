package model;

import java.util.ArrayList;
import java.util.List;

import exception.NegativeNumberException;

public class Recipe {
	private List<Ingredient> ingredients;
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			try {
				searched.addWeight(w);
			} catch (NegativeNumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	
	
	public String removeIngrdient(String n){
		Ingredient current;
		boolean flag= false;
		String message="";
		for (int i = 0; i < ingredients.size() && !flag; i++) {
			current = ingredients.get(i);
			if(current.getName().equals(n)) {
				 ingredients.remove(i);
				 message="Ingredient removed";
			}else message = "Ingredient not found";
		}

		return message;
	}
}
