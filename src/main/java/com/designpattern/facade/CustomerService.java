package com.designpattern.facade;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Stateless;

@Startup
@Stateless
public class CustomerService {
	private static  final  Logger LOGGER = Logger.getLogger("CustomerService");
	public long getCustomer(int sessionID) {
		// get logged in customer id
		return 100005L;
	}

	public boolean checkId(long x) {
		// check if customer id is valid
		return true;
	}	
	
	@PostConstruct
	public void start(){
		LOGGER.info("The bean "+ this.getClass().getName()+" is created ");
	}
}	
