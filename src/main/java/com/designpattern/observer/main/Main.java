/**
 * 
 */
package com.designpattern.observer.main;

import com.designpattern.observer.NewsAgency;
import com.designpattern.observer.RadioChannel;

/**
 * @author jassiga
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create the observer and subject
		NewsAgency newsAgency = new NewsAgency();
		RadioChannel radioChannel = new RadioChannel();
		// Register the observer with the subject
		newsAgency.register(radioChannel);
		// Now add some news headlines
		newsAgency.addNews("Breaking news: Life found on Mars");
		newsAgency.addNews("Update: Earth invasion imminent");
		newsAgency.addNews("Just in: Hail to our new Martian overlords");
	}

}
