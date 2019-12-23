package com.recipe.manager;

import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe(List<Ingredient> ingredients) {
		this.ingredients = ingredients; 
	}
	
    public void printRecipe(){
        for(Ingredient i : this.ingredients) {
            System.out.println(i.getName());
        }
    }
	
}
