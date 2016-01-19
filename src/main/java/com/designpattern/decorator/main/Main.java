/**
 * 
 */
package com.designpattern.decorator.main;

import com.designpattern.decorator.DoubleExtra;
import com.designpattern.decorator.NoCostExtra;
import com.designpattern.decorator.Order;
import com.designpattern.decorator.Pizza;
import com.designpattern.decorator.RegularExtra;

/**
 * @author jassiga
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Order fourSeasonsPizza = new Pizza("Four Seasons Pizza", 10);
		 fourSeasonsPizza = new RegularExtra("Pepperoni", 4, fourSeasonsPizza );
		 fourSeasonsPizza = new DoubleExtra("Mozzarella", 2, fourSeasonsPizza );
		 fourSeasonsPizza = new NoCostExtra("Chili", 2, fourSeasonsPizza );
		 System.out.println(fourSeasonsPizza.getPrice());
		 System.out.println(fourSeasonsPizza.getLabel());	
	}

}
