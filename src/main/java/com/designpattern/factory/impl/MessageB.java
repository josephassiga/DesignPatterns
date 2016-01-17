/**
 * 
 */
package com.designpattern.factory.impl;

import javax.enterprise.inject.Alternative;

/**
 * @author jassiga
 *
 */

@Alternative
public class MessageB {
	
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(final String message) {
		this.message = message;
	}

}
