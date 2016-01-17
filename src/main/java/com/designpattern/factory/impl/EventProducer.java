/**
 * 
 */
package com.designpattern.factory.impl;

import javax.enterprise.inject.Produces;

import com.designpattern.factory.impl.MyEvent.Type;

/**
 * @author jassiga
 *
 */
public class EventProducer {

	
//	@Produces
//	public String getMessage()
//	{
//		return "Hello World";
//	}
	
	@Produces 
	//@ShortMessage
	@MyEvent(Type.LOGGING)
	public MessageA messageAFactory() {
		return new MessageA();
	}
	
	@Produces
	//@LongMessage
	@MyEvent(Type.MESSAGE)
	public MessageB messageBFactory() {
		return new MessageB();
	}
}
