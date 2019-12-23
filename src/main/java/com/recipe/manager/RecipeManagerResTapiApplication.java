package com.recipe.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeManagerResTapiApplication {

	private static List<Ingredient> mshake_ingred_list;

	public static void main(String[] args) {
		SpringApplication.run(RecipeManagerResTapiApplication.class, args);
		
		Ingredient milk = new Ingredient("Milk");
		Ingredient chocolate = new Ingredient("Chocolate");

        mshake_ingred_list = new ArrayList<Ingredient>();

        mshake_ingred_list.add(milk);
        mshake_ingred_list.add(chocolate);
		
		Recipe milkshake = new Recipe(mshake_ingred_list);
		
		milkshake.printRecipe();
	}
	
}
