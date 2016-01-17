/**
 * 
 */
package com.designpattern.factory;

/**
 * @author jassiga
 *
 */
public class SoftDrinksMachine extends DrinksMachine{

	/* (non-Javadoc)
	 * @see com.designpattern.factory.DrinksMachine#dispenseDrink()
	 */
	@Override
	public Drink dispenseDrink() {
       return new SoftDrink();
	}

}
