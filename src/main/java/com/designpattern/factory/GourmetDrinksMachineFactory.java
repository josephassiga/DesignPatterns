/**
 * 
 */
package com.designpattern.factory;

import com.designpattern.factory.AbstractDrinksMachineFactory;

/**
 * @author jassiga
 *
 */
public class GourmetDrinksMachineFactory
		implements AbstractDrinksMachineFactory {

	/* (non-Javadoc)
	 * @see com.designpattern.factory.AbstractDrinksMachineFactory#createCoffeeMachine()
	 */
	@Override
	public DrinksMachine createCoffeeMachine() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.factory.AbstractDrinksMachineFactory#createSoftDrinksMachine()
	 */
	@Override
	public DrinksMachine createSoftDrinksMachine() {
		// TODO Auto-generated method stub
		return null;
	}

}
