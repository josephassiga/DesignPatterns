/**
 * 
 */
package com.designpattern.factory.impl;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 * @author jassiga
 *
 */
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ClientMessage {

	@Inject @ShortMessage
	private MessageA messageA;
	
	@Inject @LongMessage
	private MessageB messageB;
	
	public void  doEvent() {
		messageA.setMessage("This is a long email message.");
		messageA.setMessage("This is a short sms message.");
		
		messageA.getMessage();
		messageB.getMessage();
	}
	
}
