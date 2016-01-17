/**
 * 
 */
package com.designpattern.dependencyinjection;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Named;

import com.designpattern.dependencyinjection.impl.UserDataRepositoryImpl;

/**
 * @author jassiga
 *
 */
@Startup
@Singleton
public class UserService {

	private Logger logger;
	
	@Inject
	@Named("UserDataRepositoryMongo")
	private UserDataRepository udr;

	@PostConstruct
	public void start() {
		logger = Logger.getLogger("MyGlobalLogger");
		logger.info("Well, bean "+UserService.class);
	}	
	
	public UserService() {
		this.udr = new UserDataRepositoryImpl();
	}
	
	public UserService(final UserDataRepository userDataRepository)
	{
		this.udr = userDataRepository;
	}
	
	public void persistUser(final User user)
	{
		udr.save(user);
	}
}
