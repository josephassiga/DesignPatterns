/**
 * 
 */
package com.designpattern.decorator;

/**
 * @author jassiga
 *
 */
public class NoCostExtra extends Extra {

	public NoCostExtra(String label, double price, Order order) {
		super(label, price, order);
	}

	public double getPrice() {
		return order.getPrice();
	}
}
