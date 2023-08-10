//program to demonstrate on interface
package org.tnsif.interfacekeyword;
//implementable child or child class 
public class Human implements ColdDrink, AlcoholDrinks {
	@Override
	public void showDrink() {
		System.out.println("Name of Cold Drink: "+coldDrinkName+", "
		+"Type of Alcohol: "+alcoholType+", "+"Brand Name: "+brand);
	}
}