/**
 * 
 */
package com.designpattern.decorator;

import com.designpattern.decorator.Order;

/**
 * @author jassiga
 *
 */
public class Pizza implements Order {

	private double price;

	private String label;

	/**
	 * 
	 */
	public Pizza(final String label, final double price) {
		this.label = label;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getLabel() {
		return label;
	}
	
	
  @Override
	public String toString() {
		return "Pizza [price=" + price + ", label=" + label + "]";
	}

public static void main(final String[] args)
  {
	  Order fourSeasonPizza = new Pizza("Four season pizza", 10);
	  System.out.println(fourSeasonPizza);
  }
}
