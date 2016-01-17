/**
 * 
 */
package com.designpattern.factory;

/**
 * @author jassiga
 *
 */
public interface AbstractDrinksMachineFactory {

	DrinksMachine createCoffeeMachine();
	DrinksMachine createSoftDrinksMachine();
}
