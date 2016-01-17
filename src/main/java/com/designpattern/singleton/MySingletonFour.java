package com.designpattern.singleton;

/**
 * @author jassiga
 *
 */
public class MySingletonFour {
	
	private static MySingletonFour mySingleton;
	
	private MySingletonFour(){
		
	}

	public static MySingletonFour getInstance()
	{
		if(mySingleton == null)
		{
			mySingleton = new MySingletonFour();
		}
		return mySingleton;
	}
}
