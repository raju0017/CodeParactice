package com.nag.factoryMethod;

public class CheesePizza implements Pizza {
	
	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for cheese pizza.");
	}

}
