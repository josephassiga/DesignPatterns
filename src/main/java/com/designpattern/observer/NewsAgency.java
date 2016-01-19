/**
 * 
 */
package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author jassiga
 *
 */
public class NewsAgency extends Observable implements Publisher {

	private List<Observer> channels = new ArrayList<>();

	public void addNews(String newsItem) {
		notifyObservers(newsItem);
	}

	public void notifyObservers(String newsItem) {
		for (Observer outlet : this.channels) {
			outlet.update(this, newsItem);
		}
	}

	public void register(Observer outlet) {
		channels.add(outlet);
	}	
}
