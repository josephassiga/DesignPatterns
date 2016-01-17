package com.designpattern.singleton;

/**
 * @author jassiga
 *
 */
public class MySingletonOne {
	
	private static MySingletonOne mySingleton = null;
	
	static{
		mySingleton = new MySingletonOne();
	}
	
	private MySingletonOne(){
		
	}

	public static synchronized MySingletonOne getInstance()
	{
		return mySingleton;
	}
}
