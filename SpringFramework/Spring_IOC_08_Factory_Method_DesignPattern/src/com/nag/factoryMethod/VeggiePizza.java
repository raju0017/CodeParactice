package com.nag.factoryMethod;

public class VeggiePizza implements Pizza{

	@Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
