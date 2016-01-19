/**
 * 
 */
package com.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jassiga
 *
 */
public class RadioChannel implements Observer {

	@Override
	public void update(final Observable agency, final Object newsItem) {
		if (agency instanceof Publisher) {
			System.out.println((String) newsItem);
		}
	}

	
	public void update(float t, float h, float p) {

	}

}
