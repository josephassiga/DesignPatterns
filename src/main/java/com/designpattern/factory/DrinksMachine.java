/**
 * 
 */
package com.designpattern.factory;

/**
 * @author jassiga
 *
 */
public abstract class DrinksMachine {

	public abstract Drink dispenseDrink();
	
	public String displayMessage() {
		return "Thank you for you customer";
	}
}
