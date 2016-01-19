/**
 * 
 */
package com.designpattern.decorator.impl;

/**
 * @author jassiga
 *
 */
public interface Product {

	public void setLabel(String label);

	public void setPrice(double price);

	public String getLabel();

	public double getPrice();

	public String generateLabel();

}
