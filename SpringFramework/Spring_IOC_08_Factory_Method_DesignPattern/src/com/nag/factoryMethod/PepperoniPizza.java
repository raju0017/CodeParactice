package com.nag.factoryMethod;

public class PepperoniPizza implements Pizza{

	@Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
