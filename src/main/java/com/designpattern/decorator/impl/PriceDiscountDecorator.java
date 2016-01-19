/**
 * 
 */
package com.designpattern.decorator.impl;

import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

/**
 * @author jassiga
 *
 */
public class PriceDiscountDecorator implements Product {

	@Override
	public void setLabel(String label) {
	}

	@Override
	public void setPrice(double price) {

	}

	@Override
	public String getLabel() {
		return null;
	}

	@Override
	public double getPrice() {
		return 0;
	}

	@Any
	@Inject
	@Delegate
	private Product product;

	public String generateLabel() {
		product.setPrice(product.getPrice() * 0.5);
		product.setLabel(product.getLabel() + " (Discounted)");
		return product.generateLabel();
	}

}
