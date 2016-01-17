/**
 * 
 */
package com.designpattern.factory;

import com.designpattern.factory.Drink;

/**
 * @author jassiga
 *
 */
public class Coffee implements Drink {

	/**
	 * 
	 */
	public Coffee() {
		System.out.println("Coffee");
	}

	public Drink dispenseDrink(final CoffeeType coffeeType) {
		Drink coffee = null;
		switch (coffeeType) {
		case EXPRESSO:
			coffee = new Expresso();
			break;

		case LATTE:
			coffee = new Latte();
		}
		return coffee;
	}
}
