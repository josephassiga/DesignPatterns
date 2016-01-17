package com.designpattern.singleton;

/**
 * @author jassiga
 *
 */
public class MySingletonTree {
	
	private static MySingletonTree mySingleton;
	
	private MySingletonTree(){
		
	}

	public static MySingletonTree getInstance()
	{
		if(mySingleton == null)
		{
			mySingleton = new MySingletonTree();
		}
		return mySingleton;
	}
}
