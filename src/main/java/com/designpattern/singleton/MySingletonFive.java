package com.designpattern.singleton;

/**
 * @author jassiga
 *
 */
public class MySingletonFive {
	
	private static MySingletonFive mySingleton;
	
	private MySingletonFive(){
		
	}

	public static synchronized MySingletonFive getInstance()
	{
		if(mySingleton == null)
		{
			synchronized(MySingletonFive.class)
			{
				if(mySingleton == null)
				{
					mySingleton = new MySingletonFive();
				}
			}
		}
		return mySingleton;
	}
}
