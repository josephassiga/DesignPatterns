/**
 * 
 */
package com.designpattern.factory.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.designpattern.factory.impl.MyEvent.Type;

/**
 * @author jassiga
 * 
 * When you run and invoke the startService method, the string value in the
 * producer method is injected into the message member of EventService and
 * printed to the console. This is the simplest possible implementation of the
 * factory pattern in Java EE. However, it raises one important question: How
 * does the Context Dependency Injection (CDI) container know that it must
 * inject the string produced by the getMessage method into the message member
 * of EventService?
 */

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {

//	@Inject
//	private String message;
	
	@Inject
	@MyEvent(Type.LOGGING)
	private MessageA messageA;
	
	@Inject
	@MyEvent(Type.MESSAGE)	
	private MessageB messageB;
	

	public void startService() {
		
		messageA.setMessage("This is message A");
		
		messageB.setMessage("This is message B");
		
		System.out.println("Start service call " + messageA.getMessage());
		
		System.out.println("Start service call " + messageB.getMessage());
	}
}
