package com.designpattern.singleton;

/**
 * @author jassiga
 *
 */
public class MySingletonTwo {
	
	private static MySingletonTwo mySingleton;
	
	private MySingletonTwo(){
		
	}

	public static MySingletonTwo getInstance()
	{
		if(mySingleton == null)
		{
			mySingleton = new MySingletonTwo();
		}
		return mySingleton;
	}
}
