/**
 * 
 */
package com.designpattern.factory;

import com.designpattern.factory.Drink;

/**
 * @author jassiga
 *
 */
public class CoffeMachine extends DrinksMachine {

	/* (non-Javadoc)
	 * @see com.designpattern.factory.DrinksMachine#dispenseDrink()
	 */
	@Override
	public Drink dispenseDrink() {
    return new Coffee();
	}

	
}
