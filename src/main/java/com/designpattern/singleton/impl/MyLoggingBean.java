package com.designpattern.singleton.impl;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * 
 * @author jassiga
 *
 */

@Startup
@Singleton
public class MyLoggingBean {

	private Logger logger;

	@PostConstruct
	public void start() {
		logger = Logger.getLogger("MyGlobalLogger");
		logger.info("Well, I started first!!!");
	}

	public void logInfo(String msg) {
		logger.info(msg);
	}

}
