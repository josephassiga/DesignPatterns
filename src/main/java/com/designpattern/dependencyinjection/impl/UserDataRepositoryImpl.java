package com.designpattern.dependencyinjection.impl;

import javax.inject.Named;

import com.designpattern.dependencyinjection.*;

@Named("UserDataRepositoryImpl")
public class UserDataRepositoryImpl implements UserDataRepository {

	@Override
	public void save(final User user) {	
		System.out.println("User saved well !");
	}	

}
