package com.designpattern.dependencyinjection.impl;

import javax.inject.Named;

import com.designpattern.dependencyinjection.*;

@Named("UserDataRepositoryMongo")
public class UserDataRepositoryMongo implements UserDataRepository {

	@Override
	public void save(final User user) {	
		System.out.println("User saved well in Mongo DB !");
	}	

}
