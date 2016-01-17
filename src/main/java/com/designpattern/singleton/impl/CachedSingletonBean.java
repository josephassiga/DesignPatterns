/**
 * 
 */
package com.designpattern.singleton.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.DependsOn;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * @author jassiga
 *
 */
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@DependsOn({"MyLoggingBean","MyInitializationBean"})
@Singleton
@AccessTimeout(1200)
public class CachedSingletonBean {

	private Map<Integer, String> myCache;

	@PostConstruct
	public void start() {
		Logger.getLogger("MyGlobalLogger").info("Started creating bean : "+CachedSingletonBean.class.getName());
		myCache = new HashMap<Integer, String>();
	}

	@Lock(LockType.WRITE)
	@AccessTimeout(value=30,unit=TimeUnit.SECONDS)
	public void addUser(Integer id, String name) {
		myCache.put(id, name);
	}

	@Lock(LockType.READ)
	public String getName(Integer id) {
		return myCache.get(id);
	}

}
