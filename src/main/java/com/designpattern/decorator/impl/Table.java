/**
 * 
 */
package com.designpattern.decorator.impl;

import com.designpattern.decorator.impl.Product;

/**
 * @author jassiga
 *
 */

public class Table implements Product {

	private String label = "Dining Table";

	private double price = 100.00;

	
	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String generateLabel() {
		return price + ", " + label;
	}

}
