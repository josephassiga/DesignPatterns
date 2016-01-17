/**
 * 
 */
package com.designpattern.dependencyinjection;

import com.designpattern.dependencyinjection.impl.UserDataRepositoryImpl;

/**
 * @author jassiga
 *
 */
public class UserServiceFactory {
	
	public UserService getInstance(){
		return new UserService(new UserDataRepositoryImpl());	
	}

}
